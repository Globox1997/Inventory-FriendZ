package net.invo.dudes;

import java.util.List;
import java.util.Random;

import net.invo.inits.configinit;
import net.invo.inits.soundinit;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

public class pillager5 extends Item {
    public int count = 0;
    public int count2 = 0;

    public pillager5(Settings settings) {
        super(settings);

    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.invo.pillager5.tooltip"));
        if (!configinit.CONFIG.luckypillager) {
            tooltip.add(new TranslatableText("item.invo.deactivated"));
        }
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        StatusEffectInstance luck = new StatusEffectInstance(StatusEffect.byRawId(26), 0, 0, false, false);
        StatusEffectInstance badluck = new StatusEffectInstance(StatusEffect.byRawId(27), 0, 0, false, false);
        LivingEntity player = (LivingEntity) entity;
        if (configinit.CONFIG.luckypillager) {
            if (slot == 0 || slot == 1 || slot == 2 || slot == 3 || slot == 4 || slot == 5 || slot == 6 || slot == 7
                    || slot == 8 && !world.isClient) {
                count++;
                if (count >= 9600) {
                    count = -2400;
                    player.playSound(soundinit.SLEEPEVENT, 0.5F, 1F);
                }
                if (count >= 0) {
                    player.addStatusEffect(luck);
                }
                if (count < 0) {
                    player.addStatusEffect(badluck);
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
    }

    @Override
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

    @Override
    public boolean hasRecipeRemainder() {
        if (configinit.CONFIG.luckypillager) {
            return true;
        } else
            return false;
    }

}
