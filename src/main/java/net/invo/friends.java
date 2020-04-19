package net.invo;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.ConfigHolder;
import me.sargunvohra.mcmods.autoconfig1u.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.invo.config.friendconfig;
import net.invo.inits.*;

public class friends implements ModInitializer {

    @Override
    public void onInitialize() {

        ConfigHolder<friendconfig> holder = AutoConfig.register(friendconfig.class, JanksonConfigSerializer::new);
        holder.getConfig();
        itemgroupinit.init();
        iteminit.init();
        soundinit.init();

    }

}

// You are LOVED!!!
// Jesus loves you unconditional!