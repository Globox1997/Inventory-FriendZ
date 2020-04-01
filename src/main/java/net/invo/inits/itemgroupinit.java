package net.invo.inits;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class itemgroupinit {

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

  public static void init() {

  }

}