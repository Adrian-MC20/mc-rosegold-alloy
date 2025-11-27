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

**Pros of using ingots (current decision):**
- Alloys are made from refined metals, not raw ores
- Matches how Netherite uses refined materials
- Clean gameplay flow: smelt → alloy → craft

**Alternative (raw ores):**  
Considered but not adopted; feels less logical and breaks the fantasy of alloy-making.

---

## 2. Materials

### 2.1 Rose Gold Ingot
This is the fundamental building block of the entire mod.

Planned characteristics:
- Crafted from Copper and Gold
- Used for all equipment and block types
- Designed as a **mid-tier metal**
- Durability and strength between Iron and Diamond
- Enchantability similar to Iron

---

## 3. Crafting & Progression

Before tools, armor, blocks, or trims can exist, players must be able to **obtain** Rose Gold.

### 3.1 Alloy Creation
Planned recipe:
`1x Copper Ingot + 1x Gold Ingot → 2x Rose Gold Ingots`

### 3.2 Block Recipes
- 9 Rose Gold Ingots → 1 Rose Gold Block
- 1 Rose Gold Block → 9 Rose Gold Ingots

These define the core progression loop:
collect → smelt → alloy → craft → upgrade.

---

## 4. Equipment

Once Rose Gold exists and is obtainable, players can craft equipment.

### 4.1 Tool Set

Planned Rose Gold tools:
- Sword
- Pickaxe
- Axe
- Shovel
- Hoe

General intentions:
- Stronger than Iron
- Weaker than Diamond
- Faster mining than Iron
- Improved durability over Iron

### 4.2 Armor Set

Planned armor pieces:
- Helmet
- Chestplate
- Leggings
- Boots

Design goals:
- Protection between Iron and Diamond
- Slightly better enchantability than Iron
- Standard vanilla recipes

---

## 5. Blocks

Rose Gold should offer decorative and storage functionality.

Planned block types:
- **Rose Gold Block** (storage block)
- Optional future variants:
    - Bars
    - Sheets / plates
    - Decorative patterns or trims

Nothing will generate naturally in the world.

Optional future feature:
- Tarnish/oxidation system similar to Copper

---

## 6. Armor Trim Integration

Rose Gold Ingot will also function as a **trim material** in the Smithing Table.

Concept goals:
- Adds a warm rose-gold tint to armor trims
- Works on all existing trimmable armor
- Future Rose Gold Armor will support trims as well

This feature becomes relevant once the base material and crafting recipes are implemented.

---

## 7. Future Ideas (Optional / Long-Term)

These are brainstorming concepts, not commitments:

- Rose Gold Anvil
- Rose Gold Lanterns, Chains, or decorative items
- Special Rose Gold weapon traits
- Additional decorative block shapes
- Cosmetic or utility golem entity
- Environmental interactions or oxidation behavior

These may be explored only after the core tier is complete and balanced.

---

## 8. Technical Notes (Development)
`as of Nov 2025`
- Target version: **Minecraft 1.21.10**
- Fabric Loader: **0.18.1**
- Mappings: **Mojang**
- Namespace: `rosegoldalloy`
- All content will be gradually moved into **data generation** once the initial structure is in place.

### 8.1 Data Generation

This project uses **Minecraft Data Generation** for creating most of the required data files  
(recipes, models, blockstates, tags, trim materials, etc.).  
As new items and blocks are added, their JSON definitions will be generated through the datagen pipeline rather than written manually.

Contributors should follow the datagen structure when adding new content.

---

## 9. Roadmap Overview

### Phase 1 — Foundation
- [ ] Rose Gold Ingot
- [ ] Alloy crafting recipe
- [ ] Rose Gold Block
- [ ] Block compression/decompression
- [ ] Basic textures & models
- [ ] Trim material integration

### Phase 2 — Equipment
- [ ] Tool material balancing
- [ ] Implement all tool types
- [ ] Armor material balancing
- [ ] Implement full armor set
- [ ] Add Rose Gold Armor to trim systems

### Phase 3 — Decorative Blocks
- [ ] Bars / sheets / plates (optional)
- [ ] Oxidation or tarnish variants (optional)

### Phase 4 — Extended Features
- [ ] Additional block types
- [ ] Utility or cosmetic additions
- [ ] Community-requested features

---
