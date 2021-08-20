package dev.wuffs.bambooeverything.entites;

import dev.wuffs.bambooeverything.BambooEverything;
import dev.wuffs.bambooeverything.entites.entity.BambooRaftEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BambooEverythingEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, BambooEverything.MOD_ID);

    public static final RegistryObject<EntityType<BambooRaftEntity>> RAFT = ENTITIES.register("bamboo_raft", () -> EntityType.Builder.<BambooRaftEntity>of(BambooRaftEntity::new, MobCategory.MISC)
            .setCustomClientFactory(BambooRaftEntity::new)
            .sized(1.375F, 0.4F)
            .build(BambooEverything.MOD_ID + ":" + BambooEverything.MOD_ID));
}