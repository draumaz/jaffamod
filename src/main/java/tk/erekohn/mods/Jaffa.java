package tk.erekohn.mods;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Jaffa Cakes!
 *
 * Originally a Forge mod for Minecraft 1.4.4 (November 2012). Recipes, the smelting
 * recipe and the "Jaffa Cook" achievement now live as data files under
 * src/main/resources/data/jaffa, and item names under assets/jaffa/lang.
 */
public class Jaffa implements ModInitializer
{
    public static final String MOD_ID = "jaffa";
    public static final Logger LOGGER = LoggerFactory.getLogger("Jaffa Cakes");

    // The cakes themselves
    public static final Item ORANGE_JAFFA = food("orange_jaffa", 10);
    public static final Item APPLE_JAFFA = food("apple_jaffa", 10);
    public static final Item LIME_JAFFA = food("lime_jaffa", 10);

    // Fruit
    public static final Item ORANGE = food("orange", 3);
    public static final Item LIME = food("lime", 3);

    // Chocolate
    public static final Item CHOCOLATE_ORANGE = food("chocolate_orange", 5);
    public static final Item CHOCOLATE_APPLE = food("chocolate_apple", 5);
    public static final Item CHOCOLATE_BAR = food("chocolate_bar", 1);
    public static final Item CHOCOLATE_LIME = food("chocolate_lime", 1);

    // A different kind of bread
    public static final Item DOUGH = item("dough", new Item.Properties());
    public static final Item LOAF = food("loaf", 3);

    @Override
    public void onInitialize()
    {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(output -> {
            output.accept(ORANGE);
            output.accept(LIME);
            output.accept(CHOCOLATE_BAR);
            output.accept(CHOCOLATE_APPLE);
            output.accept(CHOCOLATE_ORANGE);
            output.accept(CHOCOLATE_LIME);
            output.accept(LOAF);
            output.accept(APPLE_JAFFA);
            output.accept(ORANGE_JAFFA);
            output.accept(LIME_JAFFA);
        });
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> output.accept(DOUGH));

        LOGGER.info("Jaffa Cakes Loaded!");
    }

    /** Equivalent of the old {@code new ItemFood(id, healAmount, 1.0F, false)}. */
    private static Item food(String name, int nutrition)
    {
        FoodProperties food = new FoodProperties.Builder().nutrition(nutrition).saturationModifier(1.0F).build();
        return item(name, new Item.Properties().food(food));
    }

    private static Item item(String name, Item.Properties properties)
    {
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, name));
        return Registry.register(BuiltInRegistries.ITEM, key, new Item(properties.setId(key)));
    }
}
