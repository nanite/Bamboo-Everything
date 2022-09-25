package dev.wuffs.entites.entity;

import dev.wuffs.entites.Entities;
import dev.wuffs.items.Items;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class BambooRaftEntity extends Boat {
    public BambooRaftEntity(EntityType<? extends BambooRaftEntity> entityType, Level level) {
        super(entityType, level);
        this.blocksBuilding = true;
    }

    public BambooRaftEntity(Level level, double x, double y , double z){
        this(Entities.RAFT.get(), level);
        this.setPos(x, y, z);
        this.xo = x;
        this.yo = y;
        this.zo = z;
    }


    @Override
    public Status getStatus() {
        Status boatentity$status = this.isUnderwater();

        if (boatentity$status != null) {
            this.waterLevel = this.getBoundingBox().maxY;
            return boatentity$status;
        } else if (this.checkInWater()) {
            return Status.IN_WATER;
        } else {
            float f = this.getGroundFriction();
            if (f > 0.0F) {
//                this.landFriction = RaftConfig.SERVER.SlipperyFast.get() ? f : 0;
                return Status.ON_LAND;
            } else {
                return Status.IN_AIR;
            }
        }
    }

    @Override
    public Item getDropItem() {
        return Items.RAFT.get();
    }

    @Override
    public ItemStack getPickResult() {
        return new ItemStack(Items.RAFT.get());
    }
}
