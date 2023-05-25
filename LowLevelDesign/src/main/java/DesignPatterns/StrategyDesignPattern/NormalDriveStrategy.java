package DesignPatterns.StrategyDesignPattern;

/**
 * @author niranjanjoglekar on 25/05/23
 */
public class NormalDriveStrategy implements Drive{

    @Override
    public void driveVehicle() {
        System.out.println("Normal drive vehicle");
    }
}
