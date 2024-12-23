package net.stevenvbr.wiznium.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.stevenvbr.wiznium.Wiznium;
import net.stevenvbr.wiznium.block.ModBlocks;
import net.stevenvbr.wiznium.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Wiznium.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.AZIUM_ORE.get())
                .add(ModBlocks.WIZNIUM_ORE.get())
                .add(ModBlocks.ZYPHIUM_ORE.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.AZIUM_ORE.get());


        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.WIZNIUM_ORE.get())
                .add(ModBlocks.ZYPHIUM_ORE.get());

        tag(ModTags.Blocks.NEEDS_AZIUM_TOOL)
                .addTags(BlockTags.NEEDS_DIAMOND_TOOL);



    }
}
