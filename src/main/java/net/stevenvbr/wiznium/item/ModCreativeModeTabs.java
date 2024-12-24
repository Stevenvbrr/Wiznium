package net.stevenvbr.wiznium.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.stevenvbr.wiznium.Wiznium;
import net.stevenvbr.wiznium.block.ModBlocks;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Wiznium.MOD_ID);

    public static final RegistryObject<CreativeModeTab> WIZNIUM_ITEMS_TAB = CREATIVE_MODE_TABS.register("wiznium_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WIZNIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.wiznium.wiznium_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.AZIUM_INGOT.get());
                        output.accept(ModItems.ZYPHIUM_INGOT.get());
                        output.accept(ModItems.WIZNIUM_INGOT.get());
                        output.accept(ModItems.AZIUM_STICK.get());
                        output.accept(ModItems.ZYPHIUM_STICK.get());
                        output.accept(ModItems.WIZNIUM_STICK.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> WIZNIUM_BLOCKS_TAB = CREATIVE_MODE_TABS.register("wiznium_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.WIZNIUM_ORE.get()))
                    .withTabsBefore(WIZNIUM_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.wiznium.wiznium_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.WIZNIUM_ORE.get());
                        output.accept(ModBlocks.AZIUM_ORE.get());
                        output.accept(ModBlocks.ZYPHIUM_ORE.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> WIZNIUM_TOOLS_TAB = CREATIVE_MODE_TABS.register("wiznium_tools_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AZIUM_SWORD.get()))
                    .withTabsBefore(WIZNIUM_BLOCKS_TAB.getId())
                    .title(Component.translatable("creativetab.wiznium.wiznium_tools"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.AZIUM_SWORD.get());
                        output.accept(ModItems.AZIUM_PICKAXE.get());
                        output.accept(ModItems.AZIUM_SHOVEL.get());
                        output.accept(ModItems.AZIUM_AXE.get());
                        output.accept(ModItems.AZIUM_HOE.get());
                        output.accept(ModItems.ZYPHIUM_PICKAXE.get());
                        output.accept(ModItems.ZYPHIUM_AXE.get());
                        output.accept(ModItems.ZYPHIUM_SWORD.get());
                        output.accept(ModItems.ZYPHIUM_SHOVEL.get());
                        output.accept(ModItems.ZYPHIUM_HOE.get());
                        output.accept(ModItems.WIZNIUM_HAMMER.get());
                        output.accept(ModItems.AZIUM_HELMET.get());
                        output.accept(ModItems.AZIUM_CHESTPLATE.get());
                        output.accept(ModItems.AZIUM_LEGGINGS.get());
                        output.accept(ModItems.AZIUM_BOOTS.get());

                    }).build());



    public static void register (IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
