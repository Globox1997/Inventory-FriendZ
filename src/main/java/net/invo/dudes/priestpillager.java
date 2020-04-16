package net.invo.dudes;

import java.util.List;
import java.util.Random;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class priestpillager extends Item {
  public static int itemtimer = 0;
  public static int effect = 0;
  public float lifegen = 0;

  public priestpillager(Settings settings) {
    super(settings);
    this.addPropertyGetter(new Identifier("phase1"), (stack, world, entity) -> {
      if (lifegen == 1) {
        return 0.2F;
      }
      return 0F;
    });
    this.addPropertyGetter(new Identifier("phase2"), (stack, world, entity) -> {
      if (lifegen == 2) {
        return 0.4F;
      }
      return 0F;
    });
    this.addPropertyGetter(new Identifier("phase3"), (stack, world, entity) -> {
      if (lifegen == 3) {
        return 0.8F;
      }
      return 0F;
    });
    this.addPropertyGetter(new Identifier("phase4"), (stack, world, entity) -> {
      if (lifegen == 4) {
        return 1F;
      }
      return 0F;
    });

  }

  @Override
  public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
    tooltip.add(new TranslatableText("item.invo.priestpillager.tooltip"));
    tooltip.add(new TranslatableText("item.invo.priestpillager.tooltip2"));
  }

  @Override
  public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
    ItemStack itemStack = user.getStackInHand(hand);
    if (lifegen > 0) {
      float life = user.getHealth();
      user.setHealth(life + (lifegen * 2));
      user.playSound(SoundEvents.ENTITY_VILLAGER_CELEBRATE, 0.8F, 1.5F);
      lifegen = 0;
      return TypedActionResult.success(itemStack);

    }
    return TypedActionResult.fail(itemStack);
  }

  public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
    if (slot == 0 || slot == 1 || slot == 2 || slot == 3 || slot == 4 || slot == 5 || slot == 6 || slot == 7
        || slot == 8) {
      if (lifegen < 4) {
        itemtimer++;
        if (itemtimer >= 1000) {
          lifegen = lifegen + 1F;
          itemtimer = 0;
        }
      }
    }
  }

  public void onCraft(ItemStack stack, World world, PlayerEntity player) {
    while (effect < 60) {
      Random random = new Random();
      Random random2 = new Random();
      Random random3 = new Random();
      double z1 = (random.nextInt() % 50);
      double z2 = z1 / 100;
      double z3 = random2.nextInt() % 50;
      double z4 = z3 / 100;
      double z5 = random3.nextInt() % 180;
      double z6 = z5 / 100;
      world.addParticle(ParticleTypes.END_ROD, player.getX() + z2, player.getY() + z6, player.getZ() + z4, 0.0D, 0.0D,
          0.0D);
      effect++;
    }
    if (effect >= 80) {
      effect = 0;
    }

  }

}
