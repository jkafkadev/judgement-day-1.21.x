package com.mnquack.judgementday.item;

import com.mnquack.judgementday.JudgementDay;
import com.mnquack.judgementday.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(JudgementDay.MOD_ID);

    // ITEMS
    public static final DeferredItem<Item> BISMUTH = ITEMS.register(
            "bismuth",
            () -> new Item(new Item.Properties())
    );
    public static final DeferredItem<Item> RAW_BISMUTH = ITEMS.register(
            "raw_bismuth",
            () -> new Item(new Item.Properties())
    );
    public static final DeferredItem<Item> METAL_DETECTOR = ITEMS.register(
            "metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100))
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
