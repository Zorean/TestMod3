package com.choonster.testmod3.init;

import com.choonster.testmod3.TestMod3;
import com.choonster.testmod3.item.ItemEntityTest;
import com.choonster.testmod3.item.ItemHeavy;
import com.choonster.testmod3.item.ItemRecordSolaris;
import com.choonster.testmod3.item.ToolWoodAxe;
import com.choonster.testmod3.recipe.ShapelessCuttingRecipe;
import net.minecraft.block.BlockPlanks;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModItems {
	public static Item woodenAxe;
	public static Item entityTest;
	public static Item solarisRecord;
	public static Item heavy;

	public static Item.ToolMaterial TOOL_MATERIAL_GLOWSTONE;

	public static void registerItems() {
		woodenAxe = new ToolWoodAxe(Item.ToolMaterial.WOOD).setCreativeTab(TestMod3.creativeTab).setUnlocalizedName("woodenAxe");
		GameRegistry.registerItem(woodenAxe, "wooden_axe_test");

		entityTest = new ItemEntityTest();
		GameRegistry.registerItem(entityTest, "entity_test");

		solarisRecord = new ItemRecordSolaris();
		GameRegistry.registerItem(solarisRecord, "solaris_record");

		heavy = new ItemHeavy();
		GameRegistry.registerItem(heavy, "heavy");

		TOOL_MATERIAL_GLOWSTONE = EnumHelper.addToolMaterial("glowstone", 1, 5, 0.5f, 1.0f, 10).setRepairItem(new ItemStack(Items.glowstone_dust));
	}

	public static void addRecipes() {
		GameRegistry.addRecipe(new ShapelessCuttingRecipe(new ItemStack(Blocks.planks, 2, BlockPlanks.EnumType.OAK.getMetadata()), new ItemStack(Items.wooden_axe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.log, 1, BlockPlanks.EnumType.OAK.getMetadata())));


	}
}