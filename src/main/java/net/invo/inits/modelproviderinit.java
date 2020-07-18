package net.invo.inits;

import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;

public class modelproviderinit {

  public static void init() {
    FabricModelPredicateProviderRegistry.register(iteminit.FIRERESISTANCETOTEM1, new Identifier("phase"),
        (stack, world, entity) -> {
          if (iteminit.FIRERESISTANCETOTEM1.count >= 600 && iteminit.FIRERESISTANCETOTEM1.count <= 1200) {
            return 0.5F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.FIRERESISTANCETOTEM1, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.FIRERESISTANCETOTEM1.count < 0) {
            return 1F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.FIRERESISTANCETOTEM2, new Identifier("phase"),
        (stack, world, entity) -> {
          if (iteminit.FIRERESISTANCETOTEM2.count >= 3600 && iteminit.FIRERESISTANCETOTEM2.count <= 4800) {
            return 0.5F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.FIRERESISTANCETOTEM2, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.FIRERESISTANCETOTEM2.count < 0) {
            return 1F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.FIRERESISTANCETOTEM3, new Identifier("phase"),
        (stack, world, entity) -> {
          if (iteminit.FIRERESISTANCETOTEM3.count >= 8400 && iteminit.FIRERESISTANCETOTEM3.count <= 9600) {
            return 0.5F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.FIRERESISTANCETOTEM3, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.FIRERESISTANCETOTEM3.count < 0) {
            return 1F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.HASTETOTEM1, new Identifier("phase"),
        (stack, world, entity) -> {
          if (iteminit.HASTETOTEM1.count >= 600 && iteminit.HASTETOTEM1.count <= 1200) {
            return 0.5F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.HASTETOTEM1, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.HASTETOTEM1.count < 0) {
            return 1F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.HASTETOTEM2, new Identifier("phase"),
        (stack, world, entity) -> {
          if (iteminit.HASTETOTEM2.count >= 3600 && iteminit.HASTETOTEM2.count <= 4800) {
            return 0.5F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.HASTETOTEM2, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.HASTETOTEM2.count < 0) {
            return 1F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.HASTETOTEM3, new Identifier("phase"),
        (stack, world, entity) -> {
          if (iteminit.HASTETOTEM3.count >= 8400 && iteminit.HASTETOTEM3.count <= 9600) {
            return 0.5F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.HASTETOTEM3, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.HASTETOTEM3.count < 0) {
            return 1F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.NIGHTVISIONTOTEM1, new Identifier("phase"),
        (stack, world, entity) -> {
          if (iteminit.NIGHTVISIONTOTEM1.count >= 600 && iteminit.NIGHTVISIONTOTEM1.count <= 1200) {
            return 0.5F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.NIGHTVISIONTOTEM1, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.NIGHTVISIONTOTEM1.count < 0) {
            return 1F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.NIGHTVISIONTOTEM2, new Identifier("phase"),
        (stack, world, entity) -> {
          if (iteminit.NIGHTVISIONTOTEM2.count >= 3600 && iteminit.NIGHTVISIONTOTEM2.count <= 4800) {
            return 0.5F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.NIGHTVISIONTOTEM2, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.NIGHTVISIONTOTEM2.count < 0) {
            return 1F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.NIGHTVISIONTOTEM3, new Identifier("phase"),
        (stack, world, entity) -> {
          if (iteminit.NIGHTVISIONTOTEM3.count >= 8400 && iteminit.NIGHTVISIONTOTEM3.count <= 9600) {
            return 0.5F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.NIGHTVISIONTOTEM3, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.NIGHTVISIONTOTEM3.count < 0) {
            return 1F;
          }
          return 0F;
        });
    // ore found

    FabricModelPredicateProviderRegistry.register(iteminit.OREPILLAGER, new Identifier("coalfound"),
        (stack, world, entity) -> {
          if (iteminit.OREPILLAGER.orechoose == 1 && iteminit.OREPILLAGER.questiontimer != 0) {
            return 0.15F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.OREPILLAGER, new Identifier("diafound"),
        (stack, world, entity) -> {
          if (iteminit.OREPILLAGER.orechoose == 2 && iteminit.OREPILLAGER.questiontimer != 0) {
            return 0.25F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.OREPILLAGER, new Identifier("ironfound"),
        (stack, world, entity) -> {
          if (iteminit.OREPILLAGER.orechoose == 3 && iteminit.OREPILLAGER.questiontimer != 0) {
            return 0.35F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.OREPILLAGER, new Identifier("redfound"),
        (stack, world, entity) -> {
          if (iteminit.OREPILLAGER.orechoose == 4 && iteminit.OREPILLAGER.questiontimer != 0) {
            return 0.45F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.OREPILLAGER, new Identifier("goldfound"),
        (stack, world, entity) -> {
          if (iteminit.OREPILLAGER.orechoose == 5 && iteminit.OREPILLAGER.questiontimer != 0) {
            return 0.55F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.OREPILLAGER, new Identifier("lapisfound"),
        (stack, world, entity) -> {
          if (iteminit.OREPILLAGER.orechoose == 6 && iteminit.OREPILLAGER.questiontimer != 0) {
            return 0.65F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.OREPILLAGER, new Identifier("emeraldfound"),
        (stack, world, entity) -> {
          if (iteminit.OREPILLAGER.orechoose == 7 && iteminit.OREPILLAGER.questiontimer != 0) {
            return 0.75F;
          }
          return 0F;
        });

    // orechoosing

    FabricModelPredicateProviderRegistry.register(iteminit.OREPILLAGER, new Identifier("coal"),
        (stack, world, entity) -> {
          if (iteminit.OREPILLAGER.orechoose == 1 && iteminit.OREPILLAGER.questiontimer == 0) {
            return 0.1F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.OREPILLAGER, new Identifier("dia"),
        (stack, world, entity) -> {
          if (iteminit.OREPILLAGER.orechoose == 2 && iteminit.OREPILLAGER.questiontimer == 0) {
            return 0.2F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.OREPILLAGER, new Identifier("iron"),
        (stack, world, entity) -> {
          if (iteminit.OREPILLAGER.orechoose == 3 && iteminit.OREPILLAGER.questiontimer == 0) {
            return 0.3F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.OREPILLAGER, new Identifier("red"),
        (stack, world, entity) -> {
          if (iteminit.OREPILLAGER.orechoose == 4 && iteminit.OREPILLAGER.questiontimer == 0) {
            return 0.4F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.OREPILLAGER, new Identifier("gold"),
        (stack, world, entity) -> {
          if (iteminit.OREPILLAGER.orechoose == 5 && iteminit.OREPILLAGER.questiontimer == 0) {
            return 0.5F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.OREPILLAGER, new Identifier("lapis"),
        (stack, world, entity) -> {
          if (iteminit.OREPILLAGER.orechoose == 6 && iteminit.OREPILLAGER.questiontimer == 0) {
            return 0.6F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.OREPILLAGER, new Identifier("emerald"),
        (stack, world, entity) -> {
          if (iteminit.OREPILLAGER.orechoose == 7 && iteminit.OREPILLAGER.questiontimer == 0) {
            return 0.7F;
          }
          return 0F;
        });

    // sleep

    FabricModelPredicateProviderRegistry.register(iteminit.OREPILLAGER, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.OREPILLAGER.sleeptimer < 0) {
            return 0.8F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.PILLAGER1, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.PILLAGER1.count < 0) {
            return 1F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.PILLAGER3, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.PILLAGER3.count < 0) {
            return 1F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.PILLAGER4, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.PILLAGER4.count < 0) {
            return 1F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.PILLAGER5, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.PILLAGER5.count < 0) {
            return 1F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.PRIESTPILLAGER, new Identifier("phase1"),
        (stack, world, entity) -> {
          if (iteminit.PRIESTPILLAGER.lifegen == 1) {
            return 0.2F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.PRIESTPILLAGER, new Identifier("phase2"),
        (stack, world, entity) -> {
          if (iteminit.PRIESTPILLAGER.lifegen == 2) {
            return 0.4F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.PRIESTPILLAGER, new Identifier("phase3"),
        (stack, world, entity) -> {
          if (iteminit.PRIESTPILLAGER.lifegen == 3) {
            return 0.8F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.PRIESTPILLAGER, new Identifier("phase4"),
        (stack, world, entity) -> {
          if (iteminit.PRIESTPILLAGER.lifegen == 4) {
            return 1F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.RESISTANCETOTEM1, new Identifier("phase"),
        (stack, world, entity) -> {
          if (iteminit.RESISTANCETOTEM1.count >= 600 && iteminit.RESISTANCETOTEM1.count <= 1200) {
            return 0.5F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.RESISTANCETOTEM1, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.RESISTANCETOTEM1.count < 0) {
            return 1F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.RESISTANCETOTEM2, new Identifier("phase"),
        (stack, world, entity) -> {
          if (iteminit.RESISTANCETOTEM2.count >= 3600 && iteminit.RESISTANCETOTEM2.count <= 4800) {
            return 0.5F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.RESISTANCETOTEM2, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.RESISTANCETOTEM2.count < 0) {
            return 1F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.RESISTANCETOTEM3, new Identifier("phase"),
        (stack, world, entity) -> {
          if (iteminit.RESISTANCETOTEM3.count >= 8400 && iteminit.RESISTANCETOTEM3.count <= 9600) {
            return 0.5F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.RESISTANCETOTEM3, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.RESISTANCETOTEM3.count < 0) {
            return 1F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.SPEEDTOTEM1, new Identifier("phase"),
        (stack, world, entity) -> {
          if (iteminit.SPEEDTOTEM1.count >= 600 && iteminit.SPEEDTOTEM1.count <= 1200) {
            return 0.5F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.SPEEDTOTEM1, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.SPEEDTOTEM1.count < 0) {
            return 1F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.SPEEDTOTEM2, new Identifier("phase"),
        (stack, world, entity) -> {
          if (iteminit.SPEEDTOTEM2.count >= 3600 && iteminit.SPEEDTOTEM2.count <= 4800) {
            return 0.5F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.SPEEDTOTEM2, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.SPEEDTOTEM2.count < 0) {
            return 1F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.SPEEDTOTEM3, new Identifier("phase"),
        (stack, world, entity) -> {
          if (iteminit.SPEEDTOTEM3.count >= 8400 && iteminit.SPEEDTOTEM3.count <= 9600) {
            return 0.5F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.SPEEDTOTEM3, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.SPEEDTOTEM3.count < 0) {
            return 1F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.STRENGTHTOTEM1, new Identifier("phase"),
        (stack, world, entity) -> {
          if (iteminit.STRENGTHTOTEM1.count >= 600 && iteminit.STRENGTHTOTEM1.count <= 1200) {
            return 0.5F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.STRENGTHTOTEM1, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.STRENGTHTOTEM1.count < 0) {
            return 1F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.STRENGTHTOTEM2, new Identifier("phase"),
        (stack, world, entity) -> {
          if (iteminit.STRENGTHTOTEM2.count >= 3600 && iteminit.STRENGTHTOTEM2.count <= 4800) {
            return 0.5F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.STRENGTHTOTEM2, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.STRENGTHTOTEM2.count < 0) {
            return 1F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.STRENGTHTOTEM3, new Identifier("phase"),
        (stack, world, entity) -> {
          if (iteminit.STRENGTHTOTEM3.count >= 8400 && iteminit.STRENGTHTOTEM3.count <= 9600) {
            return 0.5F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.STRENGTHTOTEM3, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.STRENGTHTOTEM3.count < 0) {
            return 1F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.WATERBREATHINGTOTEM1, new Identifier("phase"),
        (stack, world, entity) -> {
          if (iteminit.WATERBREATHINGTOTEM1.count >= 600 && iteminit.WATERBREATHINGTOTEM1.count <= 1200) {
            return 0.5F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.WATERBREATHINGTOTEM1, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.WATERBREATHINGTOTEM1.count < 0) {
            return 1F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.WATERBREATHINGTOTEM2, new Identifier("phase"),
        (stack, world, entity) -> {
          if (iteminit.WATERBREATHINGTOTEM2.count >= 3600 && iteminit.WATERBREATHINGTOTEM2.count <= 4800) {
            return 0.5F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.WATERBREATHINGTOTEM2, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.WATERBREATHINGTOTEM2.count < 0) {
            return 1F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.WATERBREATHINGTOTEM3, new Identifier("phase"),
        (stack, world, entity) -> {
          if (iteminit.WATERBREATHINGTOTEM3.count >= 8400 && iteminit.WATERBREATHINGTOTEM3.count <= 9600) {
            return 0.5F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.WATERBREATHINGTOTEM3, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.WATERBREATHINGTOTEM3.count < 0) {
            return 1F;
          }
          return 0F;
        });
    FabricModelPredicateProviderRegistry.register(iteminit.TELEPORTPILLAGER, new Identifier("sleep"),
        (stack, world, entity) -> {
          if (iteminit.TELEPORTPILLAGER.teleportcounter > 0 && iteminit.TELEPORTPILLAGER.teleportcounter < 12000) {
            return 1F;
          }
          return 0F;
        });
  }

}