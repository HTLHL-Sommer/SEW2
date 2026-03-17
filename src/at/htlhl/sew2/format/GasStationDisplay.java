import at.htlhl.sew2.format.Fuel;

void main() {
    ArrayList<Fuel> fuelList = new ArrayList<>();

    fuelList.add(new Fuel("Diesel", 1.959));
    fuelList.add(new Fuel("Premium Diesel", 3.141));
    fuelList.add(new Fuel("Super 95", 1.729));
    fuelList.add(new Fuel("V-Power° 100", 1.929));
    fuelList.add(new Fuel("V-Power° Diesel", 2.159));

    String userInput = IO.readln("Eigene Treibstoffsorte inkl. Preis <fuel>;<price>: ");
    Fuel userFuel = Fuel.valueOf(userInput);

    IO.println("-----------------------------------");
    IO.println(String.format("%27s", "Gas Station Prices"));
    IO.println("-----------------------------------");
    IO.println(String.format("%-20s %10s", "Fuel Type", "Price (€/l)"));
    IO.println("-----------------------------------");
    for (Fuel fuel : fuelList) {
        IO.println(String.format("%-20s %10.3f", fuel.getName(), fuel.getPrice()));
    }
    IO.println(String.format("%-20s %10.3f", userFuel.getName(), userFuel.getPrice()));
    IO.println("-----------------------------------");

    IO.println();
    IO.println(String.format("Total fuel types: %d", fuelList.size()));

    IO.println(userFuel.toString());
}
