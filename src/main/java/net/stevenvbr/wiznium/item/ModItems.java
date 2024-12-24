package net.stevenvbr.wiznium.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.stevenvbr.wiznium.Wiznium;
import net.stevenvbr.wiznium.item.custom.HammerItem;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Wiznium.MOD_ID);

    public static final RegistryObject<Item> WIZNIUM_STICK = ITEMS.register("wiznium_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AZIUM_STICK = ITEMS.register("azium_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZYPHIUM_STICK = ITEMS.register("zyphium_stick",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> AZIUM_INGOT = ITEMS.register("azium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WIZNIUM_INGOT = ITEMS.register("wiznium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ZYPHIUM_INGOT = ITEMS.register("zyphium_ingot",
            () -> new Item(new Item.Properties()));

    // Azium Tool
    public static final RegistryObject<Item> AZIUM_SWORD = ITEMS.register("azium_sword",
            () -> new SwordItem(ModToolTiers.AZIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.AZIUM,5,-2.4f))));
    public static final RegistryObject<Item> AZIUM_PICKAXE = ITEMS.register("azium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AZIUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.AZIUM, 2.5F, -2.8f))));
    public static final RegistryObject<Item> AZIUM_SHOVEL = ITEMS.register("azium_shovel",
            () -> new ShovelItem(ModToolTiers.AZIUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.AZIUM,2,-3f))));
    public static final RegistryObject<Item> AZIUM_AXE = ITEMS.register("azium_axe",
            () -> new AxeItem(ModToolTiers.AZIUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.AZIUM,7,-3.2f))));
    public static final RegistryObject<Item> AZIUM_HOE = ITEMS.register("azium_hoe",
            () -> new HoeItem(ModToolTiers.AZIUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.AZIUM,-3,1f))));
    // Zyphium Tool

    public static final RegistryObject<Item> ZYPHIUM_PICKAXE = ITEMS.register("zyphium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ZYPHIUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ZYPHIUM, 1.5F, -2.8f))));
    public static final RegistryObject<Item> ZYPHIUM_SHOVEL = ITEMS.register("zyphium_shovel",
            () -> new ShovelItem(ModToolTiers.ZYPHIUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.ZYPHIUM, 0.5F, -3f))));
    public static final RegistryObject<Item> ZYPHIUM_SWORD = ITEMS.register("zyphium_sword",
            () -> new SwordItem(ModToolTiers.ZYPHIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.ZYPHIUM, 5, -2.4f))));
    public static final RegistryObject<Item> ZYPHIUM_AXE = ITEMS.register("zyphium_axe",
            () -> new AxeItem(ModToolTiers.ZYPHIUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.ZYPHIUM, 6.5F, -3.2f))));
    public static final RegistryObject<Item> ZYPHIUM_HOE = ITEMS.register("zyphium_hoe",
            () -> new HoeItem(ModToolTiers.ZYPHIUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.ZYPHIUM, -5F, 1f))));

    // Hammer

    public static final RegistryObject<Item> WIZNIUM_HAMMER = ITEMS.register("wiznium_hammer",
            () -> new HammerItem(ModToolTiers.ZYPHIUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ZYPHIUM, 6.5F, -3.5f))));



    public static void regiter(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
