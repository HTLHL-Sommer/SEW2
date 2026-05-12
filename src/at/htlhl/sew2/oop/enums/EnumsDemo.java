package at.htlhl.sew2.oop.enums;

public class EnumsDemo {
    void main() {
        Note n1 = Note.GENUEGEND;
        IO.println(n1);

        Note n2 = Note.findByPoints(64);
        IO.println(n2);
    }
}
