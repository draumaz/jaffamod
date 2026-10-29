package tk.erekohn.mods;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemFood;

public class ItemLimeJaffa extends ItemFood
{
    public ItemLimeJaffa(int var1)
    {
        super(986, 10, 1.0F, false);
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabs.tabFood);
        this.setIconIndex(2);
    }

    public String getTextureFile()
    {
        return "/jaffa/items.png";
    }
}
