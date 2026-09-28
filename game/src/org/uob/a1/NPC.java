
package org.uob.a1;
public class NPC {
    private String name;
    private String afterkilled;
    private String afterTalk;
    private Item item;

    public NPC(String name, String afterkilled, String afterTalk, Item item) {
        this.name = name;
        this.afterkilled = afterkilled;
        this.afterTalk = afterTalk;
        this.item = item;

    }
    public String getAfterkilled() {
        return afterkilled;
    }
    public Item getItem() {
        return item;
    }

    public String getAfterTalk() {
        return afterTalk;
    }
    public String getName() {
        return name;
    }
}