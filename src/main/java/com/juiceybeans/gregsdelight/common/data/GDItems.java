package com.juiceybeans.gregsdelight.common.data;

import com.juiceybeans.gregsdelight.GregsDelight;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

import static com.juiceybeans.gregsdelight.GregsDelight.GD_REGISTRATE;

public class GDItems {
    // Example Registrate item
    // public static final ItemEntry<Item> POWER_WASHER = GD_REGISTRATE.item("power_washer", Item::new).lang("Power Washer").register();

    public static final ItemEntry<Item> SLICED_BREAD = GD_REGISTRATE.item("sliced_bread", Item::new)
            .lang("Sliced Bread")
            .register();

    public static void init() {
        GregsDelight.LOGGER.info("Registered items from Greg's Delight");
    }
}
