package net.invo.inits;

import net.invo.config.friendconfig;
import net.invo.dudes.*;
import net.invo.items.*;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class iteminit {

    public static final pillager1 PILLAGER1 = new pillager1(new Item.Settings().maxCount(1));
    public static final pillager3 PILLAGER3 = new pillager3(new Item.Settings().maxCount(1));
    public static final pillager4 PILLAGER4 = new pillager4(new Item.Settings().maxCount(1));
    public static final pillager5 PILLAGER5 = new pillager5(new Item.Settings().maxCount(1));
    public static final blueemerald BLUEEMERALD = new blueemerald(new Item.Settings());
    public static final bluemagma BLUEMAGMA = new bluemagma(new Item.Settings());
    public static final blueshard BLUESHARD = new blueshard(new Item.Settings());
    public static final bluefeather BLUEFEATHER = new bluefeather(new Item.Settings());
    public static final blueingot BLUEINGOT = new blueingot(new Item.Settings());
    public static final bluequartz BLUEQUARTZ = new bluequartz(new Item.Settings());
    public static final blueeye BLUEEYE = new blueeye(new Item.Settings());

    public static final woodtotem WOODTOTEM = new woodtotem(new Item.Settings());
    public static final fireresistancetotem1 FIRERESISTANCETOTEM1 = new fireresistancetotem1(
            new Item.Settings().maxCount(1));
    public static final fireresistancetotem2 FIRERESISTANCETOTEM2 = new fireresistancetotem2(
            new Item.Settings().maxCount(1));
    public static final fireresistancetotem3 FIRERESISTANCETOTEM3 = new fireresistancetotem3(
            new Item.Settings().maxCount(1));
    public static final hastetotem1 HASTETOTEM1 = new hastetotem1(new Item.Settings().maxCount(1));
    public static final hastetotem2 HASTETOTEM2 = new hastetotem2(new Item.Settings().maxCount(1));
    public static final hastetotem3 HASTETOTEM3 = new hastetotem3(new Item.Settings().maxCount(1));
    public static final nightvisiontotem1 NIGHTVISIONTOTEM1 = new nightvisiontotem1(new Item.Settings().maxCount(1));
    public static final nightvisiontotem2 NIGHTVISIONTOTEM2 = new nightvisiontotem2(new Item.Settings().maxCount(1));
    public static final nightvisiontotem3 NIGHTVISIONTOTEM3 = new nightvisiontotem3(new Item.Settings().maxCount(1));
    public static final resistancetotem1 RESISTANCETOTEM1 = new resistancetotem1(new Item.Settings().maxCount(1));
    public static final resistancetotem2 RESISTANCETOTEM2 = new resistancetotem2(new Item.Settings().maxCount(1));
    public static final resistancetotem3 RESISTANCETOTEM3 = new resistancetotem3(new Item.Settings().maxCount(1));
    public static final speedtotem1 SPEEDTOTEM1 = new speedtotem1(new Item.Settings().maxCount(1));
    public static final speedtotem2 SPEEDTOTEM2 = new speedtotem2(new Item.Settings().maxCount(1));
    public static final speedtotem3 SPEEDTOTEM3 = new speedtotem3(new Item.Settings().maxCount(1));
    public static final strengthtotem1 STRENGTHTOTEM1 = new strengthtotem1(new Item.Settings().maxCount(1));
    public static final strengthtotem2 STRENGTHTOTEM2 = new strengthtotem2(new Item.Settings().maxCount(1));
    public static final strengthtotem3 STRENGTHTOTEM3 = new strengthtotem3(new Item.Settings().maxCount(1));
    public static final waterbreathingtotem1 WATERBREATHINGTOTEM1 = new waterbreathingtotem1(
            new Item.Settings().maxCount(1));
    public static final waterbreathingtotem2 WATERBREATHINGTOTEM2 = new waterbreathingtotem2(
            new Item.Settings().maxCount(1));
    public static final waterbreathingtotem3 WATERBREATHINGTOTEM3 = new waterbreathingtotem3(
            new Item.Settings().maxCount(1));

    public static final teleportpillager TELEPORTPILLAGER = new teleportpillager(new Item.Settings().maxCount(1));
    public static final marinepillager MARINEPILLAGER = new marinepillager(new Item.Settings().maxCount(1));
    public static final earthpillager EARTHPILLAGER = new earthpillager(new Item.Settings().maxCount(1));
    public static final foodpillager FOODPILLAGER = new foodpillager(new Item.Settings().maxCount(1));
    public static final netherpillager NETHERPILLAGER = new netherpillager(new Item.Settings().maxCount(1));
    public static final endpillager ENDPILLAGER = new endpillager(new Item.Settings().maxCount(1));
    public static final priestpillager PRIESTPILLAGER = new priestpillager(new Item.Settings().maxCount(1));
    public static final orepillager OREPILLAGER = new orepillager(new Item.Settings().maxCount(1));

    public static final optotem OPTOTEM = new optotem(new Item.Settings().maxCount(1));

    public static void init() {

        if (friendconfig.invisiblepillager == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "pillager1"), PILLAGER1);
        }
        if (friendconfig.fallingpillager == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "pillager3"), PILLAGER3);
        }
        if (friendconfig.conduitingpillager == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "pillager4"), PILLAGER4);
        }
        if (friendconfig.luckypillager == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "pillager5"), PILLAGER5);
        }
        if (friendconfig.fireresistancetotem == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "fireresistancetotem1"), FIRERESISTANCETOTEM1);
        }

        if (friendconfig.fireresistancetotem == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "hastetotem1"), HASTETOTEM1);
        }
        if (friendconfig.fireresistancetotem == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "nightvisiontotem1"), NIGHTVISIONTOTEM1);
        }
        if (friendconfig.fireresistancetotem == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "resistancetotem1"), RESISTANCETOTEM1);
        }
        if (friendconfig.fireresistancetotem == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "speedtotem1"), SPEEDTOTEM1);
        }
        if (friendconfig.fireresistancetotem == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "strengthtotem1"), STRENGTHTOTEM1);
        }
        if (friendconfig.fireresistancetotem == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "waterbreathingtotem1"), WATERBREATHINGTOTEM1);
        }

        Registry.register(Registry.ITEM, new Identifier("invo", "woodtotem"), WOODTOTEM);
        Registry.register(Registry.ITEM, new Identifier("invo", "fireresistancetotem2"), FIRERESISTANCETOTEM2);
        Registry.register(Registry.ITEM, new Identifier("invo", "fireresistancetotem3"), FIRERESISTANCETOTEM3);
        Registry.register(Registry.ITEM, new Identifier("invo", "hastetotem2"), HASTETOTEM2);
        Registry.register(Registry.ITEM, new Identifier("invo", "hastetotem3"), HASTETOTEM3);
        Registry.register(Registry.ITEM, new Identifier("invo", "nightvisiontotem2"), NIGHTVISIONTOTEM2);
        Registry.register(Registry.ITEM, new Identifier("invo", "nightvisiontotem3"), NIGHTVISIONTOTEM3);
        Registry.register(Registry.ITEM, new Identifier("invo", "resistancetotem2"), RESISTANCETOTEM2);
        Registry.register(Registry.ITEM, new Identifier("invo", "resistancetotem3"), RESISTANCETOTEM3);
        Registry.register(Registry.ITEM, new Identifier("invo", "speedtotem2"), SPEEDTOTEM2);
        Registry.register(Registry.ITEM, new Identifier("invo", "speedtotem3"), SPEEDTOTEM3);
        Registry.register(Registry.ITEM, new Identifier("invo", "strengthtotem2"), STRENGTHTOTEM2);
        Registry.register(Registry.ITEM, new Identifier("invo", "strengthtotem3"), STRENGTHTOTEM3);
        Registry.register(Registry.ITEM, new Identifier("invo", "waterbreathingtotem2"), WATERBREATHINGTOTEM2);
        Registry.register(Registry.ITEM, new Identifier("invo", "waterbreathingtotem3"), WATERBREATHINGTOTEM3);

        if (friendconfig.teleportpillager == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "teleportpillager"), TELEPORTPILLAGER);
        }
        if (friendconfig.marinepillager == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "marinepillager"), MARINEPILLAGER);
        }
        if (friendconfig.earthpillager == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "earthpillager"), EARTHPILLAGER);
        }
        if (friendconfig.endpillager == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "endpillager"), ENDPILLAGER);
        }
        if (friendconfig.foodpillager == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "foodpillager"), FOODPILLAGER);
        }
        if (friendconfig.netherpillager == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "netherpillager"), NETHERPILLAGER);
        }
        if (friendconfig.priestpillager == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "priestpillager"), PRIESTPILLAGER);
        }
        if (friendconfig.orepillager == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "orepillager"), OREPILLAGER);
        }

        Registry.register(Registry.ITEM, new Identifier("invo", "blueemerald"), BLUEEMERALD);
        Registry.register(Registry.ITEM, new Identifier("invo", "bluemagma"), BLUEMAGMA);
        Registry.register(Registry.ITEM, new Identifier("invo", "blueshard"), BLUESHARD);
        Registry.register(Registry.ITEM, new Identifier("invo", "bluefeather"), BLUEFEATHER);
        Registry.register(Registry.ITEM, new Identifier("invo", "bluequartz"), BLUEQUARTZ);
        Registry.register(Registry.ITEM, new Identifier("invo", "blueingot"), BLUEINGOT);
        Registry.register(Registry.ITEM, new Identifier("invo", "blueeye"), BLUEEYE);

        if (friendconfig.optotem == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "optotem"), OPTOTEM);
        }

    }

}