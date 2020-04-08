package net.invo.inits;

import net.invo.config.friendconfig;
import net.invo.dudes.*;
import net.invo.items.*;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class iteminit {

    public static final golem1 GOLEM1 = new golem1(new Item.Settings().maxCount(1));
    public static final golem2 GOLEM2 = new golem2(new Item.Settings().maxCount(1));
    public static final golem3 GOLEM3 = new golem3(new Item.Settings().maxCount(1));
    public static final golem4 GOLEM4 = new golem4(new Item.Settings().maxCount(1));
    public static final golem5 GOLEM5 = new golem5(new Item.Settings().maxCount(1));
    public static final golem6 GOLEM6 = new golem6(new Item.Settings().maxCount(1));
    public static final pillager1 PILLAGER1 = new pillager1(new Item.Settings().maxCount(1));
    public static final pillager2 PILLAGER2 = new pillager2(new Item.Settings().maxCount(1));
    public static final pillager3 PILLAGER3 = new pillager3(new Item.Settings().maxCount(1));
    public static final pillager4 PILLAGER4 = new pillager4(new Item.Settings().maxCount(1));
    public static final pillager5 PILLAGER5 = new pillager5(new Item.Settings().maxCount(1));
    public static final blueemerald BLUEEMERALD = new blueemerald(new Item.Settings());
    public static final bluemagma BLUEMAGMA = new bluemagma(new Item.Settings());
    public static final blueshard BLUESHARD = new blueshard(new Item.Settings());
    public static final bluefeather BLUEFEATHER = new bluefeather(new Item.Settings());
    public static final blueingot BLUEINGOT = new blueingot(new Item.Settings());
    public static final bluequartz BLUEQUARTZ = new bluequartz(new Item.Settings());

    public static void init() {

        if (friendconfig.resistancepillager == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "golem1"), GOLEM1);
        }
        if (friendconfig.fierypillager == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "golem2"), GOLEM2);
        }
        if (friendconfig.speedypillager == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "golem3"), GOLEM3);
        }
        if (friendconfig.breathingpillager == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "golem4"), GOLEM4);
        }
        if (friendconfig.rushingpillager == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "golem5"), GOLEM5);
        }
        if (friendconfig.strongpillager == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "golem6"), GOLEM6);
        }
        if (friendconfig.invisiblepillager == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "pillager1"), PILLAGER1);
        }
        if (friendconfig.visionpillager == true) {
            Registry.register(Registry.ITEM, new Identifier("invo", "pillager2"), PILLAGER2);
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

        Registry.register(Registry.ITEM, new Identifier("invo", "blueemerald"), BLUEEMERALD);
        Registry.register(Registry.ITEM, new Identifier("invo", "bluemagma"), BLUEMAGMA);
        Registry.register(Registry.ITEM, new Identifier("invo", "blueshard"), BLUESHARD);
        Registry.register(Registry.ITEM, new Identifier("invo", "bluefeather"), BLUEFEATHER);
        Registry.register(Registry.ITEM, new Identifier("invo", "bluequartz"), BLUEQUARTZ);
        Registry.register(Registry.ITEM, new Identifier("invo", "blueingot"), BLUEINGOT);

    }

}