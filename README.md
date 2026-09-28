# The Isle of Father Carl 🕯️

> A pure Java text-based adventure game that blends the parser-driven mechanics of *Zork* with the oppressive, cult-centric horror of *Outlast 2*.

You awaken stranded on a mysterious island in the middle of the sea, with your last memory being a trip to Copenhagen with your daughter. Your primary goal is to explore the desolate environment, survive the horrors within, and rescue her before your mind gives way to the madness.

## ⚙️ Features

* **Grid-Based Exploration:** Navigate a dynamic map where empty spaces are marked by `.` and your current position is indicated by `ﾒ`[cite: 8]. 
* **Sanity System:** Every horrifying encounter or violent action takes a toll on your mind. Certain actions, like attacking NPCs or failing puzzles, will drop your sanity and cause throbbing headaches. If your sanity reaches its absolute limit, you will go insane and lose the game.
* **Resource Management:** Manage an inventory system with a strict maximum limit of 10 items[cite: 4]. You will need to carefully `take`, `use`, and `remove` items to progress[cite: 2, 4].
* **Atmospheric Locations:** Explore terrifying environments including "The Cleansing Graveyard", "The Chapel of Salt", and the "Foggy Swamp - The Mire of Witnesses".
* **Dynamic Encounters:** Choose how to interact with the island's inhabitants. You can `talk` to NPCs to gather clues, or choose to attack figures like the antagonist, Father Carl. NPCs have specific reactions based on whether they are spoken to or killed[cite: 10].

## 🚀 Quick Start

**Prerequisites:**
* Java Development Kit (JDK) installed on your machine.
* A standard terminal or command prompt.

To install and run the game, use the following commands in your terminal:

```bash
git clone <your-repository-url-here>
cd game
./run.sh
```
🎮 How to Play
The game operates using a text parser. Type your desired action at the Command: prompt and press Enter.   
Essential CommandsMovement: Type move and then specify a direction (north, east, south, west) to traverse the map.   
Observation: Type look to examine your current room, or look <item> to inspect specific features and puzzles.
Map: Type map to display your current location on the grid.
Inventory & InteractionManage Items: Type take <item> to pick something up, remove to discard an item, or inventory to see what you are holding.
Interact: Type open <container> to reveal hidden items, use <item> to interact with the environment, or talk <NPC> to speak with a character.
Status: Type sanity to check your mental state, or score to display your current progress.
Help: Type help at any time to view a full list of available commands.


