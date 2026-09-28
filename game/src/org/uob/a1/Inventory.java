package org.uob.a1;

public class Inventory {
    private String[] inventory;
    final int MAX_ITEMS = 10;

    public Inventory() {
        this.inventory = new String[MAX_ITEMS];
    }//constructor

    public void addItem(String item) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = item;
                break;
            }
        }
        System.out.println("You have obtained: " + item);

    }//addItem

    public int hasItem(String item) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null) {
                if (inventory[i].equals(item)) {
                    return i;
                }
            }
        }
        return -1;
    }//hasItem

    public void removeItem(String item) {
        if (inventory.length > 0) {
            for (int i = 0; i < inventory.length; i++) {
                if (inventory[i].equals(item)) {
                    inventory[i] = null;
                    System.out.println("You have removed " + item  + " from your inventory...");
                    break;
                }
            }
        } else {
            System.out.println("This item cannot be removed...");
        }
    }//removeItem

    public String displayInventory() {
      String string = "";
        String separator = "";  // separator here is your ","

        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null) {
                string = string + separator + inventory[i];
                separator = " ";
            }

        }

        if (!(string.equals(""))) {
            string = string + " ";
        }
        return string;

    }//displayInventory

}//class