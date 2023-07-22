package net.mcreator.mdoom.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.mdoom.MdoomMod;

import java.util.Map;

public class CruciblePriShchielchkiePKMPoBlokuProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MdoomMod.LOGGER.warn("Failed to load dependency entity for procedure CruciblePriShchielchkiePKMPoBloku!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setSecondsOnFire(3);
	}
}
