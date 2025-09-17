package com.SolarMod;

import com.SolarMod.block.Solarblocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;

public class SolarModelProvider extends FabricModelProvider
{
    public SolarModelProvider(FabricDataOutput output){
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(Solarblocks.UNKWOWNBLOCK);
        //copies to all sides
        /*
        {
            "parent": "minecraft:block/cube_all",
            "textures": {
                "all": "fabric-docs-reference:block/steel_block"
            }
        }

        {
             "variants": {
                "": {
                    "model": "fabric-docs-reference:block/steel_block"
                    }
              }
        }
         */

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }

    @Override
    public String getName() {
        return "SolarMod Model Provider";
    }
}
