package net.invo.inits;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.JanksonConfigSerializer;
import net.invo.config.friendconfig;

public class configinit {
    public static friendconfig CONFIG = new friendconfig();

    public static void init() {
        AutoConfig.register(friendconfig.class, JanksonConfigSerializer::new);
        CONFIG = AutoConfig.getConfigHolder(friendconfig.class).getConfig();
    }

}
