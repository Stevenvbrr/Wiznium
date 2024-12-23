package net.stevenvbr.wiznium.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.stevenvbr.wiznium.Wiznium;
import net.stevenvbr.wiznium.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Wiznium.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.AZIUM_INGOT.get());
        basicItem(ModItems.WIZNIUM_INGOT.get());
        basicItem(ModItems.WIZNIUM_STICK.get());

    }
}
