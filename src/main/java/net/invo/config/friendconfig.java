
package net.invo.config;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;

@Config(name = "invo")
@Config.Gui.Background("minecraft:textures/block/cobblestone.png")

public class friendconfig implements ConfigData {

    public static boolean fireresistancetotem = true;
    public static boolean hastetotem = true;
    public static boolean nightvisiontotem = true;
    public static boolean resistancetotem = true;
    public static boolean speedtotem = true;
    public static boolean strengthtotem = true;
    public static boolean waterbreathtotem = true;

    public static boolean earthpillager = true;
    public static boolean endpillager = true;
    public static boolean foodpillager = true;
    public static boolean marinepillager = true;
    public static boolean netherpillager = true;
    public static boolean priestpillager = true;
    public static boolean teleportpillager = true;
    public static boolean orepillager = true;

    public static boolean invisiblepillager = false;
    public static boolean fallingpillager = false;
    public static boolean conduitingpillager = false;
    public static boolean luckypillager = false;
    public static boolean optotem = false;

}