package dev.wuffs.entites;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.wuffs.BambooEverything;
import dev.wuffs.entites.entity.BambooRaftEntity;
import net.minecraft.core.Registry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class Entities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(BambooEverything.MOD_ID, Registry.ENTITY_TYPE_REGISTRY);

    public static final RegistrySupplier<EntityType<BambooRaftEntity>> RAFT = ENTITIES.register("bamboo_raft", () -> EntityType.Builder.<BambooRaftEntity>of(BambooRaftEntity::new, MobCategory.MISC)
            .sized(1.375F, 0.4F)
            .build(BambooEverything.MOD_ID + ":" + BambooEverything.MOD_ID));
}
