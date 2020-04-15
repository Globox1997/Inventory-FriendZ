package net.invo.inits;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class soundinit {

    public static final Identifier SLEEP = new Identifier("invo:sleep");
    public static SoundEvent SLEEPEVENT = new SoundEvent(SLEEP);
    public static final Identifier SLEEPGOLEM = new Identifier("invo:sleepgolem");
    public static SoundEvent SLEEPGOLEMEVENT = new SoundEvent(SLEEPGOLEM);
    public static final Identifier TRADERSOUND = new Identifier("invo:tradersound");
    public static SoundEvent TRADERSOUNDEVENT = new SoundEvent(TRADERSOUND);

    public static void init() {

        Registry.register(Registry.SOUND_EVENT, SLEEP, SLEEPEVENT);
        Registry.register(Registry.SOUND_EVENT, SLEEPGOLEM, SLEEPGOLEMEVENT);
        Registry.register(Registry.SOUND_EVENT, TRADERSOUND, TRADERSOUNDEVENT);
    }

}