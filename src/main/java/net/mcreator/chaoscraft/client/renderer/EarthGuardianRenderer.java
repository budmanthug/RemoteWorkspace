
package net.mcreator.chaoscraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.chaoscraft.entity.EarthGuardianEntity;
import net.mcreator.chaoscraft.client.model.Modelearthguardian;

public class EarthGuardianRenderer extends MobRenderer<EarthGuardianEntity, Modelearthguardian<EarthGuardianEntity>> {
	public EarthGuardianRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelearthguardian(context.bakeLayer(Modelearthguardian.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EarthGuardianEntity entity) {
		return new ResourceLocation("chaoscraft:textures/earthguardian.png");
	}
}
