package net.ottosmods.testmod.block;

import jdk.incubator.vector.VectorOperators;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.ottosmods.testmod.TestMod;
import net.ottosmods.testmod.item.ModItemGroup;
import net.ottosmods.testmod.item.ModItems;


public class ModBlocks {

    public static final Block TANZITE_BLOCK = registerBlock("tanzite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.TANZITE);

    public static final Block TANZITE_ORE = registerBlock("tanzite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.TANZITE);

    public static final Block DEEPSLATE_TANZITE_ORE = registerBlock("deepslate_tanzite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.TANZITE);

    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(TestMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks(){
        TestMod.LOGGER.debug("Registering ModBlocks for " + TestMod.MOD_ID);
    }
}
