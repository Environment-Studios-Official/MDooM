package net.mcreator.mdoom.procedures;

import net.minecraft.world.item.ItemStack;

import net.mcreator.mdoom.init.MdoomModItems;

public class PowerOfCrucible02Procedure {
	public static boolean execute() {
		while (new ItemStack(MdoomModItems.THE_CRUCIBLE.get()).getOrCreateTag().getDouble("\u041F\u0440\u043E\u0447\u043D\u043E\u0441\u0442\u044C") == new ItemStack(MdoomModItems.THE_CRUCIBLE.get()).getDamageValue()) {
			if (new ItemStack(MdoomModItems.THE_CRUCIBLE.get()).getOrCreateTag().getDouble("\u041F\u0440\u043E\u0447\u043D\u043E\u0441\u0442\u044C") == 1) {
				return true;
			}
		}
		return false;
	}
}
