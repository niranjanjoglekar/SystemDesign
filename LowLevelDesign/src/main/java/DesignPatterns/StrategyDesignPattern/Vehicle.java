package DesignPatterns.StrategyDesignPattern;

/**
 * @author niranjanjoglekar on 25/05/23
 */
public class Vehicle {

    Drive drive ;

    Vehicle(Drive drive){
        this.drive = drive;
    }

    public void drive(){
        drive.driveVehicle();
    }
}
