package net.invo.dudes;

import java.util.List;
import java.util.Random;

import net.invo.inits.soundinit;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

public class endpillager extends Item {
  public static int itemtimer = 0;
  public static int effect = 0;

  public endpillager(Settings settings) {
    super(settings);

  }

  @Override
  public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
    tooltip.add(new TranslatableText("item.invo.endpillager.tooltip"));
  }

  public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
    LivingEntity player = (LivingEntity) entity;
    PlayerEntity gamer = (PlayerEntity) player;
    ItemStack nugget = new ItemStack(Items.GOLD_NUGGET);
    int nuggetslot = gamer.inventory.getSlotWithStack(nugget);

    if (slot == 0 || slot == 1 || slot == 2 || slot == 3 || slot == 4 || slot == 5 || slot == 6 || slot == 7
        || slot == 8 && !world.isClient) {
      if (gamer.inventory.contains(nugget)) {
        itemtimer++;
        if (itemtimer >= 1500) {
          itemtimer = 0;
          gamer.inventory.insertStack(loot());
          gamer.inventory.removeStack(nuggetslot, 1);
          gamer.playSound(soundinit.TRADERSOUNDEVENT, 0.5F, 1.0F);
        }
      }
    }
  }

  public ItemStack loot() {
    Random random = new Random();
    int randomNumber = random.nextInt() % 5;
    if (randomNumber < 0) {
      randomNumber = randomNumber * (-1);
    }

    switch (randomNumber) {
      case 0:
        return new ItemStack(Items.CHORUS_FRUIT);
      case 1:
        return new ItemStack(Items.ENDER_PEARL);
      case 2:
        return new ItemStack(Items.DRAGON_BREATH);
      case 3:
        return new ItemStack(Items.PHANTOM_MEMBRANE);
      case 4:
        return new ItemStack(Items.SHULKER_SHELL);
      default:
        return new ItemStack(Items.CHORUS_FRUIT);

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
