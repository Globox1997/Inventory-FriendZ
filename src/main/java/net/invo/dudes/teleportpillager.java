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
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class teleportpillager extends Item {
  double xposition = 0;
  double yposition;
  double zposition;
  public static int count = 12001;
  public static int count2 = 0;
  public static int count3 = 0;
  public static int count4 = 81;
  public static int count5 = 11;
  public static int count6 = 11;
  public static int count7 = 11;
  public static int count8 = 11;
  boolean teleportok = true;

  public teleportpillager(Settings settings) {
    super(settings);
    this.addPropertyGetter(new Identifier("sleep"), (stack, world, entity) -> {
      if (count > 0 && count < 12000) {
        return 1F;
      }
      return 0F;
    });
  }

  @Override
  public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
    tooltip.add(new TranslatableText("item.invo.teleportpillager.tooltip"));
  }

  @Override
  public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
    ItemStack itemStack = user.getStackInHand(hand);
    if (user.isSneaking() && user.dimension.equals(DimensionType.OVERWORLD)) {
      xposition = user.getX();
      yposition = user.getY();
      zposition = user.getZ();
      count7 = 1;
      return TypedActionResult.success(itemStack);
    } else {
      count8 = 0;
    }
    if (xposition != 0 && (count >= 239 || count <= 1)) {

      count4 = 0;
      count = 0;

      return TypedActionResult.success(itemStack);

    } else {
      if (xposition == 0) {
        count6 = 1;

      } else {
        count5 = 1;

      }

    }
    return TypedActionResult.fail(itemStack);
  }

  public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
    LivingEntity player = (LivingEntity) entity;
    if (slot == 0 || slot == 1 || slot == 2 || slot == 3 || slot == 4 || slot == 5 || slot == 6 || slot == 7
        || slot == 8) {
      if (count < 12000) {
        count++;

      }
      if (count == 1) {
        player.playSound(soundinit.SLEEPEVENT, 0.7F, 1F);
      }

      if (count4 == 58 || count4 == 57) {
        if (!player.dimension.equals(DimensionType.OVERWORLD)) {
          player.changeDimension(DimensionType.OVERWORLD);
        }
        player.teleport(xposition, yposition, zposition);
        player.playSound(SoundEvents.ENTITY_ENDERMAN_TELEPORT, 1F, 0.1F);
      }

      if (count4 < 80) {
        Random random = new Random();
        Random random2 = new Random();
        Random random3 = new Random();
        double z1 = (random.nextInt() % 50);
        double z2 = z1 / 100;
        double z3 = random2.nextInt() % 50;
        double z4 = z3 / 100;
        double z5 = random3.nextInt() % 180;
        double z6 = z5 / 100;
        world.addParticle(ParticleTypes.PORTAL, player.getX() + z2, player.getY() + z6, player.getZ() + z4, 0.0D, 0.0D,
            0.0D);
        count4++;
      }
      if (count5 < 10) {
        count5++;
        if (count5 == 8) {
          player.sendSystemMessage(new TranslatableText("item.invo.teleportpillagermissing"));
        }
      }
      if (count6 < 10) {
        count6++;
        if (count6 == 8) {
          player.sendSystemMessage(new TranslatableText("item.invo.teleportpillagernotset"));
        }
      }
      if (count7 < 10) {
        count7++;
        if (count7 == 8) {
          player.sendSystemMessage(new TranslatableText("item.invo.teleportpillagersave"));

        }
      }
      if (count8 < 10) {
        count8++;
        if (count8 == 8) {
          player.sendSystemMessage(new TranslatableText("item.invo.teleportpillagerdimension"));

        }
      }

    }
  }

  public void onCraft(ItemStack stack, World world, PlayerEntity player) {
    while (count2 < 60) {
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
      count2++;
    }
    if (count2 >= 80) {
      count2 = 0;
    }

  }

}
