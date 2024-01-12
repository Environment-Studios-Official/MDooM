package net.mcreator.mdoom.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class PowerOfCrucibleUsloviiePokazaNalozhieniiaProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MdoomModItems.THE_CRUCIBLE.get()) {
			return true;
		}
		return false;
	}
}
