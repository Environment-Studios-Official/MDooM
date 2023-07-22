
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mdoom.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.mdoom.entity.HeavyGunUsageEntity;
import net.mcreator.mdoom.MdoomMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;

public class MdoomModEntities {
	public static EntityType<HeavyGunUsageEntity> HEAVY_GUN_USAGE;

	public static void load() {
		HEAVY_GUN_USAGE = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(MdoomMod.MODID, "heavy_gun_usage"), createArrowEntityType(HeavyGunUsageEntity::new));
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}
