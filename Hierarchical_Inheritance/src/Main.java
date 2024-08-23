/*
Hierarchical inheritance is where multiple derived classes inherit
from a single base or parent class.*/
class Vehicle {
    void key() {
        System.out.println("Key is Needed to Drive a Vehicle");
    }

    void Petrol() {
        System.out.println("Petrol is Needed to Drive a Vehicle");
    }

    void License() {
        System.out.println("License is Needed to Drive a Vehicle");
    }
}
class Bus extends Vehicle {
    void Helmet() {
        System.out.println("To Drive Bike We Have to wear Helmet");
    }
}
class Car extends Vehicle {
    void SeatBelt() {
        System.out.println("To Drive Car We Have To Wear Seat Belts");
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.key();
        car.Petrol();
        car.License();
        car.SeatBelt();
    }
}
