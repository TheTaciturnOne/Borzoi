package net.thetaciturnone.borzoi;


import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.thetaciturnone.borzoi.entity.ModEntities;
import net.thetaciturnone.borzoi.entity.client.BorzoiRenderer;


public class BorzoiClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.BORZOI, BorzoiRenderer::new);
    }
}
