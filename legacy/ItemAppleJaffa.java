package tk.erekohn.mods;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemFood;

public class ItemAppleJaffa extends ItemFood
{
    public ItemAppleJaffa(int var1)
    {
        super(981, 10, 1.0F, false);
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setIconIndex(0);
    }

    public String getTextureFile()
    {
        return "/jaffa/items.png";
    }
}
