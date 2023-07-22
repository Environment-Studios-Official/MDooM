
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mdoom.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MdoomModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(MdoomModItems.CRUCIBLE.get());
			tabData.accept(MdoomModItems.AMMO.get());
		}

		if (tabData.getTab() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(MdoomModItems.CRUCIBLE_HANDLE.get());
			tabData.accept(MdoomModItems.ADVANCED_CRUSIBLE_HANDLE.get());
			tabData.accept(MdoomModItems.ARGENT_ENERGY.get());
		}
	}
}
