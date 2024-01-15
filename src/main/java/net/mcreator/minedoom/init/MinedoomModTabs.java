
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minedoom.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.minedoom.MinedoomMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinedoomModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MinedoomMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(MinedoomModItems.AMMO_HEAVY_GUN.get());
			tabData.accept(MinedoomModItems.THE_CRUCIBLE.get());
			tabData.accept(MinedoomModItems.HEAVY_GUN_ITEM.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(MinedoomModItems.SPHERE_OF_ARGENT_ENERGY.get());
			tabData.accept(MinedoomModItems.TRIAL_OF_MALIGOG.get());
			tabData.accept(MinedoomModItems.FAUST.get());
			tabData.accept(MinedoomModItems.ADVANCED_CRUSIBLE_HANDLE.get());
			tabData.accept(MinedoomModItems.CRUCIBLE_HANDLE.get());
		}
	}
}
