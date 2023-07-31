
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mdoom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.mdoom.item.TheCrucibleItem;
import net.mcreator.mdoom.item.HeavyGunGunItem;
import net.mcreator.mdoom.MdoomMod;

public class MdoomModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MdoomMod.MODID);
	public static final RegistryObject<Item> HEAVY_GUN_GUN = REGISTRY.register("heavy_gun_gun", () -> new HeavyGunGunItem());
	public static final RegistryObject<Item> THE_CRUCIBLE = REGISTRY.register("the_crucible", () -> new TheCrucibleItem());
}
