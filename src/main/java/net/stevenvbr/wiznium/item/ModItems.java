package net.stevenvbr.wiznium.item;

import net.minecraft.world.item.Item;
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

    public static final RegistryObject<Item> AZIUM_INGOT = ITEMS.register("azium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WIZNIUM_INGOT = ITEMS.register("wiznium_ingot",
            () -> new Item(new Item.Properties()));




    public static void regiter(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
