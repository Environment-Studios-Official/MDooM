
package net.mcreator.mdoom.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AmmoItem extends Item {
	public AmmoItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
