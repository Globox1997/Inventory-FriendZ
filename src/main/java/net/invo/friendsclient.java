package net.invo;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import net.fabricmc.api.ClientModInitializer;
import net.invo.config.friendconfig;
import net.invo.inits.modelproviderinit;

public class friendsclient implements ClientModInitializer {

        @Override
        public void onInitializeClient() {
                AutoConfig.getGuiRegistry(friendconfig.class);
                modelproviderinit.init();
        }

}