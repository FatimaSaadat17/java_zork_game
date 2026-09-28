package org.uob.a1;

public class Sanity {
    private String[] arr = {"𖹭", "𖹭", "𖹭", "𖹭", "𖹭", "𖹭", "𖹭"};

    public void removeSanity() {
        for (int i = 0; i < arr.length; i++) {
            if (this.arr[i] != null) {
                arr[i] = null;
                break;
            }
        }
    }

    public int getSanity() {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    public String displaySanity() {
        String string = "";
        String seperator = " ";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                string = string + arr[i] + seperator;
            }
        }
        return string;
    }
}//class
