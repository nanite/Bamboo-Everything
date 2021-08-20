package dev.wuffs.bambooeverything;

import dev.wuffs.bambooeverything.client.BambooRaftModel;
import dev.wuffs.bambooeverything.client.BambooRaftRender;
import dev.wuffs.bambooeverything.entites.BambooEverythingEntities;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.event.EntityRenderersEvent;

public class BambooEverythingClient {

    public static final ModelLayerLocation RAFT = new ModelLayerLocation(new ResourceLocation(BambooEverything.MOD_ID, "bamboo_raft"), "bamboo_raft");

    public static void entityReg(final EntityRenderersEvent.RegisterRenderers event){
        event.registerEntityRenderer(BambooEverythingEntities.RAFT.get(), BambooRaftRender::new);
    }
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(RAFT, () -> BambooRaftModel.createRaftDefenition());
    }
}
