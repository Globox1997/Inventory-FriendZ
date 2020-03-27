
package net.invo.config;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;

@Config(name = "invo")
@Config.Gui.Background("minecraft:textures/block/oak_planks.png")

public class friendconfig implements ConfigData {

    public static boolean resistancegolem = true;
    public static boolean fierygolem = true;
    public static boolean speedygolem = true;
    public static boolean breathinggolem = true;  //umstellen nicht vergessen
    public static boolean rushinggolem = true;
    public static boolean stronggolem = true;
    public static boolean invisiblepillager = true;    //false
    public static boolean visionpillager = true;
    public static boolean fallingpillager = true;    //false
    public static boolean conduitingpillager = true;  //false
    public static boolean luckypillager = true;
    

}