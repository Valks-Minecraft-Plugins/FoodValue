package com.foodvalue;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.foodvalue.listeners.ListenerConsume;
import com.foodvalue.listeners.utils.Utils;

public class FoodValue extends JavaPlugin {
	public static FoodValue plugin;
	
	private File foodValueConfigFile = new File(getDataFolder(), "food.yml");
	private FileConfiguration foodValueConfig = YamlConfiguration.loadConfiguration(foodValueConfigFile);
	
	@Override
	public void onEnable() {
		plugin = this;
		registerListeners();
		registerFoodConfig();
	}
	
	private void registerListeners() {
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new ListenerConsume(), this);
	}
	
	private void registerFoodConfig() {
		Utils.setConfigValue(foodValueConfig, "food.defaultvalue", 2);
		
		List<String> foods = new ArrayList<String>();
		foods.add("APPLE");
		foods.add("MUSHROOM_SOUP");
		foods.add("BREAD");
		foods.add("PORK");
		foods.add("GRILLED_PORK");
		foods.add("GOLDEN_APPLE");
		foods.add("RAW_FISH");
		foods.add("COOKED_FISH");
		foods.add("COOKIE");
		foods.add("MELON");
		foods.add("RAW_BEEF");
		foods.add("COOKED_BEEF");
		foods.add("RAW_CHICKEN");
		foods.add("COOKED_CHICKEN");
		foods.add("ROTTEN_FLESH");
		foods.add("SPIDER_EYE");
		foods.add("CARROT");
		foods.add("POTATO");
		foods.add("BAKED_POTATO");
		foods.add("POISONOUS_POTATO");
		foods.add("PUMPKIN_PIE");
		foods.add("RABBIT");
		foods.add("COOKED_RABBIT");
		foods.add("RABBIT_STEW");
		foods.add("MUTTON");
		foods.add("COOKED_MUTTON");
		Utils.setConfigValue(foodValueConfig, "food.foods", foods);
		
		for (String element : foods) {
			Utils.setConfigValue(foodValueConfig, "food." + element.toLowerCase() + ".value", new Random().nextInt(5) + 1);
		}
		
		saveFoodConfig();
	}
	
	public void saveFoodConfig() {
		try {
			foodValueConfig.save(foodValueConfigFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public FileConfiguration getFoodConfig() {
		return foodValueConfig;
	}
}
