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
        stacks.add(new ItemStack(iteminit.EARTHPILLAGER));
        stacks.add(new ItemStack(iteminit.ENDPILLAGER));
        stacks.add(new ItemStack(iteminit.FOODPILLAGER));
        stacks.add(new ItemStack(iteminit.MARINEPILLAGER));
        stacks.add(new ItemStack(iteminit.NETHERPILLAGER));
        stacks.add(new ItemStack(iteminit.PRIESTPILLAGER));
        stacks.add(new ItemStack(iteminit.TELEPORTPILLAGER));
        stacks.add(new ItemStack(iteminit.OREPILLAGER));
        stacks.add(ItemStack.EMPTY);
        stacks.add(new ItemStack(iteminit.FIRERESISTANCETOTEM1));
        stacks.add(new ItemStack(iteminit.HASTETOTEM1));
        stacks.add(new ItemStack(iteminit.NIGHTVISIONTOTEM1));
        stacks.add(new ItemStack(iteminit.RESISTANCETOTEM1));
        stacks.add(new ItemStack(iteminit.SPEEDTOTEM1));
        stacks.add(new ItemStack(iteminit.STRENGTHTOTEM1));
        stacks.add(new ItemStack(iteminit.WATERBREATHINGTOTEM1));
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