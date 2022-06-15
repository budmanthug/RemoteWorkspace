package net.mcreator.chaoscraft.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelearthguardian<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("chaoscraft", "modelearthguardian"), "main");
	public final ModelPart body;

	public Modelearthguardian(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition
				.addOrReplaceChild("body",
						CubeListBuilder.create().texOffs(0, 40).addBox(-9.0F, -2.0F, -6.0F, 18.0F, 12.0F, 11.0F, new CubeDeformation(0.0F))
								.texOffs(0, 70).addBox(-4.5F, 10.0F, -3.0F, 9.0F, 5.0F, 6.0F, new CubeDeformation(0.5F)),
						PartPose.offset(0.0F, -7.0F, 0.0F));
		PartDefinition head = body
				.addOrReplaceChild("head",
						CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -12.0F, -5.5F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
								.texOffs(24, 0).addBox(-1.0F, -5.0F, -7.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 0.0F, -2.0F));
		PartDefinition arm0 = body.addOrReplaceChild("arm0",
				CubeListBuilder.create().texOffs(60, 21).addBox(-13.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(60, 21)
						.addBox(-13.0F, -2.5F, 3.0F, 4.0F, 30.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(60, 21)
						.addBox(-13.0F, -2.5F, -9.0F, 4.0F, 30.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(60, 21)
						.addBox(-17.0F, -2.5F, 3.0F, 4.0F, 30.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(60, 21)
						.addBox(-17.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(60, 21)
						.addBox(-17.0F, -2.5F, -9.0F, 4.0F, 30.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition arm1 = body.addOrReplaceChild("arm1",
				CubeListBuilder.create().texOffs(60, 58).addBox(9.0F, -2.5F, -9.0F, 4.0F, 30.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(60, 58)
						.addBox(9.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(60, 58)
						.addBox(9.0F, -2.5F, 3.0F, 4.0F, 30.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(60, 58)
						.addBox(13.0F, -2.5F, 3.0F, 4.0F, 30.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(60, 58)
						.addBox(13.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(60, 58)
						.addBox(13.0F, -2.5F, -9.0F, 4.0F, 30.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leg0 = body.addOrReplaceChild("leg0",
				CubeListBuilder.create().texOffs(37, 0).addBox(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 18.0F, 0.0F));
		PartDefinition leg1 = body.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(60, 0).mirror()
				.addBox(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, 18.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.body.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.body.xRot = headPitch / (180F / (float) Math.PI);
	}
}
