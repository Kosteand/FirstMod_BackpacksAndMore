package net.streets_of_war.backpacks_and_more.item.Costum;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.streets_of_war.backpacks_and_more.backpacks_and_more.MOD_ID;

public class DayPack extends Item {

    public DayPack(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {

        if(interactionHand == InteractionHand.MAIN_HAND){
            player.sendSystemMessage(Component.literal("right clicked item"));
            player.getCooldowns().addCooldown(this, 30);
        }
        return super.use(level, player, interactionHand);
    }



    }



