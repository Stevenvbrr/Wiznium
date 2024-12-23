package net.stevenvbr.wiznium.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.stevenvbr.wiznium.util.ModTags;

public class ModToolTiers {
    public static final Tier AZIUM = new ForgeTier(2200, 10.0F, 3.0F, 17,
            ModTags.Blocks.NEEDS_AZIUM_TOOL, () -> Ingredient.of(ModItems.AZIUM_INGOT.get()),
            ModTags.Blocks.INCORRECT_FOR_AZIUM_TOOL);

    public static final Tier ZYPHIUM = new ForgeTier(2500, 12.0F, 5.0F, 19,
            ModTags.Blocks.NEEDS_ZYPHIUM_TOOL, () -> Ingredient.of(ModItems.ZYPHIUM_INGOT.get()),
            ModTags.Blocks.INCORRECT_FOR_ZYPHIUM_TOOL);
}
