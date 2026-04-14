package at.htlhl.sew2.oop.enums;

public class Zoo {
    void main() {
        IO.println("Our creatures ...");
        Creature myCreature = Creature.FISH;

        if (myCreature == Creature.FISH) {
            IO.println("Wir haben einen Fisch :-)");
        } else {
            IO.println("Kein Fish im Aquarium :-(");
        }

        switch (myCreature) {
            case Creature.FISH:
                IO.println("Wir haben einen Fisch :-)");
                break;
            case Creature.LIZARD:
                IO.println("Unsere Eidechse Hansi!");
                break;
            case Creature.SNAKE:
                IO.println("Klapperschlangenalarm!");
                break;
            default:
                IO.println("Irgendein Kriechtier");
        }
    }
}
