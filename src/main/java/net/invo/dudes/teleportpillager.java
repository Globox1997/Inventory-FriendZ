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
  public int teleportcounter = 12001;
  public int craftingeffect = 0;
  public int teleportint = 81;
  public int sleeptimer = 19;
  public int spawnpointnotset = 19;
  public int spawnpointset = 19;
  public int dimensiontest = 19;
  public int endertest = 19;
  boolean teleportok = true;

  public teleportpillager(Settings settings) {
    super(settings);
    this.addPropertyGetter(new Identifier("sleep"), (stack, world, entity) -> {
      if (teleportcounter > 0 && teleportcounter < 120) { // 12000
        return 1F;
      }
      return 0F;
    });
  }

  @Override
  public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
    tooltip.add(new TranslatableText("item.invo.teleportpillager.tooltip"));
    tooltip.add(new TranslatableText("item.invo.teleportpillager.tooltip2"));
  }

  @Override
  public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
    ItemStack itemStack = user.getStackInHand(hand);
    ItemStack pearl = new ItemStack(Items.ENDER_PEARL);
    int pearlslot = user.inventory.getSlotWithStack(pearl);
    if (user.isSneaking() && user.dimension.equals(DimensionType.OVERWORLD)) {
      xposition = user.getX();
      yposition = user.getY();
      zposition = user.getZ();
      spawnpointset = 1;
      return TypedActionResult.success(itemStack);
    }
    if (user.isSneaking() && !user.dimension.equals(DimensionType.OVERWORLD)) {
      dimensiontest = 0;
    }
    if (xposition != 0 && (teleportcounter >= 120 || teleportcounter <= 1) && user.inventory.contains(pearl)) {
      teleportint = 0;
      teleportcounter = 0;
      user.inventory.removeStack(pearlslot, 1);
      return TypedActionResult.success(itemStack);

    } else {
      if (xposition == 0) {
        spawnpointnotset = 1;
        return TypedActionResult.fail(itemStack);

      } else {
        if (!user.inventory.contains(pearl)) {
          endertest = 1;
          return TypedActionResult.fail(itemStack);

        } else {
          sleeptimer = 1;

          return TypedActionResult.fail(itemStack);
        }
      }
    }

  }

  public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
    LivingEntity player = (LivingEntity) entity;
    if (slot == 0 || slot == 1 || slot == 2 || slot == 3 || slot == 4 || slot == 5 || slot == 6 || slot == 7
        || slot == 8) {
      if (teleportcounter < 120) { // 12000
        teleportcounter++;

      }
      if (teleportcounter == 1) {
        player.playSound(soundinit.SLEEPEVENT, 0.7F, 1F);
      }

      if (teleportint < 80) {
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
        teleportint++;
      }

      if (teleportint == 58 || teleportint == 57) {
        if (!player.dimension.equals(DimensionType.OVERWORLD)) {
          player.changeDimension(DimensionType.OVERWORLD);
        }
        player.teleport(xposition, yposition, zposition);
        player.playSound(SoundEvents.ENTITY_ENDERMAN_TELEPORT, 0.8F, 1.0F);
      }

      if (sleeptimer < 18) {
        sleeptimer++;
        if (sleeptimer == 16) {
          player.sendSystemMessage(new TranslatableText("item.invo.teleportpillagermissing"));
        }
      }

      if (spawnpointnotset < 18) {
        spawnpointnotset++;
        if (spawnpointnotset == 16) {
          player.sendSystemMessage(new TranslatableText("item.invo.teleportpillagernotset"));
        }
      }

      if (spawnpointset < 18) {
        spawnpointset++;
        if (spawnpointset == 16) {
          player.sendSystemMessage(new TranslatableText("item.invo.teleportpillagersave"));

        }
      }

      if (dimensiontest < 18) {
        dimensiontest++;
        if (dimensiontest == 16) {
          player.sendSystemMessage(new TranslatableText("item.invo.teleportpillagerdimension"));

        }
      }

      if (endertest < 18) {
        endertest++;
        if (endertest == 16) {
          player.sendSystemMessage(new TranslatableText("item.invo.teleportpillagerpearl"));

        }
      }

    }
  }

  public void onCraft(ItemStack stack, World world, PlayerEntity player) {
    while (craftingeffect < 60) {
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
      craftingeffect++;
    }
    if (craftingeffect >= 80) {
      craftingeffect = 0;
    }

  }

}
