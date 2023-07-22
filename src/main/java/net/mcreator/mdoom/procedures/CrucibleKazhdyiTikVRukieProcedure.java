package net.mcreator.mdoom.procedures;

import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.mdoom.init.MdoomModItems;
import net.mcreator.mdoom.MdoomMod;

import java.util.Map;

public class CrucibleKazhdyiTikVRukieProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MdoomMod.LOGGER.warn("Failed to load dependency entity for procedure CrucibleKazhdyiTikVRukie!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
				}
				return false;
			}
		}.checkGamemode(entity) && (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MdoomModItems.ADVANCED_CRUSIBLE_HANDLE
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MdoomModItems.ARGENT_ENERGY)) : false)) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(MdoomModItems.CRUCIBLE);
				_setstack.setCount(1);
				_player.getInventory().add(_setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(MdoomModItems.ARGENT_ENERGY);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(MdoomModItems.ADVANCED_CRUSIBLE_HANDLE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity) && (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MdoomModItems.ADVANCED_CRUSIBLE_HANDLE
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MdoomModItems.ARGENT_ENERGY)) : false)) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(MdoomModItems.CRUCIBLE);
				_setstack.setCount(1);
				_player.getInventory().add(_setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(MdoomModItems.ADVANCED_CRUSIBLE_HANDLE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
