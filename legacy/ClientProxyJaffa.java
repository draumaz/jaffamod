package tk.erekohn.mods;

import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxyJaffa extends CommonProxyJaffa
{
    public void registerRenderThings()
    {
        MinecraftForgeClient.preloadTexture("/jaffa/items.png");
    }
}
