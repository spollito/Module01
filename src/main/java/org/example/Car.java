package org.example;

public class Car extends Vehicle {
    private String brand;

    /**
     * Constructor
     *
     * @param numberOfWheels The number of wheels the car has.
     * @param color The color of the car.
     * @param engineSize The engine size of the car.
     * @param fuelType The type of fuel the car uses.
     * @param brand The brand of the car.
     */
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;

    }


    public void honk (){
        System.out.println("Honk, honk!");

    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(){
        this.brand = brand;
    }
    public void displayInfo(){
        System.out.println("Number of Wheels: "+getNumberOfWheels());
        System.out.println("Color of Vehicle: "+getColor());
        System.out.println("Engine Size: "+getEngineSize());
        System.out.println("Fuel type: "+getFuelType());
        System.out.println("Brand: "+getBrand());

    }
}
