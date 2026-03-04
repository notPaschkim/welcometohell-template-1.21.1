package net.notpaschkim.welcome_to_hell.block;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.notpaschkim.welcome_to_hell.WelcometoHell;
import net.notpaschkim.welcome_to_hell.item.ModItems;

import java.util.function.Supplier;

public class Modblocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
            // The registry we want to use.
            // Minecraft's registries can be found in BuiltInRegistries, NeoForge's registries can be found in NeoForgeRegistries.
            // Mods may also add their own registries, refer to the individual mod's documentation or source code for where to find them.
            BuiltInRegistries.BLOCK,
            // Our mod id.
            WelcometoHell.MODID
    );




    public static final Supplier<Block> DEMONITE_BLOCK = BLOCKS.register("demonite_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}

