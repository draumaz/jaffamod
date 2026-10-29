package tk.erekohn.mods;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemFood;

public class ItemLime extends ItemFood
{
    public ItemLime(int var1)
    {
        super(987, 3, 1.0F, false);
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setIconIndex(8);
    }

    public String getTextureFile()
    {
        return "/jaffa/items.png";
    }
}
