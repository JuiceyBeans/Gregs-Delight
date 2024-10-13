package com.juiceybeans.gregsdelight.data.recipe;

import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.juiceybeans.gregsdelight.common.data.GDItems;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.common.data.GTMaterials.Glass;

public class SkibidiRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        handCraftingRecipes(provider);
    }

    private static void handCraftingRecipes(Consumer<FinishedRecipe> provider) {
        VanillaRecipeHelper.addShapelessRecipe(provider, "sliced_bread", new ItemStack(GDItems.SLICED_BREAD, 2),
                Items.BREAD, 'k');
    }

}
