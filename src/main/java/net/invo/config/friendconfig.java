
package net.invo.config;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry;

@Config(name = "invo")
@Config.Gui.Background("minecraft:textures/block/stone.png")
public class friendconfig implements ConfigData {

    @ConfigEntry.Category("item")
    @ConfigEntry.Gui.PrefixText
    public static boolean fireresistancetotem = true;
    @ConfigEntry.Category("item")
    public static boolean hastetotem = true;
    @ConfigEntry.Category("item")
    public static boolean nightvisiontotem = true;
    @ConfigEntry.Category("item")
    public static boolean resistancetotem = true;
    @ConfigEntry.Category("item")
    public static boolean speedtotem = true;
    @ConfigEntry.Category("item")
    public static boolean strengthtotem = true;
    @ConfigEntry.Category("item")
    public static boolean waterbreathtotem = true;

    @ConfigEntry.Category("item")
    public static boolean earthpillager = true;
    @ConfigEntry.Category("item")
    public static boolean endpillager = true;
    @ConfigEntry.Category("item")
    public static boolean foodpillager = true;
    @ConfigEntry.Category("item")
    public static boolean marinepillager = true;
    @ConfigEntry.Category("item")
    public static boolean netherpillager = true;
    @ConfigEntry.Category("item")
    public static boolean priestpillager = true;
    @ConfigEntry.Category("item")
    public static boolean teleportpillager = true;
    @ConfigEntry.Category("item")
    public static boolean orepillager = true;

    @ConfigEntry.Category("opitem")
    @ConfigEntry.Gui.PrefixText
    public static boolean invisiblepillager = false;
    @ConfigEntry.Category("opitem")
    public static boolean fallingpillager = false;
    @ConfigEntry.Category("opitem")
    public static boolean conduitingpillager = false;
    @ConfigEntry.Category("opitem")
    public static boolean luckypillager = false;
    @ConfigEntry.Category("opitem")
    public static boolean optotem = false;

}