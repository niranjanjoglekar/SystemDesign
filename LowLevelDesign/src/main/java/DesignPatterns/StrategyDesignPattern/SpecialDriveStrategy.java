package DesignPatterns.StrategyDesignPattern;

/**
 * @author niranjanjoglekar on 25/05/23
 */
public class SpecialDriveStrategy implements Drive{

    @Override
    public void driveVehicle() {
        System.out.println("Special drive vehicle");
    }
}
