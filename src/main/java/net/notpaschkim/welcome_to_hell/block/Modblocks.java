package net.notpaschkim.welcome_to_hell.block;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.notpaschkim.welcome_to_hell.WelcometoHell;

public class Modblocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(WelcometoHell.MODID);


    public static void register(IEventBus eventBus){ BLOCKS.register(eventBus) }
    }
}
