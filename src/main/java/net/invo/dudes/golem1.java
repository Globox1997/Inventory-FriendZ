package net.invo.dudes;

import java.util.List;
import java.util.Random;

import net.invo.inits.soundinit;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class golem1 extends Item {
    public static int count = 0;
    public static int count2 = 0;

    public golem1(Settings settings) {
        super(settings);
        this.addPropertyGetter(new Identifier("sleep"), (stack, world, entity) -> {
            if (count < 0) {
                return 1F;
            }
            return 0F;
        });
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.invo.golem1.tooltip"));
    }

    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        ItemStack bread = new ItemStack(Items.BREAD);
        ItemStack gold = new ItemStack(Items.GOLDEN_APPLE);

        int bro;
        ItemStack test;
        StatusEffectInstance def = new StatusEffectInstance(StatusEffect.byRawId(11), 0, 0, false, false);
        LivingEntity player = (LivingEntity) entity;
        PlayerEntity ok = (PlayerEntity) player;
        ItemStack bread2 = ok.getMainHandStack();

        if (ok.inventory.contains(bread)) {
            // test = bread;
            // if (bread2 == bread) {
            // bread2.decrement(1);
            // }
            if (bread2.isItemEqual(bread)) {
                bread2.decrement(1);
                ok.inventory.insertStack(gold);
               

                // gold.increment(1);

            }
            // bread2.decrement(1);
            // test.decrement(3);
            // bro = ok.inventory.getSlotWithStack(bread);
            // ok.inventory.removeOne(bread);
            // ok.sendMessage(new TranslatableText("item.invo.golem1.tooltip"));
            ok.abilities.allowFlying = true;
            ok.abilities.invulnerable = true;
            ok.handSwingProgress = 0.5F;
            ok.knockbackVelocity = 2F; // probably slime slingshot
            // ok.addExperienceLevels(5); // teleport is possible
            ok.canAvoidTraps(); // home tp is possible
            ok.clearStatusEffects(); // heal is possible
            // ok.pitch = 2F;
            ok.hasNoGravity();
        }

        if (slot == 0 || slot == 1 || slot == 2 || slot == 3 || slot == 4 || slot == 5 || slot == 6 || slot == 7
                || slot == 8) {
            count++;
            if (count >= 9600) {
                count = -1200;
                player.playSound(soundinit.SLEEPEVENT, 0.5F, 1F);
            }
            if (count >= 0) {
                player.addStatusEffect(def);
            }

        }
        if (slot != 0 && slot != 1 && slot != 2 && slot != 3 && slot != 4 && slot != 5 && slot != 6 && slot != 7
                && slot != 8) {
            if (count < 0) {
                count++;
            }
            if (count > 0) {
                count = 0;
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
            world.addParticle(ParticleTypes.END_ROD, player.getX() + z2, player.getY() + z6, player.getZ() + z4, 0.0D,
                    0.0D, 0.0D);
            count2++;
        }
        if (count2 >= 80) {
            count2 = 0;
        }

    }

}
