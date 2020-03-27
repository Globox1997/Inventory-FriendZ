package net.invo;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import net.fabricmc.api.ClientModInitializer;
import net.invo.config.friendconfig;
import net.minecraft.entity.EntityType;

public class friendsclient implements ClientModInitializer {

        public static EntityType<?> entityType;

        @Override
        public void onInitializeClient() {

                AutoConfig.getGuiRegistry(friendconfig.class);

        }

}