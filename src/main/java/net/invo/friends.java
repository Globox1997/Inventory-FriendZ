package net.invo;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.invo.config.friendconfig;
import net.invo.inits.*;

public class friends implements ModInitializer {
    public static friendconfig FRIENDCONFIG = AutoConfig.register(friendconfig.class, GsonConfigSerializer::new)
            .getConfig();

    @Override
    public void onInitialize() {

        AutoConfig.getConfigHolder(friendconfig.class).getConfig();
        itemgroupinit.init();
        iteminit.init();
        soundinit.init();

    }

}

// You are LOVED!!!
// Jesus loves you unconditional!