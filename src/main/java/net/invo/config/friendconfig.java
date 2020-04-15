
package net.invo.config;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;

@Config(name = "invo")
@Config.Gui.Background("minecraft:textures/block/oak_planks.png")

public class friendconfig implements ConfigData {

    public static boolean resistancetotem = true;
    public static boolean fierytotem = true;
    public static boolean speedtotem = true;
    public static boolean breathtotem = true;
    public static boolean rushingpillager = true;
    public static boolean strengthtotem = true;

    public static boolean invisiblepillager = true;
    public static boolean fallingpillager = true;
    public static boolean conduitingpillager = true;
    public static boolean luckypillager = true;

}