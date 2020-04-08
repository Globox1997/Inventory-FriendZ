
package net.invo.config;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;

@Config(name = "invo")
@Config.Gui.Background("minecraft:textures/block/oak_planks.png")

public class friendconfig implements ConfigData {

    public static boolean resistancepillager = true;
    public static boolean fierypillager = true;
    public static boolean speedypillager = true;
    public static boolean breathingpillager = true; // umstellen nicht vergessen
    public static boolean rushingpillager = true;
    public static boolean strongpillager = true;
    public static boolean invisiblepillager = true; // false
    public static boolean visionpillager = true;
    public static boolean fallingpillager = true; // false
    public static boolean conduitingpillager = true; // false
    public static boolean luckypillager = true;

}