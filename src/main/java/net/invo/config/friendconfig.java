
package net.invo.config;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry;

@Config(name = "invo")
@Config.Gui.Background("minecraft:textures/block/stone.png")
public class friendconfig implements ConfigData {

    @ConfigEntry.Category("item")
    @ConfigEntry.Gui.PrefixText
    public boolean fireresistancetotem = true;
    @ConfigEntry.Category("item")
    public boolean hastetotem = true;
    @ConfigEntry.Category("item")
    public boolean nightvisiontotem = true;
    @ConfigEntry.Category("item")
    public boolean resistancetotem = true;
    @ConfigEntry.Category("item")
    public boolean speedtotem = true;
    @ConfigEntry.Category("item")
    public boolean strengthtotem = true;
    @ConfigEntry.Category("item")
    public boolean waterbreathtotem = true;

    @ConfigEntry.Category("item")
    public boolean earthpillager = true;
    @ConfigEntry.Category("item")
    public boolean endpillager = true;
    @ConfigEntry.Category("item")
    public boolean foodpillager = true;
    @ConfigEntry.Category("item")
    public boolean marinepillager = true;
    @ConfigEntry.Category("item")
    public boolean netherpillager = true;
    @ConfigEntry.Category("item")
    public boolean priestpillager = true;
    @ConfigEntry.Category("item")
    public boolean teleportpillager = true;
    @ConfigEntry.Category("item")
    public boolean orepillager = true;

    @ConfigEntry.Category("opitem")
    @ConfigEntry.Gui.PrefixText
    public boolean invisiblepillager = false;
    @ConfigEntry.Category("opitem")
    public boolean fallingpillager = false;
    @ConfigEntry.Category("opitem")
    public boolean conduitingpillager = false;
    @ConfigEntry.Category("opitem")
    public boolean luckypillager = false;
    @ConfigEntry.Category("opitem")
    public boolean optotem = false;

}