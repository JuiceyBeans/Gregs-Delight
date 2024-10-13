package com.juiceybeans.gregsdelight.common.data;

import com.gregtechceu.gtceu.common.data.GTCreativeModeTabs;
import com.juiceybeans.gregsdelight.GregsDelight;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.world.item.CreativeModeTab;

import static com.juiceybeans.gregsdelight.GregsDelight.GD_REGISTRATE;

public class GDTabs {
    public static RegistryEntry<CreativeModeTab> GD_ITEMS = GD_REGISTRATE.defaultCreativeTab("gregsdelight_items",
                    builder -> builder.displayItems(new GTCreativeModeTabs.RegistrateDisplayItemsGenerator("gregsdelight_items", GD_REGISTRATE))
                            .icon(() -> GDItems.SLICED_BREAD.asStack())
                            .title(GD_REGISTRATE.addLang("itemGroup", GregsDelight.id("gregsdelight_items"),  "Greg's Delight Items"))
                            .build())
            .register();

    static {
        GD_REGISTRATE.creativeModeTab(() -> GDTabs.GD_ITEMS);
    }

    public static void init() {

    }
}
