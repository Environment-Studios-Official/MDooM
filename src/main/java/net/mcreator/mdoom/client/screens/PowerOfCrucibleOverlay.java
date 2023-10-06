
package net.mcreator.mdoom.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.mdoom.procedures.PowerOfCrucibleUsloviiePokazaNalozhieniiaProcedure;
import net.mcreator.mdoom.procedures.PowerOfCrucible0Procedure;
import net.mcreator.mdoom.procedures.PowerOfCrucible03Procedure;
import net.mcreator.mdoom.procedures.PowerOfCrucible02Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class PowerOfCrucibleOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		int posX = w / 2;
		int posY = h / 2;
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level;
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (PowerOfCrucibleUsloviiePokazaNalozhieniiaProcedure.execute(entity)) {
			if (PowerOfCrucible0Procedure.execute()) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("mdoom:textures/screens/cursorcrusible3.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -33, posY + -16, 0, 0, 64, 64, 64, 64);
			}
			if (PowerOfCrucible02Procedure.execute()) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("mdoom:textures/screens/cursorcrusible2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -33, posY + -16, 0, 0, 64, 64, 64, 64);
			}
			if (PowerOfCrucible03Procedure.execute()) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("mdoom:textures/screens/cursorcrusible1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -33, posY + -16, 0, 0, 64, 64, 64, 64);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
