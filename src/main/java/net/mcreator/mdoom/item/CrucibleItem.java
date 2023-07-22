
package net.mcreator.mdoom.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.mdoom.procedures.CruciblePriShchielchkiePKMPoBlokuProcedure;
import net.mcreator.mdoom.procedures.CruciblePriPoluchieniiPriedmietaPoRietsieptuProcedure;
import net.mcreator.mdoom.procedures.CrucibleKazhdyiTikVRukieProcedure;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;

public class CrucibleItem extends SwordItem {
	public CrucibleItem() {
		super(new Tier() {
			public int getUses() {
				return 3;
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
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.4f, new Item.Properties().fireResistant());
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(this));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		Level world = entity.level();
		CruciblePriShchielchkiePKMPoBlokuProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build());
		return retval;
	}

	@Override
	@Environment(EnvType.CLIENT)
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("The Crucible"));
		list.add(Component.literal("the sacred relic of the Guardians. This sword still remains one of the most mysterious artifacts known to mankind. In the writings of Argent D'nour"));
		list.add(Component.literal("he is spoken of with awe and reverence. Although the Night Guards also used similar energy blades"));
		list.add(Component.literal("the Crucible remains the only weapon capable of defeating the Titans. Only the Executioner of Doom retained knowledge about this venerable blade"));
		list.add(Component.literal("because he was the only one who carried it. The blade of the sword burns with a divine flame"));
		list.add(Component.literal("instantly cauterizing the flesh through which it passes."));
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		CruciblePriPoluchieniiPriedmietaPoRietsieptuProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build());
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			CrucibleKazhdyiTikVRukieProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build());
	}
}
