package com.fgsoftwarestudio.dragonquest.registry;

import com.fgsoftwarestudio.dragonquest.Reference;
import com.fgsoftwarestudio.dragonquest.init.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "test_item"), Items.TEST_ITEM);
    }
}