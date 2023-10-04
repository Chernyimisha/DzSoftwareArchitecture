package DZ_architecture.DZ_2.factory_pattern;

abstract class Vehicle
{
    public abstract String getVehicleType();
    public abstract int getFactoryNumber();
    public String toString()
    {
        return "Vehicle: " + this.getVehicleType() + " " + "Factory number: " + this.getFactoryNumber();
    }
}

class Car extends Vehicle
{
    String type;
    int factoryNumber;
    Car(String type, int factoryNumber)
    {
        this.type = type;
        this.factoryNumber = factoryNumber;
    }

    @Override
    public String getVehicleType() {
        return this.type;
    }

    @Override
    public int getFactoryNumber(){
        return this.factoryNumber;
    }
}

class Bike extends Vehicle
{
    String type;
    int factoryNumber;
    Bike(String type, int factoryNumber)
    {
        this.type = type;
        this.factoryNumber = factoryNumber;
    }

    @Override
    public String getVehicleType() {
        return this.type;
    }

    @Override
    public int getFactoryNumber()
    {
        return this.factoryNumber;
    }
}

class VehicleFactory
{
    public static Vehicle getInstance(String type, int factoryNumber)
    {
        if(type == "car")
        {
            return new Car(type, factoryNumber);
        }
        else if(type == "bike")
        {
            return new Bike(type, factoryNumber);
        }
        else
        {
        throw new IllegalArgumentException("Unsupported vehicle type");
        }
    }
}

public class FactoryPattern
{
    public static void main(String[] args) {
        try {
            Vehicle car = VehicleFactory.getInstance("car", 1548665);
            System.out.println(car);

            Vehicle bike = VehicleFactory.getInstance("bike", 23335644);
            System.out.println(bike);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
