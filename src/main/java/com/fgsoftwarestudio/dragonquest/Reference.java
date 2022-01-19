package com.fgsoftwarestudio.dragonquest;

import com.fgsoftwarestudio.dragonquest.init.Items;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Reference {
    public static final String MOD_ID = "dragonquest";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public static final ItemGroup ITEM_GROUP =
            FabricItemGroupBuilder.create(
                    new Identifier(MOD_ID, "general"))
            .icon(() -> new ItemStack(Items.TEST_ITEM))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(Items.TEST_ITEM));
            }).build();
}
