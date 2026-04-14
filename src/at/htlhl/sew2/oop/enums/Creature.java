package at.htlhl.sew2.oop.enums;

public enum Creature {
    SNAKE(0), LIZARD(8), FISH(0), INSECT(6), UNKNOWN(-1);

    private int legs;

    Creature(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    @Override
    public String toString() {
        return String.format("Position: %d, Name: %s", this.ordinal(), this.name());
    }
}
