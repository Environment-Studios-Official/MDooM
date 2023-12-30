
package net.mcreator.mdoom.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class FaustItem extends RecordItem {
	public FaustItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mdoom:faust")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3960);
	}
}
