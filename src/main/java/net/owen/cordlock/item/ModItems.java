package net.owen.cordlock.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.owen.cordlock.CordLock;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CordLock.MOD_ID);

   // Add item
    public static final RegistryObject<Item> REDSTONE_COMPASS = ITEMS.register("signal_compass", () -> new Item(
            new Item.Properties().tab(CreativeModeTab.TAB_MISC)
   ));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
