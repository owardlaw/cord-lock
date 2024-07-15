package net.owen.cordlock.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.owen.cordlock.item.ModItems;

public class ModCreativeModeTab {
    public static final CreativeModeTab CORD_LOCK = new CreativeModeTab("cordlock") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.REDSTONE_COMPASS.get());
        }
    };
}