
package net.mcreator.mdoom.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.mdoom.init.MdoomModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class HeavyGunGunEntity extends AbstractArrow implements ItemSupplier {
	public HeavyGunGunEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(MdoomModEntities.HEAVY_GUN_GUN.get(), world);
	}

	public HeavyGunGunEntity(EntityType<? extends HeavyGunGunEntity> type, Level world) {
		super(type, world);
	}

	public HeavyGunGunEntity(EntityType<? extends HeavyGunGunEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public HeavyGunGunEntity(EntityType<? extends HeavyGunGunEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Items.SNOWBALL);
	}

	@Override
	protected ItemStack getPickupItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static HeavyGunGunEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		HeavyGunGunEntity entityarrow = new HeavyGunGunEntity(MdoomModEntities.HEAVY_GUN_GUN.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		return entityarrow;
	}

	public static HeavyGunGunEntity shoot(LivingEntity entity, LivingEntity target) {
		HeavyGunGunEntity entityarrow = new HeavyGunGunEntity(MdoomModEntities.HEAVY_GUN_GUN.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 3f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(8);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		return entityarrow;
	}
}
