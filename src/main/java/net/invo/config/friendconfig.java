
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

    public static boolean invisiblepillager = true; // false
    public static boolean fallingpillager = true;
    public static boolean conduitingpillager = true;
    public static boolean luckypillager = true;

}