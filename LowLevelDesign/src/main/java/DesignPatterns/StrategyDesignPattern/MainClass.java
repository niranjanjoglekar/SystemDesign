package DesignPatterns.StrategyDesignPattern;

/**
 * @author niranjanjoglekar on 25/05/23
 */
public class MainClass {

    public static void main(String[] args) {
        Vehicle vehicle = new NormalVehicle();
        vehicle.drive();

        vehicle = new SportsVehicle();
        vehicle.drive();
    }
}
