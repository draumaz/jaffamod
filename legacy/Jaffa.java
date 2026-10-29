package tk.erekohn.mods;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.Achievement;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

@Mod(
        modid = "jaffa",
        name = "Jaffa Cakes",
        version = "[1.4.4]"
)
@NetworkMod(
        clientSideRequired = true,
        serverSideRequired = false
)
public class Jaffa
{
    @Instance("Jaffa")
    public static Jaffa instance;
    @SidedProxy(
            clientSide = "tk.erekohn.mods.ClientProxyJaffa",
            serverSide = "tk.erekohn.mods.CommonProxyJaffa"
    )
    public static CommonProxyJaffa proxy;
    

    @PreInit
    public void PreInit(FMLPreInitializationEvent var1)
    {
        System.out.println("Jaffa Cakes Loaded!");
    }

    @Init
    public void Init(FMLInitializationEvent var1)
    {
        Item var2 = (new ItemOrangeJaffa(980)).setIconIndex(1).setItemName("OrangeJaffa");
        Item var3 = (new ItemAppleJaffa(981)).setIconIndex(0).setItemName("AppleJaffa");
        Item var4 = (new ItemLimeJaffa(986)).setIconIndex(2).setItemName("LimeJaffa");
        Item var5 = (new ItemOrange(982)).setIconIndex(3).setItemName("Orange");
        Item var6 = (new ItemLime(987)).setIconIndex(8).setItemName("Lime");
        Item var7 = (new ItemChocolateOrange(983)).setIconIndex(7).setItemName("ChocolateOrange");
        Item var8 = (new ItemChocolateApple(984)).setIconIndex(5).setItemName("ChocolateApple");
        Item var9 = (new ItemChocolateBar(985)).setIconIndex(4).setItemName("ChocolateBar");
        Item var10 = (new ItemChocolateLime(988)).setIconIndex(6).setItemName("ChocolateLime");
        Item var11 = (new ItemDough(989)).setIconIndex(10).setItemName("Dough");
        Item var12 = (new ItemLoaf(990)).setIconIndex(11).setItemName("Loaf");
        Achievement var13 = (new Achievement(6000, "Jaffa Cook", 4, 9, var12, (Achievement)null)).registerAchievement();
        GameRegistry.addRecipe(new ItemStack(var9, 6), new Object[] {"XXX", 'X', new ItemStack(Item.dyePowder, 1, 3)});
        GameRegistry.addRecipe(new ItemStack(var8, 1), new Object[] {"XO", 'X', Item.appleRed, 'O', var9});
        GameRegistry.addRecipe(new ItemStack(var7, 1), new Object[] {"XO", 'X', var5, 'O', var9});
        GameRegistry.addRecipe(new ItemStack(var10, 1), new Object[] {"XO", 'X', var6, 'O', var9});
        GameRegistry.addRecipe(new ItemStack(var5, 1), new Object[] {"XO", 'X', Item.appleRed, 'O', new ItemStack(Item.dyePowder, 1, 14)});
        GameRegistry.addRecipe(new ItemStack(var6, 1), new Object[] {"XO", 'O', new ItemStack(Item.dyePowder, 1, 10), 'X', Item.appleRed});
        GameRegistry.addRecipe(new ItemStack(var2, 1), new Object[] {"XOX", 'X', var12, 'O', var7});
        GameRegistry.addRecipe(new ItemStack(var3, 1), new Object[] {"XOX", 'X', var12, 'O', var8});
        GameRegistry.addRecipe(new ItemStack(var4, 1), new Object[] {"XOX", 'X', var12, 'O', var10});
        GameRegistry.addRecipe(new ItemStack(var11, 2), new Object[] {"XOX", 'X', Item.wheat, 'O', Item.bucketMilk});
        GameRegistry.addSmelting(var11.shiftedIndex, new ItemStack(var12, 1), 2.0F);
        LanguageRegistry.addName(var2, "Orange Jaffa");
        LanguageRegistry.addName(var3, "Apple Jaffa");
        LanguageRegistry.addName(var4, "Lime Jaffa");
        LanguageRegistry.addName(var5, "Orange");
        LanguageRegistry.addName(var6, "Lime");
        LanguageRegistry.addName(var7, "Chocolate Orange");
        LanguageRegistry.addName(var8, "Chocolate Apple");
        LanguageRegistry.addName(var9, "Chocolate Bar");
        LanguageRegistry.addName(var10, "Chocolate Lime");
        LanguageRegistry.addName(var11, "Dough");
        LanguageRegistry.addName(var12, "Loaf");
    }
}
