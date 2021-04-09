package dev.wuffs.bambooeverything;

import dev.wuffs.bambooeverything.blocks.BambooEverythingBlocks;
import dev.wuffs.bambooeverything.items.BambooEverythingItems;

public class BambooEverythingEventHandler {
    public void init() {
        BambooEverythingBlocks.register();
        BambooEverythingItems.register();
    }
}
