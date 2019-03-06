package com.foodvalue.listeners;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import com.foodvalue.FoodValue;

public class ListenerConsume implements Listener {
	@EventHandler
	private void playerFoodConsumeEvent(PlayerItemConsumeEvent e) {
		Player p = e.getPlayer();
		EntityEquipment equip = p.getEquipment();
		ItemStack foodItem = equip.getItemInHand();
		
		int foodLevel = p.getFoodLevel();
		
		FileConfiguration config = FoodValue.plugin.getFoodConfig();
		
		int amount;
		if (config.isSet("food." + foodItem.getType().name().toLowerCase() + ".value"))
			amount = config.getInt("food." + foodItem.getType().name().toLowerCase() + ".value");
		else
			amount = config.getInt("food.defaultvalue");
		
		foodItem.setAmount(foodItem.getAmount() - 1);
		equip.setItemInHand(foodItem);
		
		new BukkitRunnable() {
			@Override
			public void run() {
				p.setFoodLevel(foodLevel + amount);
			}
		}.runTaskLater(FoodValue.plugin, 1);
	}
}
