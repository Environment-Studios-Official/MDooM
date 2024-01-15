
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minedoom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.minedoom.item.TrialOfMaligogItem;
import net.mcreator.minedoom.item.TheCrucibleItem;
import net.mcreator.minedoom.item.SphereOfArgentEnergyItem;
import net.mcreator.minedoom.item.HeavyGunItemItem;
import net.mcreator.minedoom.item.HeavyGunGunItem;
import net.mcreator.minedoom.item.FaustItem;
import net.mcreator.minedoom.item.CrucibleHandleItem;
import net.mcreator.minedoom.item.AmmoHeavyGunItem;
import net.mcreator.minedoom.item.AdvancedCrusibleHandleItem;
import net.mcreator.minedoom.MinedoomMod;

public class MinedoomModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MinedoomMod.MODID);
	public static final RegistryObject<Item> AMMO_HEAVY_GUN = REGISTRY.register("ammo_heavy_gun", () -> new AmmoHeavyGunItem());
	public static final RegistryObject<Item> SPHERE_OF_ARGENT_ENERGY = REGISTRY.register("sphere_of_argent_energy", () -> new SphereOfArgentEnergyItem());
	public static final RegistryObject<Item> TRIAL_OF_MALIGOG = REGISTRY.register("trial_of_maligog", () -> new TrialOfMaligogItem());
	public static final RegistryObject<Item> FAUST = REGISTRY.register("faust", () -> new FaustItem());
	public static final RegistryObject<Item> THE_CRUCIBLE = REGISTRY.register("the_crucible", () -> new TheCrucibleItem());
	public static final RegistryObject<Item> ADVANCED_CRUSIBLE_HANDLE = REGISTRY.register("advanced_crusible_handle", () -> new AdvancedCrusibleHandleItem());
	public static final RegistryObject<Item> CRUCIBLE_HANDLE = REGISTRY.register("crucible_handle", () -> new CrucibleHandleItem());
	public static final RegistryObject<Item> HEAVY_GUN_GUN = REGISTRY.register("heavy_gun_gun", () -> new HeavyGunGunItem());
	public static final RegistryObject<Item> HEAVY_GUN_ITEM = REGISTRY.register("heavy_gun_item", () -> new HeavyGunItemItem());
}
