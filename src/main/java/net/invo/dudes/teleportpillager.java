package net.invo.dudes;

import java.util.List;
import java.util.Random;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import net.invo.config.friendconfig;
import net.invo.inits.soundinit;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class teleportpillager extends Item {
  public int teleportcounter = 12001;
  private int craftingeffect = 0;
  private int teleportint = 91;
  private int sleeptimer = 19;
  private int spawnpointnotset = 19;
  private int spawnpointset = 19;
  private int endertest = 19;
  private int falsedim = 19;

  public teleportpillager(Settings settings) {
    super(settings);

  }

  @Override
  public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
    tooltip.add(new TranslatableText("item.invo.teleportpillager.tooltip"));
    tooltip.add(new TranslatableText("item.invo.teleportpillager.tooltip2"));
    tooltip.add(new TranslatableText("item.invo.teleportpillager.tooltip3"));
    tooltip.add(new TranslatableText("item.invo.teleportpillager.tooltip4"));
    if (!AutoConfig.getConfigHolder(friendconfig.class).getConfig().teleportpillager) {
      tooltip.add(new TranslatableText("item.invo.deactivated"));
    }
  }

  @Override
  public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
    ItemStack itemStack = user.getStackInHand(hand);
    ItemStack pearl = new ItemStack(Items.ENDER_PEARL);
    int pearlslot = user.inventory.getSlotWithStack(pearl);
    CompoundTag tags = itemStack.getTag();

    if (user.isSneaking()) {
      spawnpointset = 1;
      itemStack.setTag(new CompoundTag());
      tags = itemStack.getTag();
      tags.putDouble("xposition", user.getX());
      tags.putDouble("yposition", user.getY());
      tags.putDouble("zposition", user.getZ());
      tags.putString("dimpos", user.world.getDimensionRegistryKey().getValue().toString());
      return TypedActionResult.success(itemStack);
    } else {
      if (itemStack.hasTag() && teleportcounter >= 12000 && user.inventory.contains(pearl) && user.world
          .getDimensionRegistryKey().getValue().toString().equals(itemStack.getTag().getString("dimpos"))) {
        teleportint = 0;
        teleportcounter = 0;
        if (!world.isClient) {
          user.inventory.removeStack(pearlslot, 1);
        }
        return TypedActionResult.success(itemStack);
      } else {
        if (!itemStack.hasTag()) {
          spawnpointnotset = 1;
          return TypedActionResult.fail(itemStack);
        } else {
          if (!user.inventory.contains(pearl)) {
            endertest = 1;
            return TypedActionResult.fail(itemStack);
          } else {
            if (teleportcounter < 12000 && teleportcounter > 10) {
              sleeptimer = 1;
              return TypedActionResult.fail(itemStack);
            } else {
              if (!user.world.getDimensionRegistryKey().getValue().toString()
                  .equals(itemStack.getTag().getString("dimpos"))) {
                falsedim = 1;
              } else
                System.out.println("fail?");
              return TypedActionResult.fail(itemStack);
            }
          }
        }
      }
    }

  }

  @Override
  public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
    LivingEntity livingEntity = (LivingEntity) entity;
    PlayerEntity player = (PlayerEntity) livingEntity;
    CompoundTag tags = stack.getTag();
    if (AutoConfig.getConfigHolder(friendconfig.class).getConfig().teleportpillager) {
      if (slot == 0 || slot == 1 || slot == 2 || slot == 3 || slot == 4 || slot == 5 || slot == 6 || slot == 7
          || slot == 8 && !world.isClient) {
        if (teleportcounter < 12000) {
          teleportcounter++;
        }
        if (teleportcounter == 1) {
          player.playSound(soundinit.SLEEPEVENT, 0.7F, 1F);
        }
        if (teleportint < 90 && !world.isClient) {
          if (teleportint == 60) {
            if (!world.isClient && player instanceof ServerPlayerEntity) {
              ServerPlayerEntity serverplayer = (ServerPlayerEntity) player;
              serverplayer.teleport(tags.getDouble("xposition"), tags.getDouble("yposition"),
                  tags.getDouble("zposition"), true);
            }
          }
          teleportint++;
        }
        if (world.isClient && teleportint == 60) {
          player.playSound(SoundEvents.ENTITY_ENDERMAN_TELEPORT, 0.8F, 1.0F);
        }

        if (sleeptimer < 18) {
          sleeptimer++;
          if (sleeptimer == 16) {
            player.sendMessage(new TranslatableText("item.invo.teleportpillagermissing"), true);
          }
        }
        if (spawnpointnotset < 18) {
          spawnpointnotset++;
          if (spawnpointnotset == 16) {
            player.sendMessage(new TranslatableText("item.invo.teleportpillagernotset"), true);
          }
        }
        if (spawnpointset < 18) {
          spawnpointset++;
          if (spawnpointset == 16) {
            player.sendMessage(new TranslatableText("item.invo.teleportpillagersave"), true);

          }
        }
        if (endertest < 18) {
          endertest++;
          if (endertest == 16) {
            player.sendMessage(new TranslatableText("item.invo.teleportpillagerpearl"), true);
          }
        }
        if (falsedim < 18) {
          falsedim++;
          if (falsedim == 16) {
            player.sendMessage(new TranslatableText("item.invo.teleportpillagerfalsedim"), true);
          }
        }
      }
    }
  }

  @Override
  public void onCraft(ItemStack stack, World world, PlayerEntity player) {
    while (craftingeffect < 60 && world.isClient) {
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
