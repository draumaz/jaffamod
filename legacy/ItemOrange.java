package tk.erekohn.mods;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemFood;

public class ItemOrange extends ItemFood
{
    public ItemOrange(int var1)
    {
        super(982, 3, 1.0F, false);
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabs.tabFood);
        this.setIconIndex(3);
    }

    public String getTextureFile()
    {
        return "/jaffa/items.png";
    }
}
