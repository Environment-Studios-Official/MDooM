
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mdoom.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.mdoom.item.HeavyGunUsageItem;
import net.mcreator.mdoom.item.HeavyGunItem;
import net.mcreator.mdoom.item.CrucibleItem;
import net.mcreator.mdoom.item.CrucibleHandleItem;
import net.mcreator.mdoom.item.ArgentEnergyItem;
import net.mcreator.mdoom.item.AmmoItem;
import net.mcreator.mdoom.item.AdvancedCrusibleHandleItem;
import net.mcreator.mdoom.MdoomMod;

public class MdoomModItems {
	public static Item CRUCIBLE_HANDLE;
	public static Item CRUCIBLE;
	public static Item ADVANCED_CRUSIBLE_HANDLE;
	public static Item ARGENT_ENERGY;
	public static Item AMMO;
	public static Item HEAVY_GUN;
	public static Item HEAVY_GUN_USAGE;

	public static void load() {
		CRUCIBLE_HANDLE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MdoomMod.MODID, "crucible_handle"), new CrucibleHandleItem());
		CRUCIBLE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MdoomMod.MODID, "crucible"), new CrucibleItem());
		ADVANCED_CRUSIBLE_HANDLE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MdoomMod.MODID, "advanced_crusible_handle"), new AdvancedCrusibleHandleItem());
		ARGENT_ENERGY = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MdoomMod.MODID, "argent_energy"), new ArgentEnergyItem());
		AMMO = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MdoomMod.MODID, "ammo"), new AmmoItem());
		HEAVY_GUN = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MdoomMod.MODID, "heavy_gun"), new HeavyGunItem());
		HEAVY_GUN_USAGE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MdoomMod.MODID, "heavy_gun_usage"), new HeavyGunUsageItem());
	}
}
