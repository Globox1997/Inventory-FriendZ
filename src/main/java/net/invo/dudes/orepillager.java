package net.invo.dudes;

import java.util.List;
import java.util.Random;

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
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class orepillager extends Item {
  public int orechoose;
  public int craftparticle = 0;

  public orepillager(Settings settings) {
    super(settings);
    // this.addPropertyGetter(new Identifier("sleep"), (stack, world, entity) -> {
    // if (count < 0) {
    // return 1F;
    // }
    // return 0F;
    // });
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

    if (user.getEquippedStack(EquipmentSlot.OFFHAND).isItemEqual(coal) && user.isSneaking()) {
      user.sendSystemMessage(new TranslatableText("orefunzt"));
      user.getEquippedStack(EquipmentSlot.OFFHAND).decrement(1);
      orechoose = 1;
      return TypedActionResult.success(itemStack);
    }
    if (user.getEquippedStack(EquipmentSlot.OFFHAND).isItemEqual(dia) && user.isSneaking()) {
      user.sendSystemMessage(new TranslatableText("orefunzt"));
      user.getEquippedStack(EquipmentSlot.OFFHAND).decrement(1);
      orechoose = 2;
      return TypedActionResult.success(itemStack);
    }
    if (user.getEquippedStack(EquipmentSlot.OFFHAND).isItemEqual(iron) && user.isSneaking()) {
      user.sendSystemMessage(new TranslatableText("orefunzt"));
      user.getEquippedStack(EquipmentSlot.OFFHAND).decrement(1);
      orechoose = 3;
      return TypedActionResult.success(itemStack);
    }
    if (user.getEquippedStack(EquipmentSlot.OFFHAND).isItemEqual(red) && user.isSneaking()) {
      user.sendSystemMessage(new TranslatableText("orefunzt"));
      user.getEquippedStack(EquipmentSlot.OFFHAND).decrement(1);
      orechoose = 4;
      return TypedActionResult.success(itemStack);
    }
    if (user.getEquippedStack(EquipmentSlot.OFFHAND).isItemEqual(gold) && user.isSneaking()) {
      user.sendSystemMessage(new TranslatableText("orefunzt"));
      user.getEquippedStack(EquipmentSlot.OFFHAND).decrement(1);
      orechoose = 5;
      return TypedActionResult.success(itemStack);
    }
    if (user.getEquippedStack(EquipmentSlot.OFFHAND).isItemEqual(lapis) && user.isSneaking()) {
      user.sendSystemMessage(new TranslatableText("orefunzt"));
      user.getEquippedStack(EquipmentSlot.OFFHAND).decrement(1);
      orechoose = 6;
      return TypedActionResult.success(itemStack);
    }
    if (user.getEquippedStack(EquipmentSlot.OFFHAND).isItemEqual(emerald) && user.isSneaking()) {
      user.sendSystemMessage(new TranslatableText("orefunzt"));
      user.getEquippedStack(EquipmentSlot.OFFHAND).decrement(1);
      orechoose = 7;
      return TypedActionResult.success(itemStack);
    }

    return TypedActionResult.fail(itemStack);
  }

  @Override
  public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
    LivingEntity player = (LivingEntity) entity;
    PlayerEntity gamer = (PlayerEntity) player;
    BlockPos playerpos = new BlockPos(gamer.getBlockPos());

    ItemStack nugget = new ItemStack(Items.IRON_ORE);// gamer.inventory.removeStack(nuggetslot, 1);
    int nuggetslot = gamer.inventory.getSlotWithStack(nugget);

    if (slot == 0 || slot == 1 || slot == 2 || slot == 3 || slot == 4 || slot == 5 || slot == 6 || slot == 7
        || slot == 8) {
      // first layer
      BlockPos pos100 = new BlockPos(playerpos.west());
      BlockPos pos101 = new BlockPos(playerpos.west(2));
      BlockPos pos102 = new BlockPos(playerpos.west(3));
      BlockPos pos103 = new BlockPos(playerpos.east());
      BlockPos pos104 = new BlockPos(playerpos.east(2));
      BlockPos pos105 = new BlockPos(playerpos.east(3));
      BlockPos pos106 = new BlockPos(playerpos.north());
      BlockPos pos107 = new BlockPos(playerpos.north(2));
      BlockPos pos108 = new BlockPos(playerpos.north(3));
      BlockPos pos109 = new BlockPos(playerpos.south());
      BlockPos pos110 = new BlockPos(playerpos.south(2));
      BlockPos pos111 = new BlockPos(playerpos.south(3));

      BlockPos pos112 = new BlockPos(playerpos.west().north());
      BlockPos pos113 = new BlockPos(playerpos.west(2).north());
      BlockPos pos114 = new BlockPos(playerpos.west().north(2));
      BlockPos pos115 = new BlockPos(playerpos.east().north());
      BlockPos pos116 = new BlockPos(playerpos.east(2).north());
      BlockPos pos117 = new BlockPos(playerpos.east().north(2));
      BlockPos pos118 = new BlockPos(playerpos.south().east());
      BlockPos pos119 = new BlockPos(playerpos.south(2).east());
      BlockPos pos120 = new BlockPos(playerpos.south().east(2));
      BlockPos pos121 = new BlockPos(playerpos.south().west());
      BlockPos pos122 = new BlockPos(playerpos.south(2).west());
      BlockPos pos123 = new BlockPos(playerpos.south().west(2));
      // second layer
      BlockPos pos200 = new BlockPos(playerpos.west().up());
      BlockPos pos201 = new BlockPos(playerpos.west(2).up());
      BlockPos pos202 = new BlockPos(playerpos.west(3).up());
      BlockPos pos203 = new BlockPos(playerpos.east().up());
      BlockPos pos204 = new BlockPos(playerpos.east(2).up());
      BlockPos pos205 = new BlockPos(playerpos.east(3).up());
      BlockPos pos206 = new BlockPos(playerpos.north().up());
      BlockPos pos207 = new BlockPos(playerpos.north(2).up());
      BlockPos pos208 = new BlockPos(playerpos.north(3).up());
      BlockPos pos209 = new BlockPos(playerpos.south().up());
      BlockPos pos210 = new BlockPos(playerpos.south(2).up());
      BlockPos pos211 = new BlockPos(playerpos.south(3).up());

      BlockPos pos212 = new BlockPos(playerpos.west().north().up());
      BlockPos pos213 = new BlockPos(playerpos.west(2).north().up());
      BlockPos pos214 = new BlockPos(playerpos.west().north(2).up());
      BlockPos pos215 = new BlockPos(playerpos.east().north().up());
      BlockPos pos216 = new BlockPos(playerpos.east(2).north().up());
      BlockPos pos217 = new BlockPos(playerpos.east().north(2).up());
      BlockPos pos218 = new BlockPos(playerpos.south().east().up());
      BlockPos pos219 = new BlockPos(playerpos.south(2).east().up());
      BlockPos pos220 = new BlockPos(playerpos.south().east(2).up());
      BlockPos pos221 = new BlockPos(playerpos.south().west().up());
      BlockPos pos222 = new BlockPos(playerpos.south(2).west().up());
      BlockPos pos223 = new BlockPos(playerpos.south().west(2).up());
      // third layer
      BlockPos pos300 = new BlockPos(playerpos.west().up(2));
      BlockPos pos301 = new BlockPos(playerpos.west(2).up(2));
      BlockPos pos302 = new BlockPos(playerpos.east().up(2));
      BlockPos pos303 = new BlockPos(playerpos.east(2).up(2));
      BlockPos pos304 = new BlockPos(playerpos.north().up(2));
      BlockPos pos305 = new BlockPos(playerpos.north(2).up(2));
      BlockPos pos306 = new BlockPos(playerpos.south().up(2));
      BlockPos pos307 = new BlockPos(playerpos.south(2).up(2));

      BlockPos pos308 = new BlockPos(playerpos.west().north().up(2));
      BlockPos pos309 = new BlockPos(playerpos.west(2).north().up(2));
      BlockPos pos310 = new BlockPos(playerpos.west().north(2).up(2));
      BlockPos pos311 = new BlockPos(playerpos.east().north().up(2));
      BlockPos pos312 = new BlockPos(playerpos.east(2).north().up(2));
      BlockPos pos313 = new BlockPos(playerpos.east().north(2).up(2));
      BlockPos pos314 = new BlockPos(playerpos.south().east().up(2));
      BlockPos pos315 = new BlockPos(playerpos.south(2).east().up(2));
      BlockPos pos316 = new BlockPos(playerpos.south().east(2).up(2));
      BlockPos pos317 = new BlockPos(playerpos.south().west().up(2));
      BlockPos pos318 = new BlockPos(playerpos.south(2).west().up(2));
      BlockPos pos319 = new BlockPos(playerpos.south().west(2).up(2));
      // fourth layer
      BlockPos pos400 = new BlockPos(playerpos.west().down());
      BlockPos pos401 = new BlockPos(playerpos.west(2).down());
      BlockPos pos402 = new BlockPos(playerpos.east().down());
      BlockPos pos403 = new BlockPos(playerpos.east(2).down());
      BlockPos pos404 = new BlockPos(playerpos.north().down());
      BlockPos pos405 = new BlockPos(playerpos.north(2).down());
      BlockPos pos406 = new BlockPos(playerpos.south().down());
      BlockPos pos407 = new BlockPos(playerpos.south(2).down());

      BlockPos pos408 = new BlockPos(playerpos.west().north().down());
      BlockPos pos409 = new BlockPos(playerpos.west(2).north().down());
      BlockPos pos410 = new BlockPos(playerpos.west().north(2).down());
      BlockPos pos411 = new BlockPos(playerpos.east().north().down());
      BlockPos pos412 = new BlockPos(playerpos.east(2).north().down());
      BlockPos pos413 = new BlockPos(playerpos.east().north(2).down());
      BlockPos pos414 = new BlockPos(playerpos.south().east().down());
      BlockPos pos415 = new BlockPos(playerpos.south(2).east().down());
      BlockPos pos416 = new BlockPos(playerpos.south().east(2).down());
      BlockPos pos417 = new BlockPos(playerpos.south().west().down());
      BlockPos pos418 = new BlockPos(playerpos.south(2).west().down());
      BlockPos pos419 = new BlockPos(playerpos.south().west(2).down());
      // misc
      BlockPos pos500 = new BlockPos(playerpos.down());
      BlockPos pos501 = new BlockPos(playerpos.up());
      BlockPos pos502 = new BlockPos(playerpos.up(2));

      if (world.getBlockState(pos100).getBlock().equals(orefinder())
          || world.getBlockState(pos101).getBlock().equals(orefinder())
          || world.getBlockState(pos102).getBlock().equals(orefinder())
          || world.getBlockState(pos103).getBlock().equals(orefinder())
          || world.getBlockState(pos104).getBlock().equals(orefinder())
          || world.getBlockState(pos105).getBlock().equals(orefinder())
          || world.getBlockState(pos106).getBlock().equals(orefinder())
          || world.getBlockState(pos107).getBlock().equals(orefinder())
          || world.getBlockState(pos108).getBlock().equals(orefinder())
          || world.getBlockState(pos109).getBlock().equals(orefinder())
          || world.getBlockState(pos110).getBlock().equals(orefinder())
          || world.getBlockState(pos111).getBlock().equals(orefinder())
          || world.getBlockState(pos112).getBlock().equals(orefinder())
          || world.getBlockState(pos113).getBlock().equals(orefinder())
          || world.getBlockState(pos114).getBlock().equals(orefinder())
          || world.getBlockState(pos115).getBlock().equals(orefinder())
          || world.getBlockState(pos116).getBlock().equals(orefinder())
          || world.getBlockState(pos117).getBlock().equals(orefinder())
          || world.getBlockState(pos118).getBlock().equals(orefinder())
          || world.getBlockState(pos119).getBlock().equals(orefinder())
          || world.getBlockState(pos120).getBlock().equals(orefinder())
          || world.getBlockState(pos121).getBlock().equals(orefinder())
          || world.getBlockState(pos122).getBlock().equals(orefinder())
          || world.getBlockState(pos123).getBlock().equals(orefinder())
          || world.getBlockState(pos200).getBlock().equals(orefinder())
          || world.getBlockState(pos201).getBlock().equals(orefinder())
          || world.getBlockState(pos202).getBlock().equals(orefinder())
          || world.getBlockState(pos203).getBlock().equals(orefinder())
          || world.getBlockState(pos204).getBlock().equals(orefinder())
          || world.getBlockState(pos205).getBlock().equals(orefinder())
          || world.getBlockState(pos206).getBlock().equals(orefinder())
          || world.getBlockState(pos207).getBlock().equals(orefinder())
          || world.getBlockState(pos208).getBlock().equals(orefinder())
          || world.getBlockState(pos209).getBlock().equals(orefinder())
          || world.getBlockState(pos210).getBlock().equals(orefinder())
          || world.getBlockState(pos211).getBlock().equals(orefinder())
          || world.getBlockState(pos212).getBlock().equals(orefinder())
          || world.getBlockState(pos213).getBlock().equals(orefinder())
          || world.getBlockState(pos214).getBlock().equals(orefinder())
          || world.getBlockState(pos215).getBlock().equals(orefinder())
          || world.getBlockState(pos216).getBlock().equals(orefinder())
          || world.getBlockState(pos217).getBlock().equals(orefinder())
          || world.getBlockState(pos218).getBlock().equals(orefinder())
          || world.getBlockState(pos219).getBlock().equals(orefinder())
          || world.getBlockState(pos220).getBlock().equals(orefinder())
          || world.getBlockState(pos221).getBlock().equals(orefinder())
          || world.getBlockState(pos222).getBlock().equals(orefinder())
          || world.getBlockState(pos223).getBlock().equals(orefinder())
          || world.getBlockState(pos301).getBlock().equals(orefinder())
          || world.getBlockState(pos302).getBlock().equals(orefinder())
          || world.getBlockState(pos303).getBlock().equals(orefinder())
          || world.getBlockState(pos304).getBlock().equals(orefinder())
          || world.getBlockState(pos305).getBlock().equals(orefinder())
          || world.getBlockState(pos306).getBlock().equals(orefinder())
          || world.getBlockState(pos307).getBlock().equals(orefinder())
          || world.getBlockState(pos308).getBlock().equals(orefinder())
          || world.getBlockState(pos309).getBlock().equals(orefinder())
          || world.getBlockState(pos310).getBlock().equals(orefinder())
          || world.getBlockState(pos311).getBlock().equals(orefinder())
          || world.getBlockState(pos312).getBlock().equals(orefinder())
          || world.getBlockState(pos313).getBlock().equals(orefinder())
          || world.getBlockState(pos314).getBlock().equals(orefinder())
          || world.getBlockState(pos315).getBlock().equals(orefinder())
          || world.getBlockState(pos316).getBlock().equals(orefinder())
          || world.getBlockState(pos317).getBlock().equals(orefinder())
          || world.getBlockState(pos318).getBlock().equals(orefinder())
          || world.getBlockState(pos319).getBlock().equals(orefinder())
          || world.getBlockState(pos400).getBlock().equals(orefinder())
          || world.getBlockState(pos401).getBlock().equals(orefinder())
          || world.getBlockState(pos402).getBlock().equals(orefinder())
          || world.getBlockState(pos403).getBlock().equals(orefinder())
          || world.getBlockState(pos404).getBlock().equals(orefinder())
          || world.getBlockState(pos405).getBlock().equals(orefinder())
          || world.getBlockState(pos406).getBlock().equals(orefinder())
          || world.getBlockState(pos407).getBlock().equals(orefinder())
          || world.getBlockState(pos408).getBlock().equals(orefinder())
          || world.getBlockState(pos409).getBlock().equals(orefinder())
          || world.getBlockState(pos410).getBlock().equals(orefinder())
          || world.getBlockState(pos411).getBlock().equals(orefinder())
          || world.getBlockState(pos412).getBlock().equals(orefinder())
          || world.getBlockState(pos413).getBlock().equals(orefinder())
          || world.getBlockState(pos414).getBlock().equals(orefinder())
          || world.getBlockState(pos415).getBlock().equals(orefinder())
          || world.getBlockState(pos416).getBlock().equals(orefinder())
          || world.getBlockState(pos417).getBlock().equals(orefinder())
          || world.getBlockState(pos418).getBlock().equals(orefinder())
          || world.getBlockState(pos419).getBlock().equals(orefinder())
          || world.getBlockState(pos500).getBlock().equals(orefinder())
          || world.getBlockState(pos501).getBlock().equals(orefinder())
          || world.getBlockState(pos502).getBlock().equals(orefinder())) {
        gamer.sendSystemMessage(new TranslatableText("found"));
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
