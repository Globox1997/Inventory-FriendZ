package net.invo;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.invo.config.friendconfig;
import net.invo.inits.iteminit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class friends implements ModInitializer {
    public static friendconfig FRIENDCONFIG = AutoConfig.register(friendconfig.class, GsonConfigSerializer::new)
            .getConfig();

    public static final Identifier SLEEP = new Identifier("invo:sleep");
    public static SoundEvent SLEEPEVENT = new SoundEvent(SLEEP);

    public static final ItemGroup invo_GROUP = FabricItemGroupBuilder.create(new Identifier("invo", "friends"))
            .icon(() -> new ItemStack(iteminit.GOLEM1)).appendItems(stacks -> {
                stacks.add(new ItemStack(iteminit.GOLEM1));
                stacks.add(new ItemStack(iteminit.GOLEM2));
                stacks.add(new ItemStack(iteminit.GOLEM3));
                stacks.add(new ItemStack(iteminit.GOLEM4));
                stacks.add(new ItemStack(iteminit.GOLEM5));
                stacks.add(new ItemStack(iteminit.GOLEM6));
                stacks.add(ItemStack.EMPTY);
                stacks.add(ItemStack.EMPTY);
                stacks.add(ItemStack.EMPTY);
                stacks.add(new ItemStack(iteminit.PILLAGER2));
                stacks.add(new ItemStack(iteminit.PILLAGER5));
                stacks.add(new ItemStack(iteminit.PILLAGER1));
                stacks.add(new ItemStack(iteminit.PILLAGER3));
                stacks.add(new ItemStack(iteminit.PILLAGER4));
                stacks.add(ItemStack.EMPTY);
                stacks.add(ItemStack.EMPTY);
                stacks.add(ItemStack.EMPTY);
                stacks.add(ItemStack.EMPTY);
                stacks.add(new ItemStack(iteminit.BLUEINGOT));
                stacks.add(new ItemStack(iteminit.BLUEMAGMA));
                stacks.add(new ItemStack(iteminit.BLUEFEATHER));
                stacks.add(new ItemStack(iteminit.BLUESHARD));
                stacks.add(new ItemStack(iteminit.BLUEEMERALD));
                stacks.add(new ItemStack(iteminit.BLUEQUARTZ));

            }).build();

    @Override
    public void onInitialize() {
        Registry.register(Registry.SOUND_EVENT, friends.SLEEP, SLEEPEVENT);
        AutoConfig.getConfigHolder(friendconfig.class).getConfig();
        iteminit.init();

    }

}

// You are LOVED!!!
// Jesus loves you unconditional!