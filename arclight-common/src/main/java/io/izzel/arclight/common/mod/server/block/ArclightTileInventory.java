package io.izzel.arclight.common.mod.server.block;

import net.minecraft.world.Container;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.v.block.CraftBlockEntityState;
import org.bukkit.craftbukkit.v.inventory.CraftInventory;
import org.bukkit.inventory.BlockInventoryHolder;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

public class ArclightTileInventory<T extends BlockEntity & Container> extends CraftBlockEntityState<T> implements BlockInventoryHolder {

    public ArclightTileInventory(Block block, Class<T> tileEntityClass) {
        super(block, tileEntityClass);
    }

    @Override
    public @NotNull Inventory getInventory() {
        return new CraftInventory(this.getTileEntity());
    }
}
