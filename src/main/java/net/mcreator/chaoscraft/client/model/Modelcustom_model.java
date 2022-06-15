package net.mcreator.chaoscraft.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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
public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("chaoscraft", "modelcustom_model"), "main");
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart right_arm;
	public final ModelPart left_arm;
	public final ModelPart right_leg;
	public final ModelPart left_leg;

	public Modelcustom_model(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.right_arm = root.getChild("right_arm");
		this.left_arm = root.getChild("left_arm");
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(48.0F, -7.0F, 0.0F));
		PartDefinition normal = body.addOrReplaceChild(
				"normal", CubeListBuilder.create().texOffs(0, 40).addBox(-9.0F, -2.0F, -6.0F, 18.0F, 12.0F, 11.0F, new CubeDeformation(0.0F))
						.texOffs(0, 70).addBox(-4.5F, 10.0F, -3.0F, 9.0F, 5.0F, 6.0F, new CubeDeformation(0.5F)),
				PartPose.offset(-48.0F, 0.0F, 0.0F));
		PartDefinition head_normal = normal.addOrReplaceChild("head_normal",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -12.0F, -5.5F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -2.0F));
		PartDefinition right_arm_normal = normal.addOrReplaceChild("right_arm_normal",
				CubeListBuilder.create().texOffs(60, 21).addBox(-4.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-9.0F, 0.0F, 0.0F));
		PartDefinition left_arm_normal = normal.addOrReplaceChild("left_arm_normal",
				CubeListBuilder.create().texOffs(60, 58).addBox(0.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(9.0F, 0.0F, 0.0F));
		PartDefinition right_leg_normal = normal.addOrReplaceChild("right_leg_normal",
				CubeListBuilder.create().texOffs(37, 0).addBox(-12.0F, 0.0F, -3.0F, 6.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.5F, 15.0F, 0.0F));
		PartDefinition left_leg_normal = normal.addOrReplaceChild("left_leg_normal",
				CubeListBuilder.create().texOffs(60, 0).addBox(6.0F, 0.0F, -3.0F, 6.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.5F, 15.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.right_arm.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_leg.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.left_arm.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.right_leg.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}