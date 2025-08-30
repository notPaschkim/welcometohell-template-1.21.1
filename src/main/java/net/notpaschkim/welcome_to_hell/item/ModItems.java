package net.notpaschkim.welcome_to_hell.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.notpaschkim.welcome_to_hell.WelcometoHell;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WelcometoHell.MODID);

    public static final DeferredItem<Item> DEMONITE = ITEMS.register("demonite",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_DEMONITE = ITEMS.register("raw_demonite",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
