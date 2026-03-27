public class Bus extends Vehicle implements Servicable {
    private int passengerCapacity;

    public Bus(String model, int year, double basePrice, int passengerCapacity) {
        super(model, year, basePrice);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public double calculateInsuranceFee() {
        return (basePrice * 0.10) + (passengerCapacity * 50);
    }

    @Override
    public void performService() {
        System.out.println("Service for Bus " + model + ": Inspecting tires and passenger seats.");
    }

    @Override
    public int getServiceIntervalKm() {
        return 25000;
    }

    @Override
    public String toString() {
        return super.toString() + " | Capacity: " + passengerCapacity + " (Type: Bus)";
    }
}