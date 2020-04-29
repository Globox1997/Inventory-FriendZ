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
    public static final Identifier TOTEMACTIVATE = new Identifier("invo:totemactivating");
    public static SoundEvent TOTEMACTIVATEEVENT = new SoundEvent(TOTEMACTIVATE);
    public static final Identifier TOTEMSLEEP = new Identifier("invo:totemsleep");
    public static SoundEvent TOTEMSLEEPEVENT = new SoundEvent(TOTEMSLEEP);

    public static void init() {

        Registry.register(Registry.SOUND_EVENT, SLEEP, SLEEPEVENT);
        Registry.register(Registry.SOUND_EVENT, SLEEPGOLEM, SLEEPGOLEMEVENT);
        Registry.register(Registry.SOUND_EVENT, TRADERSOUND, TRADERSOUNDEVENT);
        Registry.register(Registry.SOUND_EVENT, TOTEMACTIVATE, TOTEMACTIVATEEVENT);
        Registry.register(Registry.SOUND_EVENT, TOTEMSLEEP, TOTEMSLEEPEVENT);
    }

}