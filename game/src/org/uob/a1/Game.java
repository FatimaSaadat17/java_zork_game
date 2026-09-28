package org.uob.a1;

import java.util.Scanner;

public class Game {

    public static void main(String args[]) {
        // initialize sanity meter 
        Sanity sanity = new Sanity();
        
        // initialize the player position at start point
        Position player = new Position(1, 0);

        // initialize score object
        Score score = new Score(0);

        // initializes player inventory
        Inventory inventory = new Inventory();

        //initialize all rooms

        // room1

        Room cornFieldGate = new Room("The Cornfield Gate - 'The verse of entry'",
                "You are standing in front of a tall, dark gate. You notice words carved on the lock but they are worn away.\n\n" +
                        "There is a sign that reads 'Hark! This gate shan't open unless one spouts the purest verse of all bestowed upon us'\n" +
                        "You spot three 'fence posts' to your right which you can 'look' at, \nand a torn 'page' is stuck on the wall which must be 'taken' to be 'looked' at.", '⛩', new Position(5, 0), new Item("A weathered scrap of parchment torn from a Bible. The ink is faded, edges burned. Some words are missing, but you can just make out a familiar passage…\n" +
                "“The light ____ in darkness, and the darkness ____ it not.”\n" +
                "— Fragment, Gospel of John", "page"), new Puzzle("fence", "1: “The light shines in darkness, and the darkness fears it.”\n2: “The light burns the dark, and the dark praises it.”\n3: “The light blinds the sinner.”\n one of these 'fence posts' must be 'recited'", "1", "You recite the verse, but it seems the gate continues to stay closed in this dreary darkness...", "Fence number: ", "The final word leaves your lips, and the carvings shimmer faintly.\n" +
                "Wood groans as if exhaling after centuries. The gate unlatches itself and swings inward, revealing a path swallowed by fog. Far out to the 'east' you can vaguely hear a 'man' murmering..."));

        // room/area 2
        Room graveYard = new Room("The Cleansing Graveyard", "You step into a clearing where the corn gives way to ash.\n" +
                "A dying fire pit crackles in the center — beside it, a robed man kneels, murmuring to himself.\n" +
                "\n" +
                "“Light to flame… flame to flesh… the circle closes…”\n" +
                "\n" +
                "A faint iron key glints at his waist. You also catch glimpse of a 'chest' lying next to him which can be 'opened'", '⚰', new Position(9, 0), new Item("You open the chest, inside lies a bloodstained 'knife' which can be 'taken' and 'used' and 'looked' at", "chest"),
                new Item("You hold a rusty bloodstained knife in your shivery hands, 'still seems usable', you think to yourself\n" +
                        "you try to decide whether if you wish to 'talk' to the 'man' or 'use' the 'knife''", "knife"), new NPC("man", "The knife strikes clean. He exhales one word as he falls: “Mercy.”" +
                "You take the Iron Key from his body. The fire hisses, shrinking as if in mourning. You resolve to move ahead of your own accord...", "He looks up slowly, eyes dull but calm.\n" +
                "“You spoke the true verse at the gate,” he says. “Then you may pass. Take the key — I have no more need for it. Oh and if you go east ahead and down south there exists a chapel, you'll find out more there...”\n" +
                "(He hands you the Iron Key to.)", new Item( "Iron key: this key may be used to unlock special rooms", "iron-key")));

        // room 3
        Item letters = new Item("Carl's Journal\nLetter I — 01/10/1985\n" +
                "“The Lord tests our hunger. He starves us that we may savor the light.\n" +
                "Tomorrow we will fast again. The children cry, but I remind them — pain is proof He listens.”\n" +
                "\n" +
                "Letter II — 05/02/1986\n" +
                "“A mother brought her son for healing. His fever would not break.\n" +
                "I prayed, and the prayer fell silent halfway through.\n" +
                "Something else finished the words for me.”\n" +
                "Letter III — 07/29/1987\n" +
                "\n" +
                "“It was not blasphemy — it was necessity.\n" +
                "The lamb had to be more than symbol.\n" +
                "I offered the boy beneath the altar and the wind sang.\n" +
                "His blood steamed on the stone and the chapel breathed.”\n" +
                "Letter IV — 10/03/1988\n" +
                "\n" +
                "“They call me monster. But the soil is rich again. The corn grows thick.\n" +
                "How can horror bear such fruit, if not blessed?”\n", "letters");

        Room theChapel = new Room("The Chapel of Salt – “Walk of the Pure", "The path ends at a clearing choked with fog and ash.\n" +
                "Before you stands the chapel — small, crooked, and half-swallowed by the earth.\n" +
                "\n" +
                "The stained-glass windows are blackened from inside, you notice a 'lock' on the door which needs to be 'looked' at to 'use' a 'key', below you are four 'letters' scattered on the ground which can be 'taken' ", '☦', new Position(17, 1),letters , new Puzzle("lock", "You must 'use' some sort of '<type>-key' on this lock", "use iron-key", "You try to push the door open but alas, it stands still...", "Command: ", "The door creaks open with a slow, aching sound — wood grinding against wood.\nThe air inside is thick with the scent of mildew, wax, and something metallic that clings to your tongue. You move ahead and unfurl the wet carpet to reveal a trapdoor, you go through and must traverse to the 'east'"));

        // room 4
        Room theBasement = new Room("The Basement of Truths", "The stairs groan as you descend, one hand brushing against damp stone.\n" +
                "At the bottom lies a basement chamber, carved crudely from the earth. Candles burn in glass jars along the walls, their flames flickering low and colorless.\n" + "You notice another room far out 'south'.", 'ᛝ', new Position(21, 1));

        // room 5
        Room antechamber = new Room("The Antechamber of Atonement", "Beyond is a smaller room, its walls reinforced with rusted plates and scripture scratched into the metal.\n" +
                "At the center stands a massive steel door, its surface scorched and engraved with the cult’s burning sigil — but this one is different, You notice a rusted 'lock' on the door which can be 'looked' at.",'⍈', new Position(21, 2), letters, new Puzzle("lock", "You 'look' up at the 'lock' on the door which has four number dials carved out, arranged like a crude number 'lock'.\n" +
                "Above, etched into the door in a shaking hand:\n" +
                "“Only the day the Offering was accepted may open His path below.”\n\n" +
                "Maybe one of the 'letters' tells when the Offering was “accepted”….\n",  "0729", "You stand back after inputting the dials, only to see the door still in its locked state...", "Input code: ", "The door creaks open to reveal a swampy lake. You notice a tiny lit up cottage far down 'south'-'west'."));

        // room 6
        Room theCottage = new Room("The Cottage Beyond the Gate", "The dirt path ends at a small wooden cottage, The door hangs open, swaying slightly with the wind.\n" +
                "Inside, the air is still — warm but stale, books and torn sermons litter the floor, stacked like offerings around a single round table in the center.\n" +
                "Behind it sits a cultist, his hood drawn low, a deck of 'cards' splayed before him which may be 'looked' at. A single lantern casts his silhouette across the walls — too long, too still.\n\n" +
                "On the table beside the 'cards' lies a small 'silver-key' which can be 'taken', its handle carved with the same burning sigil you’ve seen before. It glints faintly in the dim light.", '♠', new Position(17, 3), new Item("a small rusted silver key, can be 'used' to open doors with 'locks'", "silver-key"), new Puzzle("cards", "The man gestures to the cards, spreading three across the table. Each bears a single word, painted in thick red ink.\n" +
                "\n" +
                "“He asked me once — how far I’d go to save my little girl,” the man says softly. “I answered wrong.”\n" +
                "\n" +
                "He looks at you now, voice trembling:\n" +
                "“Choose for me. What saves her?”\n" +
                "\n" +
                "The cards read:\n" +
                "† Faith — “Trust in Him.”\n" +
                "꒷꒦ Sacrifice — “Give what He demands.”\n" +
                "♡ Love — “Hold what remains.”", "love", "The man shakes his head, you have chosen the wrong card, please try again...", "Make your choice: ", "You pick the card and it burns to flames in your hand, by the time you realize what just happened the man had already disappeared and the exit door to the cottage opens, \n" +
                "revealing a humongous watchtower far down 'south'-'east' after a massive swampy fog"));

        // room 7 No puzzle
        Room theSwamp = new Room("Foggy Swamp - The Mire of Witnesses", "You step into a fog-drenched swamp. The air is thick and sour, heavy with rot and stagnant water.\n" +
                "All around, figures stand half-submerged — motionless cultists in tattered robes, their faces lost beneath their hoods.\n" +
                "None move. None speak. But as you pass, their heads turn — slowly — to follow you.\n" +
                "Far ahead, through the mist towards the far 'east', the outline of a watchtower looms.", '༄', new Position(25, 4));

        // room 8
        Room theWatchtower = new Room("The Watchtower– “The Hero's Chance”", "The fog parts just enough for a shape to emerge — a watchtower, tall and crooked, rising from the swamp like a splintered bone.\n" +
                "The interior is dim, lit only by a single lantern swinging from a beam.\n" +
                "You climb up the stairs to find your daughter caged up inside a jail cell\n" +
                "there is a 'lock' on the cell which can be 'looked' at.", '♖', new Position(29, 4), new Puzzle("lock", "You notice that the 'lock' requires a '<type>-key' to be 'used'", "use silver-key", "It seems this item is not working, try again...", "Command: ", "The lock latches open, you see your daughter in an almost weak and frail condition, you clench you teeth in anger, you pick her up and walk out of the tower,\n 'I'm coming Father Carl', you say to yourself as you traverse 'south'-'eastwards'."));

        // room 9 - last encounter with father carl, there is a final note with a container
        Room theFinalChamber = new Room("Father Carl's Mansion - “The Final Chamber”", "You traverse on ahead to face a large white mansion, candles light up your path ahead as you walk inside. The corridor opens into a stone chamber lit by a circle of burning candles.\n\n" +
                "Symbols have been carved into the floor — the same sigil you’ve seen scorched across doors and fields, only here it breathes, pulsing faintly with light.\n\n" +
                "At its center stands Father Carl.\n\n" +
                "His robes are ash-stained, his hands clasped around a book darkened with age and blood.\n" +
                "On his belt, you see a set of keys, marked with a small tag: “Chopper – North Ridge.”\n\n" +
                "Beside you is a table with a wooden 'box' which can be 'opened'\n\n" + "(You can either choose to 'talk' to 'carl' or 'use' some kind of <weapon> on him)", '⌂', new Position(33, 5), new Item("You open the box, and inside you find a 'note' which can be 'taken' and 'looked' at.\n\n", "box"), new Item("“Carl… if you are reading this, I am long gone from this world. Please, promise me you will not lose yourself to grief. I have lived my life, and mine is ending. You must do the same, in time.\n" +
                "\n" +
                "I cannot stay. I cannot remain. Whatever you see in your dreams, whatever you hear in the night — it is not me. I am not the voice calling you, nor the warmth you feel when you think I am near.\n" +
                "\n" +
                "Do not build a world of blood to trap me here. Do not twist others to satisfy your longing. I love you, Carl, but life is not yours to bend. Let me rest. Let yourself rest.\n" +
                "\n" +
                "If this letter survives, it is my last hope that you will remember who you were… before the obsession, before the cult, before the darkness swallowed us both.\n" +
                "\n" +
                "— Evelyn Hensley”", "note"), new NPC("carl", "The blade strikes true. Carl gasps — not in pain, but relief.\n" +
                "His blood pools across the sigil, and the candles flare with sudden life.\n" +
                "“At last.”\n" +
                "He collapses, one hand outstretched toward the altar.\n" +
                "The keys fall from his sleeve, clattering to the stone beside you.\n" +
                "His eyes roll back, and silence settles like dust.\n" +
                "(You take the Helipad Keys.)", "He studies you for a long moment, eyes glassy with exhaustion.\n" +
                "“I prayed for a savior… and it was you who came.”\n\n" +
                "His grip on the bloodstained book loosens. He places the keys on the altar between you\n" +
                "“The chopper waits atop the ridge towards the 'south'. Take her. Leave this place to burn.”\n" +
                "“If you see God beyond the smoke… tell Him I kept my promise.”\n\n" +
                "(You receive the Helipad Keys.)\n\n", new Item("The keys to the chopper to the north to get out of this island", "chopper-keys")));

        // room 10 - helipad room
        Room helipad = new Room("The Helipad", "As you ascend the stairs, with each raspy breath you finally make it to the helipad in time\n" +
                "You and your daughter sit inside the chopper, and you quickly scramble through your inventory to find the right '<type>-keys' to the 'starter' which can also be 'looked' at.",'ʜ', new Position(33, 6), new Puzzle("starter", "Requires a '<type>-key' to be 'used' to start the chopper engine", "use chopper-keys", "You try to turn the keys but hear no sound as it turns", "Command: ", "You give a sigh of relief as the The helicopter roars to life, blades chopping the fog.\n" +
                "Your daughter grips your hand, trembling, eyes wide.\n" +
                "The island shrinks behind you — the watchtower, the chapel, the mire of witnesses — swallowed by mist.\n\n" +
                "“We’re leaving,” you whisper.\n" +
                "The chopper rises into the dawn, carrying you both away from the nightmare. For now, she is safe. \n\n" +
                "THE END..."));


        // initialize map object
        Map map = new Map(50, 7, player);

        // place all rooms on the map on their respective coordinates
        map.placeRoom(cornFieldGate.getPosition(), cornFieldGate.getSymbol());
        map.placeRoom(graveYard.getPosition(), graveYard.getSymbol());
        map.placeRoom(theChapel.getPosition(), theChapel.getSymbol());
        map.placeRoom(theBasement.getPosition(), theBasement.getSymbol());
        map.placeRoom(antechamber.getPosition(), antechamber.getSymbol());
        map.placeRoom(theCottage.getPosition(), theCottage.getSymbol());
        map.placeRoom(theSwamp.getPosition(), theSwamp.getSymbol());
        map.placeRoom(theWatchtower.getPosition(), theWatchtower.getSymbol());
        map.placeRoom(theFinalChamber.getPosition(), theFinalChamber.getSymbol());
        map.placeRoom(helipad.getPosition(), helipad.getSymbol());

        // game dialogues here:

        while (true) {
            // add statements for the position of the player and advance dialogue methods accordingly
            Room currentRoom = cornFieldGate;
            while (true) {
                if (player.y == 0 && player.x == 1) {
                    System.out.println("WELCOME PLAYER...");
                    System.out.println("You are stranded on a mysterious island in the middle of the sea, you have no idea about your whereabouts aside from the fact that the last thing you remember is your trip to Copenhaagen with your daughter, your first goal is to find her. " +
                            "You notice that there is something way up 'east', perhaps it might give you some clues about where you currently are.\n" + "(You may use 'move' here)\n");
                    break;
                } else if (player.y == 0 && player.x == 5) {
                    if (!(cornFieldGate.getIsSolved())) {
                      System.out.println("Location: " + cornFieldGate.getName());
                      System.out.println();  
                      currentRoom = cornFieldGate;
                        // increment score
                      score.visitRoom();
                        // set current room to solved (true)
                      currentRoom.setIsSolved();  
                      break;
                    } else {
                        // if room has already been solved then displays this message
                        System.out.println("This room has already been solved");
                        break;
                    }
                } else if (player.y == 0 && player.x == 9) {
                    if (!(graveYard.getIsSolved())) {
                      currentRoom = graveYard;  
                      System.out.println("Location: " + graveYard.getName());
                      System.out.println();
                      score.visitRoom();
                      currentRoom.setIsSolved();  
                      break;
                    } else {
                        System.out.println("This room has already been solved");
                        break;
                    }
 
                } else if (player.y == 1 && player.x == 17) {
                    System.out.println("Location: " + theChapel.getName());
                    System.out.println();
                    score.visitRoom();
                    currentRoom = theChapel;
                    break;
                }
                else if (player.y == 1 && player.x == 21) {
                    System.out.println("Location: " + theBasement.getName());
                    System.out.println();
                    score.visitRoom();
                    currentRoom = theBasement;
                    break;
                }
                else if (player.y == 2 && player.x == 21) {
                    System.out.println("Location: " + antechamber.getName());
                    System.out.println();
                    score.visitRoom();
                    currentRoom = antechamber;
                    break;
                }
                else if (player.y == 3 && player.x == 17) {
                    System.out.println("Location: " + theCottage.getName());
                    System.out.println();
                    score.visitRoom();
                    currentRoom = theCottage;
                    break;
                }
                else if (player.y == 4 && player.x == 25) {
                    System.out.println("Location: " + theSwamp.getName());
                    System.out.println();
                    score.visitRoom();
                    currentRoom = theSwamp;
                    break;
                }
                else if (player.y == 4 && player.x == 29) {
                    System.out.println("Location: " + theWatchtower.getName());
                    System.out.println();
                    score.visitRoom();
                    currentRoom = theWatchtower;
                    break;
                }
                else if (player.y == 5 && player.x == 33) {
                    System.out.println("Location: " + theFinalChamber.getName());
                    System.out.println();
                    score.visitRoom();
                    currentRoom = theFinalChamber;
                    break;
                }
                else if (player.y == 6 && player.x == 33){
                    System.out.println("Location: " + helipad.getName());
                    System.out.println();
                    score.visitRoom();
                    currentRoom = helipad;
                    break;
                }
                else {
                    break;
                }

            }
            checkInputs(map, player, currentRoom, inventory, score, sanity);
            continue;

        }// while true loop

    }

    // this method checks the input and acts accordingly
    public static void checkInputs(Map map, Position player, Room currentRoom, Inventory inventory, Score score, Sanity sanity) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            System.out.println();

            // removes an item from the inventory
            if (input.trim().equals("remove")) {
                System.out.print("Which item? :  ");
                String item = scanner.nextLine();
                if (inventory.hasItem(item) != -1) {
                    inventory.removeItem(item);
                    continue;
                } else {
                  System.out.println("This item does not exit in your inventory");
                  continue;
                }

            }
            // moves player
            else if (input.trim().equals("move")) {
                // split string to get the second input and change position accordingly
                System.out.print("Which direction? (north, east, south, west): ");
                String direction = scanner.nextLine();
                map.changePlayerPosition(direction, player, map);
                break;
            }
            // displays inventory
            else if (input.equals("inventory")) {
                System.out.println("You have: " + inventory.displayInventory());
            }

            // open any container type items
            else if (input.contains("open")) {
                String [] inputArr = input.split(" ");
                if (inputArr[1].equals(currentRoom.getContainer().getName())) {
                    System.out.println(currentRoom.getContainer().getDescription());
                }
            }

            // to take an item and add it to inventory
            else if (input.contains("take")) {
                String [] inputArr = input.split(" ");
                if (inputArr[1].equals(currentRoom.getItem().getName())) {
                    if (inventory.hasItem(currentRoom.getItem().getName()) == -1) {
                        inventory.addItem(currentRoom.getItem().getName());
                    } else {
                        System.out.println("This item already exists in your inventory");
                    }
                } else {
                    System.out.println("This item is not availible to be taken");
                }

            }

            // for NPC encounters
            else if (input.contains("talk")) {
                String [] inputArr = input.split(" ");
                if (inputArr[1].equals(currentRoom.getNPC().getName())) {
                    System.out.println(currentRoom.getNPC().getAfterTalk());
                    // add the item npc gives
                    inventory.addItem(currentRoom.getNPC().getItem().getName());
                }
            }
            // displays sanity of player
            else if (input.equals("sanity")) {
                System.out.println();
                System.out.println("Sanity: " + sanity.displaySanity());
            }

            // gets and prints the score of the player
            else if (input.equals("score")) {
                System.out.println("Current score -> " + score.getScore());
                continue;
            }

            // controlling output of the use command
            else if (input.contains("use")) {
                if (input.contains("knife")) {
                    if (input.contains(currentRoom.getNPC().getName()) && sanity.getSanity() > 0) {
                        System.out.println(currentRoom.getNPC().getAfterkilled());
                        sanity.removeSanity();
                        System.out.println();
                        System.out.println("You feel a throbbing headache as you hold your head in your hands... (Your sanity has dropped)");
                        System.out.println();
                        System.out.println("Sanity: " + sanity.displaySanity());        
                        System.out.println();
                        inventory.addItem(currentRoom.getNPC().getItem().getName());
                    } else {
                        System.out.println();
                        System.out.println("You feel a throbbing headache as you hold your head in your hands... (Your sanity has dropped)");
                        System.out.println("Sanity: " + sanity.displaySanity()); 
                        System.out.println();
                        System.out.println("Your sanity has reached its limit, you have gone insane (You lost).");
                        System.exit(1);
                    }
                }

            }

            // for puzzles
            else if (input.contains("look")) {
                String [] inputArr = input.split(" ");

                if (inputArr[0].equals("look") && inputArr.length == 1) {
                    System.out.println(currentRoom.getDescription());
                }

                // look at item but only if it also exists in inventory
                if (inputArr.length > 1) {
                    if (inventory.hasItem((inputArr[1])) != -1) {
                        if (inputArr[1].equals(currentRoom.getItem().getName())) {
                            System.out.println(currentRoom.getItem().getDescription());
                        }
                    }

                    if (currentRoom.getPuzzle() != null) {
                        if (inputArr[1].contains(currentRoom.getPuzzle().getName())) {
                            System.out.println(currentRoom.getPuzzle().getDescription());
                            while (true) {
                                System.out.print(currentRoom.getPuzzle().getAnswerInputDescription());
                                String answer = scanner.nextLine();
                                if (answer.toLowerCase().equals(currentRoom.getPuzzle().getCorrectAnswer())) {
                                    System.out.println();
                                    System.out.println(currentRoom.getPuzzle().getCorrectAnswerText());
                                    System.out.println();
                                    score.solvePuzzle();
                                    break;
                                } else if (answer.equals("back")) {
                                    break;
                                }
                                else {
                                    if (sanity.getSanity() > 0) {
                                        sanity.removeSanity();
                                        System.out.println();
                                        System.out.println("You feel a throbbing headache as you hold your head in your hands... (Your sanity has dropped) ");
                                        System.out.println();
                                        System.out.println("Sanity: " + sanity.displaySanity());        
                                        System.out.println();
                                        System.out.println(currentRoom.getPuzzle().getFailureText());
                                        continue;
                                    } else {
                                        System.out.println("Your sanity has reached its limit, you have gone insane (You lost).");
                                        System.exit(1);
                                    }
                                }
                            }
                        }
                    }
                    if (currentRoom.getNPC() != null) {
                        if (inputArr[1].equals(currentRoom.getNPC().getItem().getName())) {
                            System.out.println(currentRoom.getNPC().getItem().getDescription());
                        }
                    }
                }


            }

            // display map
            else if (input.equals("map")) {
                System.out.println(map.displayPlayer());
                continue;
            }

            //display all the commands
            else if (input.equals("help")) {
                System.out.println("List of commands: \n" +
                        "1: move - player can move any direction on map from (south, east, west and north).\n" +
                        "2: map - displays the map\n" +
                        "3: quit - quits the game\n" +
                        "4: look - you can use look <item>, look or look <feature>\n" +
                        "5: back - can be used to go back, only when a room puzzle has been initiated\n" +
                        "6: inventory - can open the inventory\n" +
                        "7: take <item> - can be used to take items and add it to your inventory\n" +
                        "8: use <item> on <NPC> or use <item>\n" +
                        "9: talk <NPC>\n" +
                        "10: open <container>\n" +
                        "11: remove - removes an item from your inventory\n" +
                        "12: score - displays current player score");
            }

            //quits the game entirely
            else if (input.equals("quit")) {
                System.exit(1);

            }  else {
                System.out.println("Error: unknown command, try entering 'help' to list all commands");
                continue;
            }// if-else statements
        }
    }//checkinputs method


}//class