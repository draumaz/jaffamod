package tk.erekohn.mods;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemFood;

public class ItemChocolateApple extends ItemFood
{
    public ItemChocolateApple(int var1)
    {
        super(984, 5, 1.0F, false);
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabs.tabFood);
        this.setIconIndex(5);
    }

    public String getTextureFile()
    {
        return "/jaffa/items.png";
    }
}
