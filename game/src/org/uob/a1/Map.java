package org.uob.a1;

public class Map {
    private String[][] arr;
    private int width;
    private int height;
    final private String EMPTY = ".";
    final private String playerCoor = "ﾒ";
    private Position player;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        this.arr = new String[height][width];

        // initialize array with only empty values
        for (int i =0; i < arr.length; i++) {
            for (int j =0; j < arr[i].length; j++) {
                arr[i][j] = EMPTY;
            }
        }

    }//constructor
    public Map(int width, int height, Position pos) {
        this.width = width;
        this.height = height;
        this.arr = new String[height][width];
        this.player = pos;

        // initialize array with only empty values
        for (int i =0; i < arr.length; i++) {
            for (int j =0; j < arr[i].length; j++) {
                arr[i][j] = EMPTY;
            }
        }

    }//constructor

    public void placeRoom(Position pos, char symbol) {
        // convert the char symbol to a string
        String symbolString = Character.toString(symbol);
        //add the symbol to the map in the specified position
        this.arr[pos.y][pos.x] = symbolString;
    }

    public String display() {
        String string = "";

        // checks and changes the current position of the player on the map each time
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                string = string + arr[i][j];
            }
            string = string + "\n";
        }
        return string;
    }
    public String displayPlayer() {
        String string = "";

        // checks and changes the current position of the player on the map each time
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == player.y && j == player.x) {
                    string = string + this.playerCoor;
                }
                string = string + arr[i][j];
            }
            string = string + "\n";
        }
        return string;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    // checks if player will still be on map upon movement, does not go out bounds
    public static boolean checkPlayerOnMap(String direction, Position player, Map map) {
        if (direction.equals("north")) {
            if ((player.y - 1) >= 0) {
                return true;
            }
        }
        if (direction.equals("south")) {
            if (player.y + 1 <= map.height) {
                return true;
            }
        } if (direction.equals("west")) {
            if (player.x - 3 >= 0) {
                return true;
            }
        } if (direction.equals("east")) {
            if (player.x + 3 <= map.width) {
                return true;
            }
        }
        return false;
    }

    // changes player position
    public static void changePlayerPosition(String direction, Position player, Map map) {
        if (direction.equals("east")) {
            if (checkPlayerOnMap(direction, player, map)) {
                player.setX(4);
                System.out.println();
                System.out.println("You move east");
                System.out.println();
            }
        }
        if (direction.equals("west")) {
            if (checkPlayerOnMap(direction, player, map)) {
                player.setX(-4);
                System.out.println();
                System.out.println("You move west");
                System.out.println();
            } else {
                System.out.println();
                System.out.println("The path is blocked in that direction");
                System.out.println();
            }
        }
        if (direction.equals("south")) {
            if (checkPlayerOnMap(direction, player, map)) {
                player.setY(1);
                System.out.println();
                System.out.println("You move south");
                System.out.println();
            } else {
                System.out.println();
                System.out.println("The path is blocked in that direction");
                System.out.println();
            }
        }
        if (direction.equals("north")) {
            if (checkPlayerOnMap(direction, player, map)) {
                player.setY(-1);
                System.out.println();
                System.out.println("You move north");
                System.out.println();
            } else {
                System.out.println();
                System.out.println("The path is blocked in that direction");
                System.out.println();
            }
        }


    }// change player position

}//class