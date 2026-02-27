package at.htlhl.sew2.stringprocessing;

import java.util.Arrays;

public class StringProcessor {
    static void main() {
        String csv = "ab;cde;f;ghij";
        String[] stringArray = csv.split(";");
        IO.println(Arrays.toString(stringArray));

        IO.println("a".toUpperCase());

        IO.println("abcd".charAt(3));

        String hallo = " Hallo ";
        hallo.isBlank();
        String hallo2 = hallo.trim();
        IO.println(">" + hallo + "<");
        IO.println(">" + hallo2 + "<");

        boolean isHa = hallo.startsWith("ha");
        IO.println("isHa: " + isHa);

        IO.println("IndexOf: " + "abcmnoxyzabcmnoxyz".indexOf("xyz"));
        IO.println("IndexOf: " + "abcmnoxyzabcmnoxyz".indexOf("Xyz"));
        IO.println("IndexOf: " + "abcmnoxyzabcmnoxyz".indexOf("abc"));
        IO.println("IndexOf: " + "aBcmnoxyzabcmnoxyz".toLowerCase().indexOf("abc"));


        IO.println("IndexOf: " + "abcmnoxyzabcmnoxyz".lastIndexOf("xyz"));

        int lastIndex = "abxyabxyabxyab".lastIndexOf("xy");
        IO.println("abxyabxyabxyab".lastIndexOf("xy", lastIndex - 1));

        int firstIndex = "abxyabxyabxyab".indexOf("xy");
        IO.println("abxyabxyabxyab".lastIndexOf("xy", firstIndex + 1));
    }
}
