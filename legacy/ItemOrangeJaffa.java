package tk.erekohn.mods;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemFood;

public class ItemOrangeJaffa extends ItemFood
{
    public ItemOrangeJaffa(int var1)
    {
        super(980, 10, 1.0F, false);
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabs.tabFood);
        this.setIconIndex(1);
    }

    public String getTextureFile()
    {
        return "/jaffa/items.png";
    }
}
