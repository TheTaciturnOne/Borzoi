package net.thetaciturnone.borzoi.entity.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;
import net.thetaciturnone.borzoi.Borzoi;
import net.thetaciturnone.borzoi.entity.custom.BorzoiEntity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class BorzoiRenderer extends GeoEntityRenderer<BorzoiEntity> {
    public BorzoiRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new BorzoiModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public void preRender(MatrixStack poseStack, BorzoiEntity animatable, BakedGeoModel model, VertexConsumerProvider bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue,
                            float alpha) {
        if (animatable.isBaby()) poseStack.scale(0.5f, 0.5f, 0.5f);
    }

    public Identifier getTextureLocation(BorzoiEntity object) {
        return new Identifier(Borzoi.MOD_ID, "textures/entity/borzoi/borzoi.png");
    }

    public RenderLayer getRenderType(BorzoiEntity animatable, Identifier texture, @Nullable VertexConsumerProvider bufferSource, float partialTick) {

        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}
