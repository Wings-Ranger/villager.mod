package com.example.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class IronFenceBlock extends Block {
    // Width: 0.55 blocks = 8.8 pixels, centered: (16-8.8)/2 = 3.6
    // Height: 1.5 blocks = 24 pixels
    private static final VoxelShape SHAPE = Block.box(3.6, 0, 3.6, 12.4, 24, 12.4);

    public IronFenceBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }
}
