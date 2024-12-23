package net.stevenvbr.wiznium.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.stevenvbr.wiznium.Wiznium;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Wiznium.MOD_ID);

    public static final RegistryObject<Item> WIZNIUM_STICK = ITEMS.register("wiznium_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AZIUM_STICK = ITEMS.register("azium_stick",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> AZIUM_INGOT = ITEMS.register("azium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WIZNIUM_INGOT = ITEMS.register("wiznium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ZYPHIUM_INGOT = ITEMS.register("zyphium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AZIUM_SWORD = ITEMS.register("azium_sword",
            () -> new SwordItem(ModToolTiers.AZIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.AZIUM,5,-2.4f))));
    public static final RegistryObject<Item> AZIUM_PICKAXE = ITEMS.register("azium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AZIUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.AZIUM, 2.5F, -3f))));
    public static final RegistryObject<Item> AZIUM_SHOVEL = ITEMS.register("azium_shovel",
            () -> new ShovelItem(ModToolTiers.AZIUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.AZIUM,2,-2.8f))));
    public static final RegistryObject<Item> AZIUM_AXE = ITEMS.register("azium_axe",
            () -> new AxeItem(ModToolTiers.AZIUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.AZIUM,7,-3.2f))));
    public static final RegistryObject<Item> AZIUM_HOE = ITEMS.register("azium_hoe",
            () -> new HoeItem(ModToolTiers.AZIUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.AZIUM,-3,1f))));


    public static void regiter(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
