
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fuzzy.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.fuzzy.client.renderer.MossheepRenderer;
import net.mcreator.fuzzy.client.renderer.LabushaRenderer;
import net.mcreator.fuzzy.client.renderer.BianalRenderer;
import net.mcreator.fuzzy.client.renderer.AquaticSheepRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FuzzyModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(FuzzyModEntities.BIANAL.get(), BianalRenderer::new);
		event.registerEntityRenderer(FuzzyModEntities.LABUSHA.get(), LabushaRenderer::new);
		event.registerEntityRenderer(FuzzyModEntities.MOSSHEEP.get(), MossheepRenderer::new);
		event.registerEntityRenderer(FuzzyModEntities.AQUATIC_SHEEP.get(), AquaticSheepRenderer::new);
	}
}
