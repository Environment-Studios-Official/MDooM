package net.mcreator.mdoom.procedures;

import net.minecraft.world.entity.Entity;

public class CruciblePriShchielchkiePKMPoBlokuProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(3);
	}
}
