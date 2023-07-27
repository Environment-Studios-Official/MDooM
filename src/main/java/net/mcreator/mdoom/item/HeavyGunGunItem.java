
package net.mcreator.mdoom.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.mdoom.procedures.HeavyGunUsagePoslieIspolzovaniiaSnariadaProcedure;
import net.mcreator.mdoom.entity.HeavyGunGunEntity;

public class HeavyGunGunItem extends Item {
	public HeavyGunGunItem() {
		super(new Item.Properties().durability(64));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		entity.startUsingItem(hand);
		return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.NONE;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 72000;
	}

	@Override
	public void onUseTick(Level world, LivingEntity entityLiving, ItemStack itemstack, int count) {
		if (!world.isClientSide() && entityLiving instanceof ServerPlayer entity) {
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			if (true) {
				HeavyGunGunEntity entityarrow = HeavyGunGunEntity.shoot(world, entity, world.getRandom(), 3f, 8, 0);
				itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
				entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
				HeavyGunUsagePoslieIspolzovaniiaSnariadaProcedure.execute(world, x, y, z, entity, itemstack);
				entity.releaseUsingItem();
			}
		}
	}
}
