package tk.erekohn.mods;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemFood;

public class ItemChocolateOrange extends ItemFood
{
    public ItemChocolateOrange(int var1)
    {
        super(983, 5, 1.0F, false);
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabs.tabFood);
        this.setIconIndex(7);
    }

    public String getTextureFile()
    {
        return "/jaffa/items.png";
    }
}
