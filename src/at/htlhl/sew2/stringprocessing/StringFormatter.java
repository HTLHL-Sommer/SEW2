void main() {

    String name = "Maxi";
    int age = 5;

    IO.println("Person: " + name + ", " + age + " Jahre.");

    String personFormatted = String.format("Person: %s, %d Jahre.", name, age);
    IO.println(personFormatted);

    IO.println(String.format("Hallo %S", name));

    IO.println(String.format("Hallo %S", name));
    IO.println(String.format("%b", 2==3));
    IO.println(String.format("%B", 2==3));

    IO.println(String.format("%X", 14));

    IO.println(String.format("PI: %f", 3.1415926f));
    IO.println(String.format("PI: %.2f", 3.1415926f));

    IO.println(String.format("%8d", 1234));
    IO.println(String.format("%8d", 12345678));

    IO.println(String.format("%8s", "2AHITS"));

    IO.println(String.format(">%08.2f<", 3.1415926));

    IO.println(String.format(">%08d<", 3)); // mit 0 statt Leerzeichen auffüllen

    IO.println(String.format(">%-8d<", 3)); // linksbündig

    IO.println(String.format("%+d", 3)); // Vorzeichen immer anzeigen

    IO.println(String.format(Locale.GERMANY, "%+d", 3)); // DE Formatierung (3,14)
    IO.println(String.format(Locale.US, "%+d", 3)); // US Formatierung (3.14)
}