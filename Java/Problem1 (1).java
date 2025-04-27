/*Let’s consider the example of vehicles like bicycles, cars, and bikes. They have common functionalities. So, make an interface and put all these common functionalities i.e.,changeGear(), SpeedUp(), ApplyBreak() . And let Bicycle, Bike, car etc implement all
these functionalities in their own class in their own way.
*/

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Bicycle bc1 = new Bicycle();
        Bike b1 = new Bike();
        Car c1 = new Car();

        // Bicycle operations
        System.out.println("\n--- Bicycle Operations ---");
        System.out.print("Enter gear for Bicycle (1-3): ");
        int bicycleGear = scanner.nextInt();
        bc1.changeGear(bicycleGear);
        
        System.out.print("Enter speed increment for Bicycle: ");
        int bicycleSpeedUp = scanner.nextInt();
        bc1.speedUp(bicycleSpeedUp);
        
        System.out.print("Enter brake decrement for Bicycle: ");
        int bicycleBrake = scanner.nextInt();
        bc1.applyBrake(bicycleBrake);

        // Bike operations
        System.out.println("\n--- Bike Operations ---");
        System.out.print("Enter gear for Bike (1-5): ");
        int bikeGear = scanner.nextInt();
        b1.changeGear(bikeGear);
        
        System.out.print("Enter speed increment for Bike: ");
        int bikeSpeedUp = scanner.nextInt();
        b1.speedUp(bikeSpeedUp);
        
        System.out.print("Enter brake decrement for Bike: ");
        int bikeBrake = scanner.nextInt();
        b1.applyBrake(bikeBrake);

        // Car operations
        System.out.println("\n--- Car Operations ---");
        System.out.print("Enter gear for Car (1-6): ");
        int carGear = scanner.nextInt();
        c1.changeGear(carGear);
        
        System.out.print("Enter speed increment for Car: ");
        int carSpeedUp = scanner.nextInt();
        c1.speedUp(carSpeedUp);
        
        System.out.print("Enter brake decrement for Car: ");
        int carBrake = scanner.nextInt();
        c1.applyBrake(carBrake);

        scanner.close();
    }
}

interface Vehicle {
    void changeGear(int gear);
    void speedUp(int increment);
    void applyBrake(int decrement);
}

class Bicycle implements Vehicle {
    int speed = 0;
    int gear = 1;

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Bicycle gear changed to : " + gear);
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
        System.out.println("Bicycle speed increased to : " + speed + "km/h");
    }

    @Override
    public void applyBrake(int decrement) {
        speed = speed - decrement;
        System.out.println("Bicycle speed decreased to : " + speed + "km/h");
    }
}

class Bike implements Vehicle {
    int speed = 0;
    int gear = 1;

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Bike gear changed to : " + gear);
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
        System.out.println("Bike speed increased to : " + speed + "km/h");
    }

    @Override
    public void applyBrake(int decrement) {
        speed = speed - decrement;
        System.out.println("Bike speed decreased to : " + speed + "km/h");
    }
}

class Car implements Vehicle {
    int speed = 0;
    int gear = 1;

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Car gear changed to : " + gear);
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
        System.out.println("Car speed increased to : " + speed + "km/h");
    }

    @Override
    public void applyBrake(int decrement) {
        speed = speed - decrement;
        System.out.println("Car speed decreased to : " + speed + "km/h");
    }
}
