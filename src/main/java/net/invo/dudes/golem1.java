package net.invo.dudes;

import java.util.List;

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

public class golem1 extends Item {

    public golem1(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.invo.golem1.tooltip"));
    }

    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        StatusEffectInstance def = new StatusEffectInstance(StatusEffect.byRawId(11), 0, 0, false, false);
        LivingEntity bob = (LivingEntity) entity;
        if (slot == 0 || slot == 1 || slot == 2 || slot == 3 || slot == 4 || slot == 5 || slot == 6 || slot == 7
                || slot == 8) {

            bob.addStatusEffect(def);
        }

    }

    public void onCraft(ItemStack stack, World world, PlayerEntity player) {
        double d = (double) player.getX() + (double) world.random.nextFloat();
        double e = (double) player.getY() + (double) world.random.nextFloat() + 1;
        double f = (double) player.getZ() + (double) world.random.nextFloat();
        world.addParticle(ParticleTypes.MYCELIUM, d, e, f, 0.0D, 0.0D, 0.0D);
    }

}
