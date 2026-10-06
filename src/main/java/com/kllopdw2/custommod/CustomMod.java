package com.kllopdw2.custommod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public
class CustomMod implements ModInitializer {
    public static final String MOD_ID = "custommod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Block CUSTOM_BLOCK = new Block(BlockBehaviour.Properties.of(Material.STONE));
    public static final Item CUSTOM_ITEM = new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC));

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Custom Mod");

        Registry.register(Registry.BLOCK, new ResourceLocation(MOD_ID, "custom_block"), CUSTOM_BLOCK);
        Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, "custom_block"), new BlockItem(CUSTOM_BLOCK, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, "custom_item"), CUSTOM_ITEM);
    }
}
