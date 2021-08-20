package dev.wuffs.bambooeverything.client;

import com.google.common.collect.ImmutableMap;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.datafixers.util.Pair;
import com.mojang.math.Quaternion;
import com.mojang.math.Vector3f;
import dev.wuffs.bambooeverything.BambooEverything;
import dev.wuffs.bambooeverything.BambooEverythingClient;
import dev.wuffs.bambooeverything.entites.entity.BambooRaftEntity;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.vehicle.Boat;

public class BambooRaftRender extends EntityRenderer<BambooRaftEntity> {

    private final static ResourceLocation LOCATION = new ResourceLocation(BambooEverything.MOD_ID, "textures/entity/bamboo_raft.png");
    private final BambooRaftModel model;

    public BambooRaftRender(EntityRendererProvider.Context context) {
        super(context);
        this.model = new BambooRaftModel(context.bakeLayer(BambooEverythingClient.RAFT));
    }

    public void render(BambooRaftEntity raft, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferSource, int packedLightIn) {
        poseStack.pushPose();
        poseStack.translate(0.0D, 0.375D, 0.0D);
        poseStack.mulPose(Vector3f.YP.rotationDegrees(180.0F - entityYaw));
        float f = (float)raft.getHurtTime() - partialTicks;
        float f1 = raft.getDamage() - partialTicks;
        if (f1 < 0.0F) {
            f1 = 0.0F;
        }

        if (f > 0.0F) {
            poseStack.mulPose(Vector3f.XP.rotationDegrees(Mth.sin(f) * f * f1 / 10.0F * (float)raft.getHurtDir()));
        }

        float f2 = raft.getBubbleAngle(partialTicks);
        if (!Mth.equal(f2, 0.0F)) {
            poseStack.mulPose(new Quaternion(new Vector3f(1.0F, 0.0F, 1.0F), raft.getBubbleAngle(partialTicks), true));
        }

        poseStack.scale(-1.0F, -1.0F, 1.0F);
        poseStack.mulPose(Vector3f.YP.rotationDegrees(90.0F));
        this.model.setupAnim(raft, partialTicks, 0.0F, -0.1F, 0.0F, 0.0F);
        VertexConsumer ivertexbuilder = bufferSource.getBuffer(this.model.renderType(this.getTextureLocation(raft)));
        this.model.renderToBuffer(poseStack, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        poseStack.popPose();
        super.render(raft, entityYaw, partialTicks, poseStack, bufferSource, packedLightIn);
    }

    @Override
    public ResourceLocation getTextureLocation(BambooRaftEntity entity) {
        return LOCATION;
    }
}
