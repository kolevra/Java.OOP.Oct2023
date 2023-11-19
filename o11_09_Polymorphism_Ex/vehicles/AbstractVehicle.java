package o11_09_Polymorphism_Ex.vehicles;

import java.text.DecimalFormat;

public abstract class AbstractVehicle implements Vehicle {

    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.##");

    private double fuelQuantity;
    private double fuelConsumption;

    public AbstractVehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }


    @Override
    public String drive(double distance) {

        double fuelNeeded = this.fuelConsumption * distance;

        if(this.fuelQuantity >= fuelNeeded){
            this.fuelQuantity -= fuelNeeded;
            return String.format("%s travelled %s km", this.getClass().getSimpleName(), DECIMAL_FORMAT.format(distance));
        }

        return String.format("%s needs refueling", this.getClass().getSimpleName());
    }

    @Override
    public void refuel(double liters) {
        this.fuelQuantity += liters;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
