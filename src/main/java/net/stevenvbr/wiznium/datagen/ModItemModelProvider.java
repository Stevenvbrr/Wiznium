package net.stevenvbr.wiznium.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
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
        basicItem(ModItems.AZIUM_STICK.get());

        handheldItem(ModItems.AZIUM_SWORD);
        handheldItem(ModItems.AZIUM_PICKAXE);
        handheldItem(ModItems.AZIUM_SHOVEL);


    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return  withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(Wiznium.MOD_ID, "item/" + item.getId().getPath()));
    }
}
