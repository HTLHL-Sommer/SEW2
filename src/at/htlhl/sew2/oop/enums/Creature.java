package at.htlhl.sew2.oop.enums;

public enum Creature {
    SNAKE, LIZARD, FISH, INSECT, UNKNOWN;

    @Override
    public String toString() {
        return String.format("Position: %d, Name: %s", this.ordinal(), this.name());
    }
}
