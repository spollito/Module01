package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle(4, "Blue", 5, "EV");
        System.out.println("Number of Wheels: " + myVehicle.getNumberOfWheels());
        System.out.println("Color: " + myVehicle.getColor());
        System.out.println("Engine Size: " + myVehicle.getEngineSize());
        System.out.println("Fuel Type: " + myVehicle.getFuelType());
        System.out.println("");

        Car myCar = new Car(4, "Red", 5, "EV", "Hyundai");
        myCar.displayInfo();
        myCar.honk();



    }

}