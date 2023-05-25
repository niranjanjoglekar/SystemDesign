package DesignPatterns.StrategyDesignPattern;

/**
 * @author niranjanjoglekar on 25/05/23
 */
public class NormalVehicle extends Vehicle{

    NormalVehicle(){
        super(new NormalDriveStrategy());
    }
}
