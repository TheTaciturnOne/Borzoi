package net.thetaciturnone.borzoi;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.passive.GoatEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.thetaciturnone.borzoi.entity.ModEntities;
import net.thetaciturnone.borzoi.entity.custom.BorzoiEntity;
import net.thetaciturnone.borzoi.item.ModItems;
import net.thetaciturnone.borzoi.world.gen.ModEntitySpawn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;


public class Borzoi implements ModInitializer {

	public static final String MOD_ID = "borzoi";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final Identifier BORZOI_INTERACTION = new Identifier("borzoi:borzoi_interaction");
	public static SoundEvent BORZOI_SOUND_EVENT = SoundEvent.of(BORZOI_INTERACTION);


	public static Identifier makeID(String path) {
		return new Identifier(
				MOD_ID,
				path
		);
	}

	public static String makeStringID(String name) {
		return MOD_ID + ":" + name;
	}


	@Override
	public void onInitialize() {
		GeckoLib.initialize();
		FabricDefaultAttributeRegistry.register(ModEntities.BORZOI, BorzoiEntity.setAttributes());
		ModEntitySpawn.addEntitySpawn();
		Registry.register(Registries.SOUND_EVENT, Borzoi.BORZOI_INTERACTION, BORZOI_SOUND_EVENT);

		ModItems.registerModItems();
	}
}
