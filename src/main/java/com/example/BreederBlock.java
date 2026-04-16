package com.example; // Change this if your folder name is different!

import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.sound.BlockSoundGroup;

public class BreederBlock extends Block {

    // This is the "constructor". It sets the physical properties of the block.
    public BreederBlock() {
        super(AbstractBlock.Settings.create()
                .strength(2.0f) // How hard it is to mine (2.0 is roughly like wood/glass)
                .sounds(BlockSoundGroup.GLASS) // It will sound like glass when you walk on or break it
                .nonOpaque() // Tells the game light can pass through it
        );
    }
}