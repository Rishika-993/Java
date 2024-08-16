package Basics;

public class Classes {
    public static void main(String[] args) {
        
        Car car = new Car();
        car.color = "Red";
        car.model = "Ferrari";
        car.year = 2021;

        System.out.println("Car color: " + car.color);
        System.out.println("Car model: " + car.model);
        System.out.println("Car year: " + car.year);
    }

}

class Car {
    String color;
    String model;
    int year;
}

