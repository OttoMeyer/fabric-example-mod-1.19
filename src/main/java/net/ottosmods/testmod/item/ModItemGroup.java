package net.ottosmods.testmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.ottosmods.testmod.TestMod;

public class ModItemGroup {
    public static final ItemGroup TANZITE = FabricItemGroupBuilder.build(
            new Identifier(TestMod.MOD_ID, "tanzite"), () -> new ItemStack(ModItems.TANZITE));
}
