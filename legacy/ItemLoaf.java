package tk.erekohn.mods;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemFood;

public class ItemLoaf extends ItemFood
{
    public ItemLoaf(int var1)
    {
        super(990, 3, 1.0F, false);
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabs.tabFood);
        this.setIconIndex(10);
    }

    public String getTextureFile()
    {
        return "/jaffa/items.png";
    }
}
