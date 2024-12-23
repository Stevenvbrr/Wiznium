package net.stevenvbr.wiznium.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.stevenvbr.wiznium.Wiznium;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_AZIUM_TOOL = createTag("needs_azium_tool");
        public static final TagKey<Block> INCORRECT_FOR_AZIUM_TOOL = createTag("incorrect_for_azium_tool");

        public static final TagKey<Block> NEEDS_ZYPHIUM_TOOL = createTag("needs_zyphium_tool");
        public static final TagKey<Block> INCORRECT_FOR_ZYPHIUM_TOOL = createTag("incorrect_for_zyphium_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Wiznium.MOD_ID, name));
        }
    }

        public static class Items {
            public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

            private static TagKey<Item> createTag(String name) {
                return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Wiznium.MOD_ID, name));
            }
    }
}