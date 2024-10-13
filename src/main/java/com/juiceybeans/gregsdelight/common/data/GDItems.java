package com.juiceybeans.gregsdelight.common.data;

import com.gregtechceu.gtceu.api.item.ComponentItem;
import com.gregtechceu.gtceu.api.item.IComponentItem;
import com.gregtechceu.gtceu.api.item.component.FoodStats;
import com.gregtechceu.gtceu.api.item.component.IItemComponent;
import com.juiceybeans.gregsdelight.GregsDelight;
import com.tterrag.registrate.util.entry.ItemEntry;
import com.tterrag.registrate.util.nullness.NonNullConsumer;
import net.minecraft.world.food.FoodProperties;

import static com.juiceybeans.gregsdelight.GregsDelight.GD_REGISTRATE;

public class GDItems {
    // Example Registrate item
    // public static final ItemEntry<Item> POWER_WASHER = GD_REGISTRATE.item("power_washer", Item::new).lang("Power Washer").register();

    public static final ItemEntry<ComponentItem> SLICED_BREAD = GD_REGISTRATE.item("sliced_bread", ComponentItem::create)
            .lang("Sliced Bread")
            .onRegister(attach(new FoodStats(
                    new FoodProperties.Builder()
                            .nutrition(3)
                            .saturationMod(0.5f)
                            .fast()
                            .build(),
                    false, null)))
            .register();

    public static <T extends IComponentItem> NonNullConsumer<T> attach(IItemComponent components) {
        return item -> item.attachComponents(components);
    }

    public static <T extends IComponentItem> NonNullConsumer<T> attach(IItemComponent... components) {
        return item -> item.attachComponents(components);
    }

    public static void init() {
        GregsDelight.LOGGER.info("Registered items from Greg's Delight");
    }
}
