package net.invo.inits;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.invo.config.friendconfig;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class itemgroupinit {

  public static final ItemGroup invo_GROUP = FabricItemGroupBuilder.create(new Identifier("invo", "friends"))
      .icon(() -> new ItemStack(iteminit.MARINEPILLAGER)).appendItems(stacks -> {
        if (AutoConfig.getConfigHolder(friendconfig.class).getConfig().earthpillager) {
          stacks.add(new ItemStack(iteminit.EARTHPILLAGER));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        if (AutoConfig.getConfigHolder(friendconfig.class).getConfig().endpillager) {
          stacks.add(new ItemStack(iteminit.ENDPILLAGER));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        if (AutoConfig.getConfigHolder(friendconfig.class).getConfig().foodpillager) {
          stacks.add(new ItemStack(iteminit.FOODPILLAGER));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        if (AutoConfig.getConfigHolder(friendconfig.class).getConfig().marinepillager) {
          stacks.add(new ItemStack(iteminit.MARINEPILLAGER));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        if (AutoConfig.getConfigHolder(friendconfig.class).getConfig().netherpillager) {
          stacks.add(new ItemStack(iteminit.NETHERPILLAGER));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        if (AutoConfig.getConfigHolder(friendconfig.class).getConfig().priestpillager) {
          stacks.add(new ItemStack(iteminit.PRIESTPILLAGER));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        if (AutoConfig.getConfigHolder(friendconfig.class).getConfig().teleportpillager) {
          stacks.add(new ItemStack(iteminit.TELEPORTPILLAGER));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        if (AutoConfig.getConfigHolder(friendconfig.class).getConfig().orepillager) {
          stacks.add(new ItemStack(iteminit.OREPILLAGER));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        stacks.add(ItemStack.EMPTY);

        if (AutoConfig.getConfigHolder(friendconfig.class).getConfig().fireresistancetotem) {
          stacks.add(new ItemStack(iteminit.FIRERESISTANCETOTEM1));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        if (AutoConfig.getConfigHolder(friendconfig.class).getConfig().hastetotem) {
          stacks.add(new ItemStack(iteminit.HASTETOTEM1));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        if (AutoConfig.getConfigHolder(friendconfig.class).getConfig().nightvisiontotem) {
          stacks.add(new ItemStack(iteminit.NIGHTVISIONTOTEM1));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        if (AutoConfig.getConfigHolder(friendconfig.class).getConfig().resistancetotem) {
          stacks.add(new ItemStack(iteminit.RESISTANCETOTEM1));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        if (AutoConfig.getConfigHolder(friendconfig.class).getConfig().speedtotem) {
          stacks.add(new ItemStack(iteminit.SPEEDTOTEM1));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        if (AutoConfig.getConfigHolder(friendconfig.class).getConfig().strengthtotem) {
          stacks.add(new ItemStack(iteminit.STRENGTHTOTEM1));
        } else {
          stacks.add(ItemStack.EMPTY);
        }
        if (AutoConfig.getConfigHolder(friendconfig.class).getConfig().waterbreathtotem) {
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

        if (AutoConfig.getConfigHolder(friendconfig.class).getConfig().invisiblepillager) {
          stacks.add(new ItemStack(iteminit.PILLAGER1));
        }
        if (AutoConfig.getConfigHolder(friendconfig.class).getConfig().fallingpillager) {
          stacks.add(new ItemStack(iteminit.PILLAGER3));
        }
        if (AutoConfig.getConfigHolder(friendconfig.class).getConfig().conduitingpillager) {
          stacks.add(new ItemStack(iteminit.PILLAGER4));
        }
        if (AutoConfig.getConfigHolder(friendconfig.class).getConfig().luckypillager) {
          stacks.add(new ItemStack(iteminit.PILLAGER5));
        }
        if (AutoConfig.getConfigHolder(friendconfig.class).getConfig().optotem) {
          stacks.add(new ItemStack(iteminit.OPTOTEM));
        }

      }).build();

  public static void init() {

  }

}