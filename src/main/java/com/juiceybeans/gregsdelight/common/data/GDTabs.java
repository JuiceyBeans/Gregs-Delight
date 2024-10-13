package com.juiceybeans.gregsdelight.common.data;

import com.gregtechceu.gtceu.common.data.GTCreativeModeTabs;
import com.juiceybeans.gregsdelight.GregsDelight;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;

import static com.juiceybeans.gregsdelight.GregsDelight.GD_REGISTRATE;

public class GDTabs {
    public static RegistryEntry<CreativeModeTab> GD_ITEMS = GD_REGISTRATE.defaultCreativeTab(GregsDelight.MOD_ID,
                    builder -> builder.displayItems(new GTCreativeModeTabs.RegistrateDisplayItemsGenerator(GregsDelight.MOD_ID, GD_REGISTRATE))
                            .icon(GDItems.SLICED_BREAD::asStack)
                            .title(Component.literal("Greg's Delight"))
                            .build())
            .register();

    static {
        GD_REGISTRATE.creativeModeTab(() -> GDTabs.GD_ITEMS);
    }

    public static void init() {

    }
}
