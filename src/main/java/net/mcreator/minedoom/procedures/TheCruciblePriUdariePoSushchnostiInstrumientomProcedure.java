package net.mcreator.minedoom.procedures;

import net.minecraft.world.entity.Entity;

public class TheCruciblePriUdariePoSushchnostiInstrumientomProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(3);
	}
}
