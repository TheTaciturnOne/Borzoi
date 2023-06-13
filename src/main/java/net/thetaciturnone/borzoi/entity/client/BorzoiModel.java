package net.thetaciturnone.borzoi.entity.client;

import net.minecraft.util.Identifier;
import net.thetaciturnone.borzoi.Borzoi;
import net.thetaciturnone.borzoi.entity.custom.BorzoiEntity;
import software.bernie.geckolib.model.GeoModel;

public class BorzoiModel extends GeoModel<BorzoiEntity> {

    @Override
    public Identifier getModelResource(BorzoiEntity object) {
        return new Identifier(Borzoi.MOD_ID, "geo/borzoi.geo.json");
    }

    @Override
    public Identifier getTextureResource(BorzoiEntity object) {
        return new Identifier(Borzoi.MOD_ID, "textures/entity/borzoi/borzoi.png");
    }

    @Override
    public Identifier getAnimationResource(BorzoiEntity animatable) {
        return new Identifier(Borzoi.MOD_ID, "animations/borzoi.animation.json");
    }
}
