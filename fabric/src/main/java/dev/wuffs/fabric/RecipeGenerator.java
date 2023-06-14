package dev.wuffs.fabric;

import dev.wuffs.BambooEverything;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> exporter) {

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.BAMBOO), RecipeCategory.MISC, dev.wuffs.items.Items.DRY_BAMBOO.get(), 0.5f, 50)
                .unlockedBy("has_bamboo", has(Items.BAMBOO))
                .save(exporter, new ResourceLocation(BambooEverything.MOD_ID, "dry_bamboo"));

//        Bamboo torch
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, dev.wuffs.blocks.Blocks.TORCH.get())
                .unlockedBy("has_bamboo", has(Items.BAMBOO))
                .pattern("C")
                .pattern("B")
                .define('C', Ingredient.of(Items.COAL, Items.CHARCOAL))
                .define('B', Items.BAMBOO)
                .save(exporter, new ResourceLocation(BambooEverything.MOD_ID, "bamboo_torch"));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, dev.wuffs.blocks.Blocks.DRY_TORCH.get())
                .unlockedBy("has_bamboo", has(dev.wuffs.items.Items.DRY_BAMBOO.get()))
                .pattern("C")
                .pattern("B")
                .define('C', Ingredient.of(Items.COAL, Items.CHARCOAL))
                .define('B', dev.wuffs.items.Items.DRY_BAMBOO.get())
                .save(exporter, new ResourceLocation(BambooEverything.MOD_ID, "bamboo_dry_torch"));

//        Bamboo Ladder
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, dev.wuffs.blocks.Blocks.LADDER.get())
                .unlockedBy("has_bamboo", has(Items.BAMBOO))
                .pattern("B B")
                .pattern("BBB")
                .pattern("B B")
                .define('B', Items.BAMBOO)
                .save(exporter, new ResourceLocation(BambooEverything.MOD_ID, "bamboo_ladder"));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, dev.wuffs.blocks.Blocks.DRY_LADDER.get())
                .unlockedBy("has_bamboo", has(dev.wuffs.items.Items.DRY_BAMBOO.get()))
                .pattern("B B")
                .pattern("BBB")
                .pattern("B B")
                .define('B', dev.wuffs.items.Items.DRY_BAMBOO.get())
                .save(exporter, new ResourceLocation(BambooEverything.MOD_ID, "bamboo_dry_ladder"));

//        Block of bamboo
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BAMBOO_BLOCK), RecipeCategory.BUILDING_BLOCKS, dev.wuffs.blocks.Blocks.BUNDLE.get())
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_BLOCK))
                .save(exporter, new ResourceLocation(BambooEverything.MOD_ID, "bamboo_block"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BAMBOO_BLOCK), RecipeCategory.BUILDING_BLOCKS, dev.wuffs.blocks.Blocks.DRY_BUNDLE.get())
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_BLOCK))
                .save(exporter, new ResourceLocation(BambooEverything.MOD_ID, "bamboo_dry_block"));

//        Bamboo slab
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BAMBOO_SLAB), RecipeCategory.BUILDING_BLOCKS, dev.wuffs.blocks.Blocks.SLAB.get())
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_SLAB))
                .save(exporter, new ResourceLocation(BambooEverything.MOD_ID, "bamboo_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BAMBOO_SLAB), RecipeCategory.BUILDING_BLOCKS, dev.wuffs.blocks.Blocks.DRY_SLAB.get())
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_SLAB))
                .save(exporter, new ResourceLocation(BambooEverything.MOD_ID, "bamboo_dry_slab"));

//        Bamboo stairs
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BAMBOO_STAIRS), RecipeCategory.BUILDING_BLOCKS, dev.wuffs.blocks.Blocks.STAIRS.get())
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_STAIRS))
                .save(exporter, new ResourceLocation(BambooEverything.MOD_ID, "bamboo_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BAMBOO_STAIRS), RecipeCategory.BUILDING_BLOCKS, dev.wuffs.blocks.Blocks.DRY_STAIRS.get())
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_STAIRS))
                .save(exporter, new ResourceLocation(BambooEverything.MOD_ID, "bamboo_dry_stairs"));

//        Bamboo fence
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BAMBOO_FENCE), RecipeCategory.BUILDING_BLOCKS, dev.wuffs.blocks.Blocks.FENCE.get())
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_FENCE))
                .save(exporter, new ResourceLocation(BambooEverything.MOD_ID, "bamboo_fence"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BAMBOO_FENCE), RecipeCategory.BUILDING_BLOCKS, dev.wuffs.blocks.Blocks.DRY_FENCE.get())
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_FENCE))
                .save(exporter, new ResourceLocation(BambooEverything.MOD_ID, "bamboo_dry_fence"));

//        Bamboo fence gate
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BAMBOO_FENCE_GATE), RecipeCategory.BUILDING_BLOCKS, dev.wuffs.blocks.Blocks.FENCEGATE.get())
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_FENCE_GATE))
                .save(exporter, new ResourceLocation(BambooEverything.MOD_ID, "bamboo_fence_gate"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BAMBOO_FENCE_GATE), RecipeCategory.BUILDING_BLOCKS, dev.wuffs.blocks.Blocks.DRY_FENCEGATE.get())
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_FENCE_GATE))
                .save(exporter, new ResourceLocation(BambooEverything.MOD_ID, "bamboo_dry_fence_gate"));

//        Bamboo door
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BAMBOO_DOOR), RecipeCategory.BUILDING_BLOCKS, dev.wuffs.blocks.Blocks.DOOR.get())
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_DOOR))
                .save(exporter, new ResourceLocation(BambooEverything.MOD_ID, "bamboo_door"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BAMBOO_DOOR), RecipeCategory.BUILDING_BLOCKS, dev.wuffs.blocks.Blocks.DRY_DOOR.get())
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_DOOR))
                .save(exporter, new ResourceLocation(BambooEverything.MOD_ID, "bamboo_dry_door"));

//        Bamboo trapdoor
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BAMBOO_TRAPDOOR), RecipeCategory.BUILDING_BLOCKS, dev.wuffs.blocks.Blocks.TRAPDOOR.get())
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_TRAPDOOR))
                .save(exporter, new ResourceLocation(BambooEverything.MOD_ID, "bamboo_trapdoor"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BAMBOO_TRAPDOOR), RecipeCategory.BUILDING_BLOCKS, dev.wuffs.blocks.Blocks.DRY_TRAPDOOR.get())
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_TRAPDOOR))
                .save(exporter, new ResourceLocation(BambooEverything.MOD_ID, "bamboo_dry_trapdoor"));
    }
}
