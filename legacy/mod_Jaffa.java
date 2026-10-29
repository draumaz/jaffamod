package net.minecraft.src;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "Erekohn_JaffaCakes", name = "Jaffa Cakes", version = "1.4.2")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class mod_Jaffa extends BaseMod
{
	@Init
	public void load(FMLInitializationEvent event)
	{
		
	}
	
    public static final Item OrangeJaffa = (new ItemFood(980, 10, 1.0F, false)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/jaffa/orangecake.png")).setItemName("OrangeJaffa");
    public static final Item AppleJaffa = (new ItemFood(981, 10, 1.0F, false)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/jaffa/applecake.png")).setItemName("AppleJaffa");
    public static final Item LimeJaffa = (new ItemFood(986, 10, 1.0F, false)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/jaffa/limecake.png")).setItemName("LimeJaffa");
    public static final Item Orange = (new ItemFood(982, 3, 1.0F, false)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/jaffa/orange.png")).setItemName("Orange");
    public static final Item Lime = (new ItemFood(987, 3, 1.0F, false)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/jaffa/lime.png")).setItemName("Lime");
    public static final Item ChocolateOrange = (new ItemFood(983, 5, 1.0F, false)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/jaffa/chocolate_orange.png")).setItemName("ChocolateOrange");
    public static final Item ChocolateApple = (new ItemFood(984, 5, 1.0F, false)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/jaffa/chocolate_apple.png")).setItemName("ChocolateApple");
    public static final Item ChocolateBar = (new ItemFood(985, 1, 1.0F, false)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/jaffa/chocolate_bar.png")).setItemName("ChocolateBar");
    public static final Item ChocolateLime = (new ItemFood(988, 1, 1.0F, false)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/jaffa/chocolate_lime.png")).setItemName("ChocolateLime");
    public static final Item Dough = (new ItemFood(989, 3, 1.0F, false)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/jaffa/dough.png")).setItemName("Dough");
    public static final Item Loaf = (new ItemFood(990, 3, 1.0F, false)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/jaffa/loaf.png")).setItemName("Loaf");
    public static final Achievement makeJaffa = (new Achievement(6000, "Jaffa Cook", 4, 9, Loaf, (Achievement)null)).registerAchievement();

	
    public String getVersion()
    {
        return "1.4.2";
    }

    public void load()
    {
        ModLoader.addName(OrangeJaffa, "Orange Jaffa");
        ModLoader.addName(AppleJaffa, "Apple Jaffa");
        ModLoader.addName(LimeJaffa, "Lime Jaffa");
        ModLoader.addName(Orange, "Orange");
        ModLoader.addName(Lime, "Lime");
        ModLoader.addName(ChocolateOrange, "Chocolate Orange");
        ModLoader.addName(ChocolateApple, "Chocolate Apple");
        ModLoader.addName(ChocolateBar, "Chocolate Bar");
        ModLoader.addName(ChocolateLime, "Chocolate Lime");
        ModLoader.addName(Dough, "Jaffa Dough");
        ModLoader.addName(Loaf, "Jaffa Bread");
        ModLoader.addRecipe(new ItemStack(ChocolateBar, 6), new Object[] {"XXX", 'X', new ItemStack(Item.dyePowder, 1, 3)});
        ModLoader.addRecipe(new ItemStack(ChocolateApple, 1), new Object[] {"XO", 'X', Item.appleRed, 'O', ChocolateBar});
        ModLoader.addRecipe(new ItemStack(ChocolateOrange, 1), new Object[] {"XO", 'X', Orange, 'O', ChocolateBar});
        ModLoader.addRecipe(new ItemStack(ChocolateLime, 1), new Object[] {"XO", 'X', Lime, 'O', ChocolateBar});
        ModLoader.addRecipe(new ItemStack(Orange, 1), new Object[] {"XO", 'X', Item.appleRed, 'O', new ItemStack(Item.dyePowder, 1, 14)});
        ModLoader.addRecipe(new ItemStack(Lime, 1), new Object[] {"XO", 'O', new ItemStack(Item.dyePowder, 1, 10), 'X', Item.appleRed});
        ModLoader.addRecipe(new ItemStack(OrangeJaffa, 1), new Object[] {"XOX", 'X', Loaf, 'O', ChocolateOrange});
        ModLoader.addRecipe(new ItemStack(AppleJaffa, 1), new Object[] {"XOX", 'X', Loaf, 'O', ChocolateApple});
        ModLoader.addRecipe(new ItemStack(LimeJaffa, 1), new Object[] {"XOX", 'X', Loaf, 'O', ChocolateLime});
        ModLoader.addRecipe(new ItemStack(Dough, 2), new Object[] {"XOX", 'X', Item.wheat, 'O', Item.bucketMilk});
        ModLoader.addSmelting(Dough.shiftedIndex, new ItemStack(Loaf, 1), 2.0F);
        ModLoader.addAchievementDesc(makeJaffa, "I MAEK JAFFA", "A different kind of bread.");
    	
    }
}
