package net.streets_of_war.backpacks_and_more.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.streets_of_war.backpacks_and_more.backpacks_and_more;
import net.streets_of_war.backpacks_and_more.item.Costum.DayPack;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, backpacks_and_more.MOD_ID);

    public static final RegistryObject <Item> berkut = ITEMS.register("berkut",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject <Item> day_pack = ITEMS.register("day_pack",
            () -> new DayPack(new Item.Properties().stacksTo(1)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }
}
