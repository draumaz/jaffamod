# Jaffa Cakes

**I MAEK JAFFA.**

Oranges, limes, chocolate, and a different kind of bread. Originally a Forge mod
for Minecraft 1.4.4 (November 2012), now ported to **Fabric for Minecraft 26.3**.

## Items

| Item             | Hunger | Recipe                                              |
|------------------|-------:|-----------------------------------------------------|
| Chocolate Bar ×6 | 1      | 3 Cocoa Beans in a row                              |
| Orange           | 3      | Apple + Orange Dye                                  |
| Lime             | 3      | Apple + Lime Dye                                    |
| Chocolate Apple  | 5      | Apple + Chocolate Bar                               |
| Chocolate Orange | 5      | Orange + Chocolate Bar                              |
| Chocolate Lime   | 1      | Lime + Chocolate Bar                                |
| Dough ×2         | —      | Wheat + Milk Bucket + Wheat                         |
| Loaf             | 3      | Smelt (or smoke) Dough                              |
| Apple Jaffa      | 10     | Loaf + Chocolate Apple + Loaf                       |
| Orange Jaffa     | 10     | Loaf + Chocolate Orange + Loaf                      |
| Lime Jaffa       | 10     | Loaf + Chocolate Lime + Loaf                        |

Make any Jaffa to earn the **I MAEK JAFFA** advancement ("A different kind of bread.").

## Building

Needs a **Java 25** JDK (e.g. [Temurin](https://adoptium.net/)).

```sh
./gradlew build        # jar ends up in build/libs/
./gradlew runClient    # launch Minecraft with the mod
```

Drop the jar into your `mods/` folder along with [Fabric API](https://modrinth.com/mod/fabric-api).
It also runs on Quilt, which loads Fabric mods.

## Layout

- `src/main/java/tk/erekohn/mods/Jaffa.java` – registers the items
- `src/main/resources/assets/jaffa/` – textures, models, names
- `src/main/resources/data/jaffa/` – recipes and advancements
- `legacy/` – the original 2012 Forge/ModLoader source and sprite sheet, kept for posterity
