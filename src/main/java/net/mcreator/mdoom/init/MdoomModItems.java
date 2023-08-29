
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mdoom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.mdoom.item.TheCrucibleItem;
import net.mcreator.mdoom.item.HeavyGunItemItem;
import net.mcreator.mdoom.item.HeavyGunGunItem;
import net.mcreator.mdoom.item.CrucibleHandleItem;
import net.mcreator.mdoom.item.ArgentEnergyItem;
import net.mcreator.mdoom.item.AmmoItem;
import net.mcreator.mdoom.item.AdvancedCrusibleHandleItem;
import net.mcreator.mdoom.MdoomMod;

public class MdoomModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MdoomMod.MODID);
	public static final RegistryObject<Item> CRUCIBLE_HANDLE = REGISTRY.register("crucible_handle", () -> new CrucibleHandleItem());
	public static final RegistryObject<Item> ADVANCED_CRUSIBLE_HANDLE = REGISTRY.register("advanced_crusible_handle", () -> new AdvancedCrusibleHandleItem());
	public static final RegistryObject<Item> ARGENT_ENERGY = REGISTRY.register("argent_energy", () -> new ArgentEnergyItem());
	public static final RegistryObject<Item> AMMO = REGISTRY.register("ammo", () -> new AmmoItem());
	public static final RegistryObject<Item> HEAVY_GUN_ITEM = REGISTRY.register("heavy_gun_item", () -> new HeavyGunItemItem());
	public static final RegistryObject<Item> HEAVY_GUN_GUN = REGISTRY.register("heavy_gun_gun", () -> new HeavyGunGunItem());
	public static final RegistryObject<Item> THE_CRUCIBLE = REGISTRY.register("the_crucible", () -> new TheCrucibleItem());
}
