package tk.erekohn.mods;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemFood;

public class ItemChocolateBar extends ItemFood
{
    public ItemChocolateBar(int var1)
    {
        super(985, 1, 1.0F, false);
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabs.tabFood);
        this.setIconIndex(4);
    }

    public String getTextureFile()
    {
        return "/jaffa/items.png";
    }
}
