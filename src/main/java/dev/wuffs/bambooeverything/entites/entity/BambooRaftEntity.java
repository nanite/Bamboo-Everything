package dev.wuffs.bambooeverything.entites.entity;

import dev.wuffs.bambooeverything.entites.BambooEverythingEntities;
import dev.wuffs.bambooeverything.items.BambooEverythingItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.fmllegacy.network.FMLPlayMessages;

public class BambooRaftEntity extends Boat {
    public BambooRaftEntity(EntityType<? extends BambooRaftEntity> entityType, Level level) {
        super(entityType, level);
        this.blocksBuilding = true;
    }

    public BambooRaftEntity(Level level, double x, double y , double z){
        this(BambooEverythingEntities.RAFT.get(), level);
        this.setPos(x, y, z);
        this.xo = x;
        this.yo = y;
        this.zo = z;
    }

    public BambooRaftEntity(FMLPlayMessages.SpawnEntity spawnEntity, Level level) {
        this(BambooEverythingEntities.RAFT.get(), level);
    }

    @Override
    public Status getStatus() {
        Boat.Status boatentity$status = this.isUnderwater();

        if (boatentity$status != null) {
            this.waterLevel = this.getBoundingBox().maxY;
            return boatentity$status;
        } else if (this.checkInWater()) {
            return Boat.Status.IN_WATER;
        } else {
            float f = this.getGroundFriction();
            if (f > 0.0F) {
//                this.landFriction = RaftConfig.SERVER.SlipperyFast.get() ? f : 0;
                return Boat.Status.ON_LAND;
            } else {
                return Boat.Status.IN_AIR;
            }
        }
    }

    @Override
    public Item getDropItem() {
        return BambooEverythingItems.RAFT.get();
    }

    @Override
    public ItemStack getPickedResult(HitResult target) {
        return new ItemStack(BambooEverythingItems.RAFT.get());
    }
}
