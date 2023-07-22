
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mdoom.init;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class MdoomModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(MdoomModEntities.HEAVY_GUN_USAGE, ThrownItemRenderer::new);
	}
}
