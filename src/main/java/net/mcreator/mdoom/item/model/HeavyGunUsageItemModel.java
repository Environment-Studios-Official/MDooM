package net.mcreator.mdoom.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mdoom.item.HeavyGunUsageItem;

public class HeavyGunUsageItemModel extends GeoModel<HeavyGunUsageItem> {
	@Override
	public ResourceLocation getAnimationResource(HeavyGunUsageItem animatable) {
		return new ResourceLocation("mdoom", "animations/heavygun.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HeavyGunUsageItem animatable) {
		return new ResourceLocation("mdoom", "geo/heavygun.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HeavyGunUsageItem animatable) {
		return new ResourceLocation("mdoom", "textures/item/heavygun.png");
	}
}
