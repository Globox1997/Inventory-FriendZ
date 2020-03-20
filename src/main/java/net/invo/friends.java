package net.invo;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.invo.dudes.*;
import net.invo.items.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class friends implements ModInitializer {

    public static final golem1 GOLEM1 = new golem1(new Item.Settings());
    public static final golem2 GOLEM2 = new golem2(new Item.Settings());
    public static final golem3 GOLEM3 = new golem3(new Item.Settings());
    public static final golem4 GOLEM4 = new golem4(new Item.Settings());
    public static final golem5 GOLEM5 = new golem5(new Item.Settings());
    public static final golem6 GOLEM6 = new golem6(new Item.Settings());
    public static final blueemerald BLUEEMERALD = new blueemerald(new Item.Settings());
    public static final bluemagma BLUEMAGMA = new bluemagma(new Item.Settings());
    public static final blueshard BLUESHARD = new blueshard(new Item.Settings());

    public static final ItemGroup invo_GROUP = FabricItemGroupBuilder.create(new Identifier("invo", "friends"))
            .icon(() -> new ItemStack(friends.GOLEM1)).appendItems(stacks -> {
                stacks.add(new ItemStack(friends.GOLEM1));
                stacks.add(new ItemStack(friends.GOLEM2));
                stacks.add(new ItemStack(friends.GOLEM3));
                stacks.add(new ItemStack(friends.GOLEM4));
                stacks.add(new ItemStack(friends.GOLEM5));
                stacks.add(new ItemStack(friends.GOLEM6));
                stacks.add(new ItemStack(friends.BLUEEMERALD));
                stacks.add(new ItemStack(friends.BLUEMAGMA));
                stacks.add(new ItemStack(friends.BLUESHARD));

            }).build();

    @Override
    public void onInitialize() {

        Registry.register(Registry.ITEM, new Identifier("invo", "golem1"), GOLEM1);
        Registry.register(Registry.ITEM, new Identifier("invo", "golem2"), GOLEM2);
        Registry.register(Registry.ITEM, new Identifier("invo", "golem3"), GOLEM3);
        Registry.register(Registry.ITEM, new Identifier("invo", "golem4"), GOLEM4);
        Registry.register(Registry.ITEM, new Identifier("invo", "golem5"), GOLEM5);
        Registry.register(Registry.ITEM, new Identifier("invo", "golem6"), GOLEM6);
        Registry.register(Registry.ITEM, new Identifier("invo", "blueemerald"), BLUEEMERALD);
        Registry.register(Registry.ITEM, new Identifier("invo", "bluemagma"), BLUEMAGMA);
        Registry.register(Registry.ITEM, new Identifier("invo", "blueshard"), BLUESHARD);

    }

}

// You are LOVED!!!
// Jesus loves you unconditional!