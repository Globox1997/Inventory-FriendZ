package net.invo.inits;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.invo.config.friendconfig;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class itemgroupinit {

  public static final ItemGroup invo_GROUP = FabricItemGroupBuilder.create(new Identifier("invo", "friends"))
      .icon(() -> new ItemStack(iteminit.MARINEPILLAGER)).appendItems(stacks -> {
        if (friendconfig.earthpillager == true) {
          stacks.add(new ItemStack(iteminit.EARTHPILLAGER));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        if (friendconfig.endpillager == true) {
          stacks.add(new ItemStack(iteminit.ENDPILLAGER));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        if (friendconfig.foodpillager == true) {
          stacks.add(new ItemStack(iteminit.FOODPILLAGER));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        if (friendconfig.marinepillager == true) {
          stacks.add(new ItemStack(iteminit.MARINEPILLAGER));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        if (friendconfig.netherpillager == true) {
          stacks.add(new ItemStack(iteminit.NETHERPILLAGER));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        if (friendconfig.priestpillager == true) {
          stacks.add(new ItemStack(iteminit.PRIESTPILLAGER));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        if (friendconfig.teleportpillager == true) {
          stacks.add(new ItemStack(iteminit.TELEPORTPILLAGER));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        if (friendconfig.orepillager == true) {
          stacks.add(new ItemStack(iteminit.OREPILLAGER));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        stacks.add(ItemStack.EMPTY);

        if (friendconfig.fireresistancetotem == true) {
          stacks.add(new ItemStack(iteminit.FIRERESISTANCETOTEM1));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        if (friendconfig.hastetotem == true) {
          stacks.add(new ItemStack(iteminit.HASTETOTEM1));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        if (friendconfig.nightvisiontotem == true) {
          stacks.add(new ItemStack(iteminit.NIGHTVISIONTOTEM1));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        if (friendconfig.resistancetotem == true) {
          stacks.add(new ItemStack(iteminit.RESISTANCETOTEM1));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        if (friendconfig.speedtotem == true) {
          stacks.add(new ItemStack(iteminit.SPEEDTOTEM1));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        if (friendconfig.strengthtotem == true) {
          stacks.add(new ItemStack(iteminit.STRENGTHTOTEM1));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        if (friendconfig.waterbreathtotem == true) {
          stacks.add(new ItemStack(iteminit.WATERBREATHINGTOTEM1));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        stacks.add(ItemStack.EMPTY);
        stacks.add(ItemStack.EMPTY);
        stacks.add(new ItemStack(iteminit.FIRERESISTANCETOTEM2));
        stacks.add(new ItemStack(iteminit.HASTETOTEM2));
        stacks.add(new ItemStack(iteminit.NIGHTVISIONTOTEM2));
        stacks.add(new ItemStack(iteminit.RESISTANCETOTEM2));
        stacks.add(new ItemStack(iteminit.SPEEDTOTEM2));
        stacks.add(new ItemStack(iteminit.STRENGTHTOTEM2));
        stacks.add(new ItemStack(iteminit.WATERBREATHINGTOTEM2));
        stacks.add(ItemStack.EMPTY);
        stacks.add(ItemStack.EMPTY);
        stacks.add(new ItemStack(iteminit.FIRERESISTANCETOTEM3));
        stacks.add(new ItemStack(iteminit.HASTETOTEM3));
        stacks.add(new ItemStack(iteminit.NIGHTVISIONTOTEM3));
        stacks.add(new ItemStack(iteminit.RESISTANCETOTEM3));
        stacks.add(new ItemStack(iteminit.SPEEDTOTEM3));
        stacks.add(new ItemStack(iteminit.STRENGTHTOTEM3));
        stacks.add(new ItemStack(iteminit.WATERBREATHINGTOTEM3));
        stacks.add(ItemStack.EMPTY);
        stacks.add(ItemStack.EMPTY);
        stacks.add(new ItemStack(iteminit.WOODTOTEM));
        stacks.add(new ItemStack(iteminit.BLUEINGOT));
        stacks.add(new ItemStack(iteminit.BLUEMAGMA));
        stacks.add(new ItemStack(iteminit.BLUEFEATHER));
        stacks.add(new ItemStack(iteminit.BLUESHARD));
        stacks.add(new ItemStack(iteminit.BLUEEMERALD));
        stacks.add(new ItemStack(iteminit.BLUEQUARTZ));
        stacks.add(new ItemStack(iteminit.BLUEEYE));
        stacks.add(ItemStack.EMPTY);

        if (friendconfig.invisiblepillager == true) {
          stacks.add(new ItemStack(iteminit.PILLAGER1));
        }
        if (friendconfig.fallingpillager == true) {
          stacks.add(new ItemStack(iteminit.PILLAGER3));
        }
        if (friendconfig.conduitingpillager == true) {
          stacks.add(new ItemStack(iteminit.PILLAGER4));
        }
        if (friendconfig.luckypillager == true) {
          stacks.add(new ItemStack(iteminit.PILLAGER5));
        }
        if (friendconfig.optotem == true) {
          stacks.add(new ItemStack(iteminit.OPTOTEM));
        }

      }).build();

  public static void init() {

  }

}