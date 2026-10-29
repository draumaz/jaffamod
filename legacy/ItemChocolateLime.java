package tk.erekohn.mods;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemFood;

public class ItemChocolateLime extends ItemFood
{
    public ItemChocolateLime(int var1)
    {
        super(988, 1, 1.0F, false);
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabs.tabFood);
        this.setIconIndex(6);
    }

    public String getTextureFile()
    {
        return "/jaffa/items.png";
    }
}
