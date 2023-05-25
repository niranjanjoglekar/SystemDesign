package DesignPatterns.StrategyDesignPattern;

/**
 * @author niranjanjoglekar on 25/05/23
 */
public class SportsVehicle extends Vehicle{

    SportsVehicle(){
        super(new SpecialDriveStrategy());
    }
}
