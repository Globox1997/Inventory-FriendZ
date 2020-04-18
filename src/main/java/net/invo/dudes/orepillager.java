package net.invo.dudes;

import java.util.List;
import java.util.Random;

import net.invo.inits.soundinit;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class orepillager extends Item {
  public int orechoose = 0;
  public int sleeptimer = 0;
  public int questiontimer = 0;
  public int questionsound = 0;
  public int orechoosetimer = 0;
  public int craftparticle = 0;
  private int sleeptime = 1200;

  public orepillager(Settings settings) {
    super(settings);

    // ore found

    this.addPropertyGetter(new Identifier("coalfound"), (stack, world, entity) -> {
      if (orechoose == 1 && questiontimer != 0) {
        return 0.15F;
      }
      return 0F;
    });
    this.addPropertyGetter(new Identifier("diafound"), (stack, world, entity) -> {
      if (orechoose == 2 && questiontimer != 0) {
        return 0.25F;
      }
      return 0F;
    });
    this.addPropertyGetter(new Identifier("ironfound"), (stack, world, entity) -> {
      if (orechoose == 3 && questiontimer != 0) {
        return 0.35F;
      }
      return 0F;
    });
    this.addPropertyGetter(new Identifier("redfound"), (stack, world, entity) -> {
      if (orechoose == 4 && questiontimer != 0) {
        return 0.45F;
      }
      return 0F;
    });
    this.addPropertyGetter(new Identifier("goldfound"), (stack, world, entity) -> {
      if (orechoose == 5 && questiontimer != 0) {
        return 0.55F;
      }
      return 0F;
    });
    this.addPropertyGetter(new Identifier("lapisfound"), (stack, world, entity) -> {
      if (orechoose == 6 && questiontimer != 0) {
        return 0.65F;
      }
      return 0F;
    });
    this.addPropertyGetter(new Identifier("emeraldfound"), (stack, world, entity) -> {
      if (orechoose == 7 && questiontimer != 0) {
        return 0.75F;
      }
      return 0F;
    });

    // orechoosing

    this.addPropertyGetter(new Identifier("coal"), (stack, world, entity) -> {
      if (orechoose == 1 && questiontimer == 0) {
        return 0.1F;
      }
      return 0F;
    });
    this.addPropertyGetter(new Identifier("dia"), (stack, world, entity) -> {
      if (orechoose == 2 && questiontimer == 0) {
        return 0.2F;
      }
      return 0F;
    });
    this.addPropertyGetter(new Identifier("iron"), (stack, world, entity) -> {
      if (orechoose == 3 && questiontimer == 0) {
        return 0.3F;
      }
      return 0F;
    });
    this.addPropertyGetter(new Identifier("red"), (stack, world, entity) -> {
      if (orechoose == 4 && questiontimer == 0) {
        return 0.4F;
      }
      return 0F;
    });
    this.addPropertyGetter(new Identifier("gold"), (stack, world, entity) -> {
      if (orechoose == 5 && questiontimer == 0) {
        return 0.5F;
      }
      return 0F;
    });
    this.addPropertyGetter(new Identifier("lapis"), (stack, world, entity) -> {
      if (orechoose == 6 && questiontimer == 0) {
        return 0.6F;
      }
      return 0F;
    });
    this.addPropertyGetter(new Identifier("emerald"), (stack, world, entity) -> {
      if (orechoose == 7 && questiontimer == 0) {
        return 0.7F;
      }
      return 0F;
    });

    // sleep

    this.addPropertyGetter(new Identifier("sleep"), (stack, world, entity) -> {
      if (sleeptimer < 0) {
        return 0.8F;
      }
      return 0F;
    });

  }

  @Override
  public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
    tooltip.add(new TranslatableText("item.invo.orepillager.tooltip"));
  }

  @Override
  public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
    ItemStack itemStack = user.getStackInHand(hand);
    ItemStack coal = new ItemStack(Items.COAL_ORE);
    ItemStack dia = new ItemStack(Items.DIAMOND_ORE);
    ItemStack iron = new ItemStack(Items.IRON_ORE);
    ItemStack red = new ItemStack(Items.REDSTONE_ORE);
    ItemStack gold = new ItemStack(Items.GOLD_ORE);
    ItemStack lapis = new ItemStack(Items.LAPIS_ORE);
    ItemStack emerald = new ItemStack(Items.EMERALD_ORE);

    if (user.getEquippedStack(EquipmentSlot.OFFHAND).isItemEqual(coal) && user.isSneaking() && orechoosetimer == 0) {
      user.getEquippedStack(EquipmentSlot.OFFHAND).decrement(1);
      orechoose = 1;
      orechoosetimer = 100;
      user.playSound(SoundEvents.ENTITY_VILLAGER_YES, SoundCategory.NEUTRAL, 1.0F, 1.6F);
      return TypedActionResult.success(itemStack);
    }
    if (user.getEquippedStack(EquipmentSlot.OFFHAND).isItemEqual(dia) && user.isSneaking() && orechoosetimer == 0) {
      user.getEquippedStack(EquipmentSlot.OFFHAND).decrement(1);
      orechoose = 2;
      orechoosetimer = 100;
      user.playSound(SoundEvents.ENTITY_VILLAGER_YES, SoundCategory.NEUTRAL, 1.0F, 1.6F);
      return TypedActionResult.success(itemStack);
    }
    if (user.getEquippedStack(EquipmentSlot.OFFHAND).isItemEqual(iron) && user.isSneaking() && orechoosetimer == 0) {
      user.getEquippedStack(EquipmentSlot.OFFHAND).decrement(1);
      orechoose = 3;
      orechoosetimer = 100;
      user.playSound(SoundEvents.ENTITY_VILLAGER_YES, SoundCategory.NEUTRAL, 1.0F, 1.6F);
      return TypedActionResult.success(itemStack);
    }
    if (user.getEquippedStack(EquipmentSlot.OFFHAND).isItemEqual(red) && user.isSneaking() && orechoosetimer == 0) {
      user.getEquippedStack(EquipmentSlot.OFFHAND).decrement(1);
      orechoose = 4;
      orechoosetimer = 100;
      user.playSound(SoundEvents.ENTITY_VILLAGER_YES, SoundCategory.NEUTRAL, 1.0F, 1.6F);
      return TypedActionResult.success(itemStack);
    }
    if (user.getEquippedStack(EquipmentSlot.OFFHAND).isItemEqual(gold) && user.isSneaking() && orechoosetimer == 0) {
      user.getEquippedStack(EquipmentSlot.OFFHAND).decrement(1);
      orechoose = 5;
      orechoosetimer = 100;
      user.playSound(SoundEvents.ENTITY_VILLAGER_YES, SoundCategory.NEUTRAL, 1.0F, 1.6F);
      return TypedActionResult.success(itemStack);
    }
    if (user.getEquippedStack(EquipmentSlot.OFFHAND).isItemEqual(lapis) && user.isSneaking() && orechoosetimer == 0) {
      user.getEquippedStack(EquipmentSlot.OFFHAND).decrement(1);
      orechoose = 6;
      orechoosetimer = 100;
      user.playSound(SoundEvents.ENTITY_VILLAGER_YES, SoundCategory.NEUTRAL, 1.0F, 1.6F);
      return TypedActionResult.success(itemStack);
    }
    if (user.getEquippedStack(EquipmentSlot.OFFHAND).isItemEqual(emerald) && user.isSneaking() && orechoosetimer == 0) {
      user.getEquippedStack(EquipmentSlot.OFFHAND).decrement(1);
      orechoose = 7;
      orechoosetimer = 100;
      user.playSound(SoundEvents.ENTITY_VILLAGER_YES, SoundCategory.NEUTRAL, 1.0F, 1.6F);
      return TypedActionResult.success(itemStack);
    }

    return TypedActionResult.fail(itemStack);
  }

  @Override
  public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
    LivingEntity player = (LivingEntity) entity;
    PlayerEntity gamer = (PlayerEntity) player;
    BlockPos playerpos = new BlockPos(gamer.getBlockPos());

    if (slot == 0 || slot == 1 || slot == 2 || slot == 3 || slot == 4 || slot == 5 || slot == 6 || slot == 7
        || slot == 8) {
      sleeptimer++;
      if (sleeptimer < sleeptime) {
        // first layer
        BlockPos pos700 = new BlockPos(playerpos.west(3));
        BlockPos pos701 = new BlockPos(playerpos.east(3));
        BlockPos pos702 = new BlockPos(playerpos.north(3));
        BlockPos pos703 = new BlockPos(playerpos.south(3));
        // second layer
        BlockPos pos704 = new BlockPos(playerpos.west(3).up());
        BlockPos pos705 = new BlockPos(playerpos.east(3).up());
        BlockPos pos706 = new BlockPos(playerpos.north(3).up());
        BlockPos pos707 = new BlockPos(playerpos.south(3).up());
        // third layer
        BlockPos pos708 = new BlockPos(playerpos.west(2).up(2));
        BlockPos pos709 = new BlockPos(playerpos.east(2).up(2));
        BlockPos pos710 = new BlockPos(playerpos.north(2).up(2));
        BlockPos pos711 = new BlockPos(playerpos.south(2).up(2));
        // fourth layer
        BlockPos pos712 = new BlockPos(playerpos.west().up(3));
        BlockPos pos713 = new BlockPos(playerpos.east().up(3));
        BlockPos pos714 = new BlockPos(playerpos.north().up(3));
        BlockPos pos715 = new BlockPos(playerpos.south().up(3));
        // fifth layer
        BlockPos pos716 = new BlockPos(playerpos.west(2).down());
        BlockPos pos717 = new BlockPos(playerpos.east(2).down());
        BlockPos pos718 = new BlockPos(playerpos.north(2).down());
        BlockPos pos719 = new BlockPos(playerpos.south(2).down());
        // sixth layer
        BlockPos pos720 = new BlockPos(playerpos.west().down(2));
        BlockPos pos721 = new BlockPos(playerpos.east().down(2));
        BlockPos pos722 = new BlockPos(playerpos.north().down(2));
        BlockPos pos723 = new BlockPos(playerpos.south().down(2));

        if (world.getBlockState(pos700).getBlock().equals(orefinder())
            || world.getBlockState(pos701).getBlock().equals(orefinder())
            || world.getBlockState(pos702).getBlock().equals(orefinder())
            || world.getBlockState(pos703).getBlock().equals(orefinder())
            || world.getBlockState(pos704).getBlock().equals(orefinder())
            || world.getBlockState(pos705).getBlock().equals(orefinder())
            || world.getBlockState(pos706).getBlock().equals(orefinder())
            || world.getBlockState(pos707).getBlock().equals(orefinder())
            || world.getBlockState(pos708).getBlock().equals(orefinder())
            || world.getBlockState(pos709).getBlock().equals(orefinder())
            || world.getBlockState(pos710).getBlock().equals(orefinder())
            || world.getBlockState(pos711).getBlock().equals(orefinder())
            || world.getBlockState(pos712).getBlock().equals(orefinder())
            || world.getBlockState(pos713).getBlock().equals(orefinder())
            || world.getBlockState(pos714).getBlock().equals(orefinder())
            || world.getBlockState(pos715).getBlock().equals(orefinder())
            || world.getBlockState(pos716).getBlock().equals(orefinder())
            || world.getBlockState(pos717).getBlock().equals(orefinder())
            || world.getBlockState(pos718).getBlock().equals(orefinder())
            || world.getBlockState(pos719).getBlock().equals(orefinder())
            || world.getBlockState(pos720).getBlock().equals(orefinder())
            || world.getBlockState(pos721).getBlock().equals(orefinder())
            || world.getBlockState(pos722).getBlock().equals(orefinder())
            || world.getBlockState(pos723).getBlock().equals(orefinder())) {
          questiontimer++;
        }
      }
      if (sleeptimer >= sleeptime) {
        player.playSound(soundinit.SLEEPEVENT, 0.7F, 1F);
        sleeptimer = -800;
        orechoose = 0;
      }

      if (questiontimer == 1 || questiontimer == 2) {
        gamer.playSound(SoundEvents.ENTITY_VILLAGER_TRADE, SoundCategory.NEUTRAL, 1.0F, 1.6F);
      }
      if (questiontimer > 0) {
        questiontimer++;
      }
      if (questiontimer >= 100) {
        questiontimer = 0;
      }
      if (orechoosetimer > 0) {
        orechoosetimer--;
      }

    }

  }

  public Block orefinder() {
    switch (orechoose) {
      case 1:
        return Blocks.COAL_ORE;
      case 2:
        return Blocks.DIAMOND_ORE;
      case 3:
        return Blocks.IRON_ORE;
      case 4:
        return Blocks.REDSTONE_ORE;
      case 5:
        return Blocks.GOLD_ORE;
      case 6:
        return Blocks.LAPIS_ORE;
      case 7:
        return Blocks.EMERALD_ORE;
      default:
        return Blocks.STRUCTURE_VOID;
    }
  }

  @Override
  public void onCraft(ItemStack stack, World world, PlayerEntity player) {
    while (craftparticle < 60) {
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
      craftparticle++;
    }
    if (craftparticle >= 80) {
      craftparticle = 0;
    }

  }

}
