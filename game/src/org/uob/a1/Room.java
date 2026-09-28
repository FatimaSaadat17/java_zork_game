package org.uob.a1;

public class Room {
    private String name;
    private String description;
    private char symbol;
    private Position position;
    private Item item;
    private Puzzle puzzle;
    private NPC npc;
    private Item container;
    private boolean isSolved;

    public Room(String name, String description, char symbol, Position position, Item item, Puzzle puzzle) {
        this.name = name;
        this.description = description;
        this.symbol = symbol;
        this.position = position;
        this.item = item;
        this.puzzle = puzzle;
        this.isSolved = false;
    }//constructor1

    public Room(String name, String description, char symbol, Position position, Puzzle puzzle) {
        this.name = name;
        this.description = description;
        this.symbol = symbol;
        this.position = position;
        this.puzzle = puzzle;
        this.isSolved = false;
    }//constructor2

    public Room(String name, String description, char symbol, Position position, Item container, Item item, NPC npc) {
        this.name = name;
        this.description = description;
        this.symbol = symbol;
        this.position = position;
        this.item = item;
        this.npc = npc;
        this.container = container;
        this.isSolved = false;
    }//constructor3


// rooms without puzzles or items
    public Room(String name, String description, char symbol, Position position) {
        this.name = name;
        this.description = description;
        this.symbol = symbol;
        this.position = position;
        this.isSolved = false;
    }//constructor4

    public boolean getIsSolved() {
        return this.isSolved;
    }
    
    public void setIsSolved() {
        this.isSolved = true;
    }
    
    public NPC getNPC() {
        return npc;
    }
    public Item getContainer() {
        return container;
    }
    public String getName() {
        return name;
    }//getName method

    public Item getItem() {
        return item;
    }
    public Puzzle getPuzzle() {
        return puzzle;
    }

    public String getDescription() {
        return description;
    }//getDescription

    public char getSymbol() {
        return symbol;
    }//getSymbol

    public Position getPosition() {
        return position;
    }//getPosition


}//class