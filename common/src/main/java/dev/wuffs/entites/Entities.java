package dev.wuffs.entites;

import dev.architectury.registry.registries.DeferredRegister;
import dev.wuffs.BambooEverything;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;

public class Entities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(BambooEverything.MOD_ID, Registries.ENTITY_TYPE);

//    public static final RegistrySupplier<EntityType<BambooRaftEntity>> RAFT = ENTITIES.register("bamboo_raft", () -> EntityType.Builder.<BambooRaftEntity>of(BambooRaftEntity::new, MobCategory.MISC)
//            .sized(1.375F, 0.4F)
//            .build(BambooEverything.MOD_ID + ":" + BambooEverything.MOD_ID));
}
