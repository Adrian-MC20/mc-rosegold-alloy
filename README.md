# Rose Gold Alloy Mod
**Minecraft 1.21.10 | Fabric | Mojang Mappings**  
**Mod ID:** `rosegoldalloy`  
**Package Root:** `dev.maleficent.rosegoldalloy`

This document outlines the **concept**, **planned content**, and **design direction** for the Rose Gold Alloy mod.  
All features described below are in early planning unless marked otherwise.

---

## 1. Core Concept

Rose Gold is introduced as a **player-crafted alloy** created from Copper and Gold.  
It does **not** generate in the world; players must produce it themselves, forming a natural mid-game progression step.

### 1.1 Alloy Logic

Pros of using ingots (current decision):
- Alloys are made from refined metals, not raw ores.
- Matches how Netherite uses refined materials.
- Clean gameplay flow: smelt -> alloy -> craft.

Alternative (raw ores):  
Considered but not adopted; feels less logical and breaks the fantasy of alloy-making.

In addition to Copper and Gold, the alloy recipe also uses **Nether Quartz** as a catalyst-like component, to make the recipe slightly more demanding and thematically “refined”.

---

## 2. Materials

### 2.1 Rose Gold Ingot

This is the fundamental building block of the entire mod.

Planned characteristics:
- Crafted from Copper, Gold and Nether Quartz.
- Used for all equipment and block types.
- Designed as a **mid-tier metal**.

---

## 3. Crafting & Progression

Before tools, armor, blocks, or trims can exist, players must be able to **obtain** Rose Gold.

### 3.1 Alloy Creation

Planned **shaped** crafting recipe (2x2 area, flexible placement inside the 3x3 grid).

Legend:
- `C` = Copper Ingot
- `G` = Gold Ingot
- `Q` = Nether Quartz
- `.` = empty slot

Pattern (conceptually, "." is empty):

    . C Q
    . G .
    . . .

Any placement of this 2x2 pattern inside the 3x3 crafting grid should be accepted.  
Result: **2x Rose Gold Ingots**.

### 3.2 Block Recipes

- 9 Rose Gold Ingots -> 1 Rose Gold Block
- 1 Rose Gold Block -> 9 Rose Gold Ingots

These define the core progression loop:  
collect -> smelt -> alloy -> craft -> upgrade.

### 3.3 Recipe Unlocking (Advancements)

All crafting recipes in this mod will be unlocked through specific invisible advancements, following the same system used by vanilla. Each recipe will have its own intentional progression condition, such as obtaining a certain item before the recipe becomes available.

Planned behavior:
- **Rose Gold Ingot recipe** unlocks once the player obtains a **Gold Ingot** in their inventory for the first time.
- Future recipes (tools, armor, blocks) will have their own advancement-based conditions, to keep progression structured and intentional.

---

## 4. Equipment

Once Rose Gold exists and is obtainable, players can craft equipment.

### 4.1 Design Philosophy

Rose Gold is designed as a specialized mid-tier material that excels in **durability** and **enchantability**, rather than raw power. It sits comfortably between Iron and Diamond, offering a meaningful upgrade for players who value longevity and magical potential over speed and damage.

Its tools can mine anything Iron can, but they are not intended to be primary weapons, having a damage output that is intentionally lower than Iron. The mining speed is comparable to Iron, making it a reliable workhorse. The true strength of Rose Gold lies in its exceptional durability—lasting significantly longer than Iron—and its high enchantability, which surpasses even Diamond, making it an ideal canvas for powerful enchantments.

### 4.2 Tool Set

Planned Rose Gold tools, which will inherit the philosophy above:
- Sword
- Pickaxe
- Axe
- Shovel
- Hoe

### 4.3 Armor Set

Planned armor pieces, which will use the material philosophy defined above:
- Helmet
- Chestplate
- Leggings
- Boots

---

## 5. Blocks

Rose Gold should offer decorative and storage functionality.

Planned block types:
- **Rose Gold Block** (storage block).

Optional future variants:
- Bars.
- Decorative blocks

Nothing will generate naturally in the world.

---

## 6. Armor Trim Integration

Rose Gold Ingot will also function as a **trim material** in the Smithing Table.

Concept goals:
- Adds a warm rose-gold tint to armor trims.
- Works on all existing trimmable armor.
- Future Rose Gold Armor will support trims as well.

This feature becomes relevant once the base material and crafting recipes are implemented.

---

## 7. Future Ideas (Optional / Long-Term)

These are brainstorming concepts, not commitments:

- Rose Gold Lanterns, Chains, or decorative items.
- Special Rose Gold weapon traits.
- Additional decorative block shapes.
- Environmental interactions or oxidation behavior.

These may be explored only after the core tier is complete and balanced.

---

## 8. Technical Notes (Development)

`as of Nov 2025`

- Target version: **Minecraft 1.21.10**.
- Fabric Loader: **0.18.1**.
- Mappings: **Mojang**.
- Namespace: `rosegoldalloy`.
- All content will be gradually moved into **data generation** once the initial structure is in place.

### 8.1 Data Generation

This project uses **Minecraft Data Generation** for creating most of the required data files  
(recipes, models, blockstates, tags, trim materials, etc.).  
As new items and blocks are added, their JSON definitions will be generated through the datagen pipeline rather than written manually.

Contributors should follow the datagen structure when adding new content.

---

## 9. Roadmap Overview

### Phase 1 — Foundation

- [x] Rose Gold Ingot.
- [x] Alloy crafting recipe.
- [x] Rose Gold Block.
- [x] Block compression/decompression.
- [x] Basic textures and models.
- [ ] Trim material integration.

### Phase 2 — Equipment

- [ ] Define Tool & Armor Materials.
- [ ] Implement all tool types.
- [ ] Implement full armor set.
- [ ] Add Rose Gold Armor to trim systems.

### Phase 3 — Decorative Blocks

- [ ] Open to ideas.

### Phase 4 — Extended Features

- [ ] Additional block types.
- [ ] Utility or cosmetic additions.
- [ ] Community-requested features.