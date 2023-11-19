package o11_09_Polymorphism_Ex.vehicles;

public class Truck extends AbstractVehicle{

    private static final double SUMMER_FUEL_CONSUMPTION = 1.6;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + SUMMER_FUEL_CONSUMPTION);
    }


    @Override
    public void refuel(double liters) {
        super.refuel(liters * 0.95);
    }
}
