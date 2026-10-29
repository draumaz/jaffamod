package tk.erekohn.mods;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemDough extends Item
{
    public ItemDough(int var1)
    {
        super(var1);
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setIconIndex(9);
    }

    public String getTextureFile()
    {
        return "/jaffa/items.png";
    }
}
