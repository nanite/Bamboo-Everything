// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class bamboo_raft extends EntityModel<Entity> {
	private final ModelRenderer planks;
	private final ModelRenderer bottom;
	private final ModelRenderer cube_r1;
	private final ModelRenderer top;

	public bamboo_raft() {
		texWidth = 128;
		texHeight = 64;

		planks = new ModelRenderer(this);
		planks.setPos(0.0F, 24.0F, 0.0F);
		

		bottom = new ModelRenderer(this);
		bottom.setPos(0.0F, 0.0F, 0.0F);
		planks.addChild(bottom);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 0.0F, 0.0F);
		bottom.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 1.5708F, 0.0F);
		cube_r1.texOffs(0, 0).addBox(-3.0F, -2.0F, -7.0F, 2.0F, 2.0F, 14.0F, 0.0F, false);
		cube_r1.texOffs(0, 0).addBox(1.0F, -2.0F, -7.0F, 2.0F, 2.0F, 14.0F, 0.0F, false);
		cube_r1.texOffs(0, 0).addBox(5.0F, -2.0F, -7.0F, 2.0F, 2.0F, 14.0F, 0.0F, false);
		cube_r1.texOffs(0, 0).addBox(-7.0F, -2.0F, -7.0F, 2.0F, 2.0F, 14.0F, 0.0F, false);

		top = new ModelRenderer(this);
		top.setPos(0.0F, 0.0F, 0.0F);
		planks.addChild(top);
		top.texOffs(0, 0).addBox(-5.0F, -3.0F, -7.0F, 2.0F, 1.0F, 14.0F, 0.0F, false);
		top.texOffs(0, 0).addBox(-1.0F, -3.0F, -7.0F, 2.0F, 1.0F, 14.0F, 0.0F, false);
		top.texOffs(0, 0).addBox(3.0F, -3.0F, -7.0F, 2.0F, 1.0F, 14.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		planks.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}