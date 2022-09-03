package net.ottosmods.testmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.ottosmods.testmod.TestMod;

public class ModItems {

    public static final Item RAW_TANZITE = registerItem("raw_tanzite",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZITE)));

    public static final Item TANZITE = registerItem("tanzite",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZITE)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        TestMod.LOGGER.debug("Register mod item for " + TestMod.MOD_ID);
    }
}
