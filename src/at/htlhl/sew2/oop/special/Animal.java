package at.htlhl.sew2.oop.special;

public class Animal {
    private String name;
    private int legs;
    private boolean isMammel;

    public Animal(String name, int legs, boolean isMammel) {
        this.name = name;
        this.legs = legs;
        this.isMammel = isMammel;
    }

    @Override
    public boolean equals(Object other) {
        // 1. Überprüfen auf gleiche Referenz
        if (this == other) {
            return true;
        }

        // 2. Klassen vergleichen
        if (!(other instanceof Animal)) {
            return false;
        }

        // 3. Objekt in Animal umwandeln
        Animal animal = (Animal) other;

        // 4. Alle Attribute vergleichen
        return this.name.equals(animal.name) && this.legs == animal.legs && this.isMammel == animal.isMammel;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setMammel(boolean isMammel) {
        this.isMammel = isMammel;
    }

    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public boolean isMammel() {
        return isMammel;
    }
}
