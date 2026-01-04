public class Car extends Vehicle implements Servise {
    private int numberOfDoors;

    public Car(String model, int year, double basePrice, int numberOfDoors) {
        super(model, year, basePrice);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateInsuranceFee() {
        return (basePrice * 0.05) + (getAge(2026) * 100);
    }

    @Override
    public void performService() {
        System.out.println("Service for Car " + model + ": Checking engine and changing oil.");
    }

    @Override
    public int getServiceIntervalKm() {
        return 15000;
    }

    @Override
    public String toString() {
        return super.toString() + " | Doors: " + numberOfDoors + " (Type: Car)";
    }
}
