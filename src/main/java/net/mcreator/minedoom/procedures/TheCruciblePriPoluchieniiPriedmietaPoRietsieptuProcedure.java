package net.mcreator.minedoom.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class TheCruciblePriPoluchieniiPriedmietaPoRietsieptuProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.giveExperienceLevels(10);
	}
}
