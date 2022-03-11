import json
from pathlib import Path


patterns = {
    'machete': [
        "## ",
        " # ",
        " | "
    ],
    'scythe': [
        "###",
        "  |",
        "  |"
    ]
}

base_recipes = {
    'crafting': {
        "type": "minecraft:crafting_shaped",
        "key": {},
        "result": {}
    },
    'smithing': {
        "type": "minecraft:smithing",
        "base": {},
        "addition": {},
        "result": {}
    }
}

recipes = [
    {'type': 'crafting', 'item': 'harvest_scythes:wooden', 'material': '#minecraft:planks', 'rod': '#c:wood_sticks'},
    {'type': 'crafting', 'item': 'harvest_scythes:stone', 'material': 'minecraft:cobblestone', 'rod': '#c:wood_sticks'},
    {'type': 'crafting', 'item': 'harvest_scythes:iron', 'material': 'minecraft:iron_ingot', 'rod': '#c:wood_sticks'},
    {'type': 'crafting', 'item': 'harvest_scythes:golden', 'material': 'minecraft:gold_ingot', 'rod': '#c:wood_sticks'},
    {'type': 'crafting', 'item': 'harvest_scythes:diamond', 'material': 'minecraft:diamond', 'rod': '#c:wood_sticks'},

    {'type': 'crafting', 'item': 'harvest_scythes:adamantite', 'material': '#c:adamantite_ingots', 'rod': '#c:wood_sticks', 'requires': ['mythicmetals']},
    {'type': 'crafting', 'item': 'harvest_scythes:aquarium', 'material': '#mythicmetals:aquarium_ingots', 'rod': '#c:wood_sticks', 'requires': ['mythicmetals']},
    {'type': 'crafting', 'item': 'harvest_scythes:banglum', 'material': '#mythicmetals:banglum_ingots', 'rod': '#c:wood_sticks', 'requires': ['mythicmetals']},
    {'type': 'crafting', 'item': 'harvest_scythes:bronze', 'material': '#c:bronze_ingots', 'rod': '#c:wood_sticks', 'requires': ['mythicmetals']},
    {'type': 'crafting', 'item': 'harvest_scythes:carmot', 'material': '#mythicmetals:carmot_ingots', 'rod': '#c:wood_sticks', 'requires': ['mythicmetals']},
    {'type': 'crafting', 'item': 'harvest_scythes:copper', 'material': '#c:copper_ingots', 'rod': '#c:wood_sticks', 'requires': ['mythicmetals']},
    {'type': 'crafting', 'item': 'harvest_scythes:durasteel', 'material': '#mythicmetals:durasteel_ingots', 'rod': '#c:wood_sticks', 'requires': ['mythicmetals']},
    {'type': 'crafting', 'item': 'harvest_scythes:hallowed', 'material': 'mythicmetals:hallowed_ingot', 'rod': '#c:wood_sticks', 'requires': ['mythicmetals']},
    {'type': 'crafting', 'item': 'harvest_scythes:kyber', 'material': '#mythicmetals:kyber_ingots', 'rod': '#c:wood_sticks', 'requires': ['mythicmetals']},
    {'type': 'crafting', 'item': 'harvest_scythes:mythril', 'material': '#c:mythril_ingots', 'rod': '#c:wood_sticks', 'requires': ['mythicmetals']},
    {'type': 'crafting', 'item': 'harvest_scythes:orichalcum', 'material': '#c:orichalcum_ingots', 'rod': '#c:wood_sticks', 'requires': ['mythicmetals']},
    {'type': 'crafting', 'item': 'harvest_scythes:osmium', 'material': '#c:osmium_ingots', 'rod': '#c:wood_sticks', 'requires': ['mythicmetals']},
    {'type': 'crafting', 'item': 'harvest_scythes:palladium', 'material': '#c:palladium_ingots', 'rod': '#c:wood_sticks', 'requires': ['mythicmetals']},
    {'type': 'crafting', 'item': 'harvest_scythes:prometheum', 'material': '#mythicmetals:prometheum_ingots', 'rod': '#c:wood_sticks', 'requires': ['mythicmetals']},
    {'type': 'crafting', 'item': 'harvest_scythes:quadrillum', 'material': '#mythicmetals:quadrillum_ingots', 'rod': '#c:wood_sticks', 'requires': ['mythicmetals']},
    {'type': 'crafting', 'item': 'harvest_scythes:runite', 'material': '#mythicmetals:runite_ingots', 'rod': '#c:wood_sticks', 'requires': ['mythicmetals']},
    {'type': 'crafting', 'item': 'harvest_scythes:star_platinum', 'material': '#mythicmetals:star_platinum', 'rod': '#c:wood_sticks', 'requires': ['mythicmetals']},
    {'type': 'crafting', 'item': 'harvest_scythes:stormyx', 'material': '#mythicmetals:stormyx_ingots', 'rod': '#c:wood_sticks', 'requires': ['mythicmetals']},

    {'type': 'crafting', 'item': 'harvest_scythes:gobber2', 'material': 'gobber2:gobber2_ingot', 'rod': 'gobber2:gobber2_rod', 'requires': ['gobber2']},
    {'type': 'crafting', 'item': 'harvest_scythes:gobber2_nether', 'material': 'gobber2:gobber2_ingot_nether', 'rod': 'gobber2:gobber2_rod_nether', 'requires': ['gobber2']},
    {'type': 'crafting', 'item': 'harvest_scythes:gobber2_end', 'material': 'gobber2:gobber2_ingot_end', 'rod': 'gobber2:gobber2_rod_end', 'requires': ['gobber2']},

    {'type': 'crafting', 'item': 'harvest_scythes:diamold', 'material': 'diamold:diamold_ingot', 'rod': '#c:wood_sticks', 'requires': ['diamold']},

    {'type': 'crafting', 'item': 'harvest_scythes:flint', 'material': 'earlygame:flint_shard', 'rod': '#c:wood_sticks', 'requires': ['earlygame']},
    {'type': 'crafting', 'item': 'harvest_scythes:copper', 'material': '#c:copper_ingots', 'rod': '#c:wood_sticks', 'requires': ['earlygame']},

    {'type': 'crafting', 'item': 'harvest_scythes:elven_silver', 'material': 'fantasycraft:silver_ingot', 'rod': 'fantasycraft:stone_rod', 'requires': ['fantasycraft']},
    {'type': 'crafting', 'item': 'harvest_scythes:dwarven_bronze', 'material': 'fantasycraft:bronze_ingot', 'rod': 'fantasycraft:stone_rod', 'requires': ['fantasycraft']},
    {'type': 'crafting', 'item': 'harvest_scythes:triton_prismarine', 'material': 'fantasycraft:prismarine_ingot', 'rod': 'fantasycraft:stone_rod', 'requires': ['fantasycraft']},

    {'type': 'crafting', 'item': 'harvest_scythes:gravitite', 'material': 'the_aether:gravitite_gemstone', 'rod': '#c:wood_sticks', 'requires': ['the_aether']},
    {'type': 'crafting', 'item': 'harvest_scythes:zanite', 'material': 'the_aether:zanite_gemstone', 'rod': '#c:wood_sticks', 'requires': ['the_aether']},

    {'type': 'crafting', 'item': 'harvest_scythes:batet', 'material': 'hellish-materials:batet_gem', 'rod': '#c:wood_sticks', 'requires': ['hellish-materials']},
    {'type': 'crafting', 'item': 'harvest_scythes:luss', 'material': 'hellish-materials:luss_ingot', 'rod': '#c:wood_sticks', 'requires': ['hellish-materials']},

    {'type': 'crafting', 'item': 'harvest_scythes:luxore', 'material': 'luxore:luxore_ingot', 'rod': '#c:wood_sticks', 'requires': ['luxore']},

    {'type': 'crafting', 'item': 'harvest_scythes:alexandrite', 'material': '#c:alexandrite', 'rod': '#c:wood_sticks', 'requires': ['more_gems']},
    {'type': 'crafting', 'item': 'harvest_scythes:kunzite', 'material': '#c:kunzite', 'rod': '#c:wood_sticks', 'requires': ['more_gems']},
    {'type': 'crafting', 'item': 'harvest_scythes:carbonado', 'material': '#c:carbonado', 'rod': '#c:wood_sticks', 'requires': ['more_gems']},
    {'type': 'crafting', 'item': 'harvest_scythes:citrine', 'material': '#c:citrine', 'rod': '#c:wood_sticks', 'requires': ['more_gems']},
    {'type': 'crafting', 'item': 'harvest_scythes:corundum', 'material': '#c:corundum', 'rod': '#c:wood_sticks', 'requires': ['more_gems']},
    {'type': 'crafting', 'item': 'harvest_scythes:moissanite', 'material': '#c:moissanite', 'rod': '#c:wood_sticks', 'requires': ['more_gems']},
    {'type': 'crafting', 'item': 'harvest_scythes:spinel', 'material': '#c:rubies', 'rod': '#c:wood_sticks', 'requires': ['more_gems']},
    {'type': 'crafting', 'item': 'harvest_scythes:sapphire', 'material': '#c:sapphire', 'rod': '#c:wood_sticks', 'requires': ['more_gems']},
    {'type': 'crafting', 'item': 'harvest_scythes:topaz', 'material': '#c:topaz', 'rod': '#c:wood_sticks', 'requires': ['more_gems']},
    {'type': 'crafting', 'item': 'harvest_scythes:tourmaline', 'material': '#c:tourmaline', 'rod': '#c:wood_sticks', 'requires': ['more_gems']},

    {'type': 'crafting', 'item': 'harvest_scythes:peridot', 'material': '#c:peridot_gems', 'rod': '#c:wood_sticks', 'requires': ['techreborn']},
    {'type': 'crafting', 'item': 'harvest_scythes:sapphire', 'material': '#c:sapphires', 'rod': '#c:wood_sticks', 'filename': 'tr_sapphire', 'requires': ['techreborn']},
    {'type': 'crafting', 'item': 'harvest_scythes:ruby', 'material': '#c:rubies', 'rod': '#c:wood_sticks', 'filename': 'tr_ruby', 'requires': ['techreborn']},
    {'type': 'crafting', 'item': 'harvest_scythes:bronze', 'material': '#c:bronze_ingots', 'rod': '#c:wood_sticks', 'requires': ['techreborn']},

    {'type': 'crafting', 'item': 'harvest_scythes:iron', 'material': 'pigsteel:pigsteel_ingot', 'rod': '#c:wood_sticks', 'filename': 'ps_iron', 'requires': ['pigsteel']},

    {'type': 'crafting', 'item': 'harvest_scythes:adb_adamantium', 'material': 'adabraniummod:adamantium_ingot', 'rod': 'adabraniummod:adamantium_rod', 'requires': ['adabraniummod']},
    {'type': 'crafting', 'item': 'harvest_scythes:adb_vibranium', 'material': 'adabraniummod:vibranium_ingot', 'rod': 'adabraniummod:obsidian_rod', 'requires': ['adabraniummod']},



    {'type': 'smithing', 'item': 'harvest_scythes:netherite', 'material': 'minecraft:netherite_ingot', 'from': 'harvest_scythes:diamond'},

    {'type': 'smithing', 'item': 'harvest_scythes:celestium', 'material': 'mythicmetals:celestium_ingot', 'from': 'harvest_scythes:diamond', 'requires': ['mythicmetals']},
    {'type': 'smithing', 'item': 'harvest_scythes:metallurgium', 'material': 'mythicmetals:metallurgium_ingot', 'from': 'harvest_scythes:netherite', 'requires': ['mythicmetals']},

    {'type': 'smithing', 'item': 'harvest_scythes:dragon', 'material': 'dragonloot:dragon_scale', 'from': 'harvest_scythes:netherite', 'requires': ['dragonloot']},

    {'type': 'smithing', 'item': 'harvest_scythes:mithril', 'material': 'fantasycraft:mithril_ingot', 'from': 'harvest_scythes:netherite', 'requires': ['fantasycraft']},

    {'type': 'smithing', 'item': 'harvest_scythes:vuld', 'material': 'hellish-materials:vuld', 'from': 'harvest_scythes:diamond', 'requires': ['hellish-materials']},

    {'type': 'smithing', 'item': 'harvest_scythes:adb_nether', 'material': 'minecraft:nether_brick', 'from': 'harvest_scythes:iron', 'requires': ['adabraniummod']},

    {'type': 'smithing', 'item': 'harvest_scythes:platinum', 'material': 'simplyplatinum:platinum_ingot', 'from': 'harvest_scythes:golden', 'filename': 'sp_platinum', 'requires': ['simplyplatinum']},
]


def item_or_tag(item):
    return {'tag': item[1:]} if item.startswith('#') else {'item': item}

for recipe in recipes:
    base = base_recipes[recipe['type']].copy()
    recipe_types = recipe['recipe_for'] if 'recipe_for' in recipe else ('scythe', 'machete')
    for recipe_type in recipe_types:
        Path(__file__).parent.joinpath(f"recipes/{recipe_type}s").mkdir(parents=True, exist_ok=True)
        if 'requires' in recipe:
            base['fabric:load_conditions'] = [
                {
                    "condition": "fabric:any_mod_loaded",
                    "values": recipe['requires']
                }
            ]
        base['result'] = {'item': f"{recipe['item']}_{recipe_type}"}
        if recipe['type'] == 'crafting':
            base['pattern'] = patterns[recipe_type]
            base['key']['#'] = item_or_tag(recipe['material'])
            base['key']['|'] = item_or_tag(recipe['rod'])
            base['result']['count'] = 1
        elif recipe['type'] == 'smithing':
            base['addition'] = item_or_tag(recipe['material'])
            base['base'] = item_or_tag(f"{recipe['from']}_{recipe_type}")
        else:
            continue

        filename = recipe['filename'] if 'filename' in recipe else f"{recipe['item'].split(':')[1]}"
        filename = f"{filename}_{recipe_type}.json"
        with Path(__file__).parent.joinpath(f"recipes/{recipe_type}s/{filename}").open('w') as f:
            f.write(json.dumps(base, indent=2))
