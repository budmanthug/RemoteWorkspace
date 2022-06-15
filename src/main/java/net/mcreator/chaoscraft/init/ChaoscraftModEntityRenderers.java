
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chaoscraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.chaoscraft.client.renderer.EarthGuardianRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ChaoscraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ChaoscraftModEntities.EARTH_GUARDIAN.get(), EarthGuardianRenderer::new);
	}
}
