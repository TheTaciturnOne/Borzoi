package net.thetaciturnone.borzoi.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.thetaciturnone.borzoi.Borzoi;
import net.thetaciturnone.borzoi.entity.custom.BorzoiEntity;

public class ModEntities {
    public static final EntityType<BorzoiEntity> BORZOI = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Borzoi.MOD_ID, "borzoi"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, BorzoiEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 0.5f)).build());
}
