
package net.mcreator.mdoom.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mdoom.procedures.CruciblePriShchielchkiePKMPoBlokuProcedure;
import net.mcreator.mdoom.procedures.CruciblePriPoluchieniiPriedmietaPoRietsieptuProcedure;
import net.mcreator.mdoom.procedures.CrucibleKazhdyiTikVRukieProcedure;

public class TheCrucibleItem extends SwordItem {
	public TheCrucibleItem() {
		super(new Tier() {
			public int getUses() {
				return 4;
			}

			public float getSpeed() {
				return 1f;
			}

			public float getAttackDamageBonus() {
				return 998f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -2.4f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		CruciblePriShchielchkiePKMPoBlokuProcedure.execute(entity);
		return retval;
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		CruciblePriPoluchieniiPriedmietaPoRietsieptuProcedure.execute(entity);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			CrucibleKazhdyiTikVRukieProcedure.execute(world, entity, itemstack);
	}
}
