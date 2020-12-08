package net.invo;

import net.fabricmc.api.ModInitializer;
import net.invo.inits.*;

public class friends implements ModInitializer {
    @Override
    public void onInitialize() {
        configinit.init();
        itemgroupinit.init();
        iteminit.init();
        soundinit.init();

    }

}

// You are LOVED!!!
// Jesus loves you unconditional!