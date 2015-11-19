package net.exampleplugin;

import net.torch.plugin.MinecraftPlugin;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * A example plugin's main class.
 */
public class PluginMain implements MinecraftPlugin{
    final Logger logger = LogManager.getLogger(); // good practice to log
    @Override
    public void enabled() {
        logger.info("Plugin is enabled!");
    }

    @Override
    public void disabled() {
        logger.info("Plugin is disabled!");
    }
}
