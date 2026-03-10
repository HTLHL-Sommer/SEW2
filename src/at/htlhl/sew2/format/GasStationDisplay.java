import at.htlhl.sew2.format.Fuel;

void main() {
    ArrayList<Fuel> fuelList = new ArrayList<>();

    fuelList.add(new Fuel("Diesel", 1.959));
    fuelList.add(new Fuel("Super 95", 1.729));
    fuelList.add(new Fuel("V-Power° 100", 1.929));
    fuelList.add(new Fuel("V-Power° Diesel", 2.159));

    IO.println("-----------------------------------");
    IO.println(String.format("%27s", "Gas Station Prices"));
    IO.println("-----------------------------------");
    IO.println(String.format("%-20s %10s", "Fuel Type", "Price (€/1)"));
    IO.println("-----------------------------------");
}
