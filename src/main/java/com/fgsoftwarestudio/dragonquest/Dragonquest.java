package com.fgsoftwarestudio.dragonquest;

import com.fgsoftwarestudio.dragonquest.registry.ItemRegistry;
import net.fabricmc.api.ModInitializer;

import static com.fgsoftwarestudio.dragonquest.Reference.LOGGER;

public class Dragonquest implements ModInitializer {
    @Override
    public void onInitialize() {
        LOGGER.info("SETUP");
        ItemRegistry.registerItems();
        LOGGER.info("ITEMS REGISTERED");
    }
}
