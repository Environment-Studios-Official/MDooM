
package net.mcreator.mdoom.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class TestItem extends RecordItem {
	public TestItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mdoom:the_trial_of_maligogg")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 6600);
	}
}
