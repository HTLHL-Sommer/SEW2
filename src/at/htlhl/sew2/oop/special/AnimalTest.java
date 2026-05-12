package at.htlhl.sew2.oop.special;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @org.junit.jupiter.api.Test
    void getName() {
        // Schritt 1: Testfall vorbeireiten
        Animal myAnimal = new Animal("Lisi", 4, true);

        // Schritt 2: Testfall durchführen
        String myAnimalName = myAnimal.getName();

        // Schritt 3: Testfall Ergebnis überprüfen
        assertEquals("Lisi", myAnimalName);
    }

    @org.junit.jupiter.api.Test
    void getLegs() {
        Animal myAnimal = new Animal("Lisi", 4, true);
        int legs = myAnimal.getLegs();

        assertEquals(4, legs);
    }

    @org.junit.jupiter.api.Test
    void isMammel() {
        Animal myAnimal = new Animal("Lisi", 4, true);
        boolean mammel = myAnimal.isMammel();

        assertTrue(mammel);
    }

    @org.junit.jupiter.api.Test
    void setLegs() {
        Animal myAnimal = new Animal("Lisi", 4, true);
        myAnimal.setLegs(7);
        int legs = myAnimal.getLegs();

        assertEquals(7, legs);
    }

    @org.junit.jupiter.api.Test
    void setMammel() {
        Animal myAnimal = new Animal("Lisi", 4, true);
        myAnimal.setMammel(false);
        boolean mammel = myAnimal.isMammel();

        assertFalse(mammel);
    }

    @org.junit.jupiter.api.Test
    void equals() {
        Animal myAnimal = new Animal("Lisi", 4, true);
        Animal myAnimalTwo = new Animal("Lisi", 4, true);

        boolean areEqual = myAnimal.equals(myAnimalTwo);

        assertTrue(areEqual);
    }
}
