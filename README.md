# FoodValue

Download [here](https://github.com/valkyrienyanko/FoodValue/releases).

FoodValue is a plugin that allows you to modifiy any food items saturatiob value. All config food saturation values are random upon config generation. If you want new random values, just remove the foods in the config and reload your server.

### Configuration Tutorial

```yml
food:
  defaultvalue: 4 # If you didn't configure a food it will be set to this default value.
  foods: # The foods you want to configure.
  - APPLE
  - MUSHROOM_SOUP
  apple:
    value: 5 # The food saturation given on consume event.
  mushroom_soup:
    value: 1
```

<details><summary>Config Preview (Click to Expand)</summary>
<p>

#### food.yml

```yml
food:
  defaultvalue: 2
  foods:
  - APPLE
  - MUSHROOM_SOUP
  - BREAD
  - PORK
  - GRILLED_PORK
  - GOLDEN_APPLE
  - RAW_FISH
  - COOKED_FISH
  - COOKIE
  - MELON
  - RAW_BEEF
  - COOKED_BEEF
  - RAW_CHICKEN
  - COOKED_CHICKEN
  - ROTTEN_FLESH
  - SPIDER_EYE
  - CARROT
  - POTATO
  - BAKED_POTATO
  - POISONOUS_POTATO
  - PUMPKIN_PIE
  - RABBIT
  - COOKED_RABBIT
  - RABBIT_STEW
  - MUTTON
  - COOKED_MUTTON
  apple:
    value: 5
  mushroom_soup:
    value: 1
  bread:
    value: 3
  pork:
    value: 5
  grilled_pork:
    value: 5
  golden_apple:
    value: 2
  raw_fish:
    value: 1
  cooked_fish:
    value: 1
  cookie:
    value: 1
  melon:
    value: 3
  raw_beef:
    value: 2
  cooked_beef:
    value: 3
  raw_chicken:
    value: 1
  cooked_chicken:
    value: 2
  rotten_flesh:
    value: 4
  spider_eye:
    value: 5
  carrot:
    value: 5
  potato:
    value: 3
  baked_potato:
    value: 3
  poisonous_potato:
    value: 5
  pumpkin_pie:
    value: 3
  rabbit:
    value: 5
  cooked_rabbit:
    value: 2
  rabbit_stew:
    value: 3
  mutton:
    value: 5
  cooked_mutton:
    value: 2
```
</p>
</details>
