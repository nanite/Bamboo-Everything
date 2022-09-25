package dev.wuffs.client;

import dev.wuffs.entites.entity.BambooRaftEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class BambooRaftModel extends HierarchicalModel<BambooRaftEntity> {
    private final ModelPart raft;
    private final ModelPart planks;
    private final ModelPart top_planks;
//    private final ModelPart rope_top;
//    private final ModelPart rope_bottom;

    public BambooRaftModel(ModelPart part) {
        raft = part;
        planks = part.getChild("planks");
        planks.setRotation(0.0F, 1.5708F, 0.0F);
        top_planks = part.getChild("top_planks");
//        rope_bottom = part.getChild("rope_bottom");
//        rope_top = part.getChild("rope_top");

    }

    public static LayerDefinition createRaftDefenition() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition definition = meshDefinition.getRoot();

        definition.addOrReplaceChild("planks", CubeListBuilder.create()
                        .texOffs(0, 0).addBox(-3.0F, -2.0F, -7.0F, 2.0F, 2.0F, 14.0F)
                        .texOffs(0, 0).addBox(1.0F, -2.0F, -7.0F, 2.0F, 2.0F, 14.0F)
                        .texOffs(0, 0).addBox(5.0F, -2.0F, -7.0F, 2.0F, 2.0F, 14.0F)
                        .texOffs(0, 0).addBox(-7.0F, -2.0F, -7.0F, 2.0F, 2.0F, 14.0F),
                PartPose.offset(0.0F, 3.5F, 0.0F));

        definition.addOrReplaceChild("top_planks", CubeListBuilder.create()
                        .texOffs(0, 0).addBox(-5.0F, -3.0F, -7.0F, 2.0F, 1.0F, 14.0F)
                        .texOffs(0, 0).addBox(-1.0F, -3.0F, -7.0F, 2.0F, 1.0F, 14.0F)
                        .texOffs(0, 0).addBox(3.0F, -3.0F, -7.0F, 2.0F, 1.0F, 14.0F),
                PartPose.offset(0.0F, 3.5F, 0.0F));

        return LayerDefinition.create(meshDefinition, 128, 64);
    }

    @Override
    public ModelPart root() {
        return raft;
    }

    @Override
    public void setupAnim(BambooRaftEntity bambooRaftEntity, float v, float v1, float v2, float v3, float v4) {

    }
}
