package at.htlhl.sew2.oop.special;

public class PreAndPostIncrementor {
    static void main() {
        int a = 17;
        int b = a++ + ++a;

        IO.println("a: " + a + " b: " + b);
    }
}
