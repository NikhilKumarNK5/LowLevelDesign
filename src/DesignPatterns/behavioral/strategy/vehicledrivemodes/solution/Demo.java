package DesignPatterns.behavioral.strategy.vehicledrivemodes.solution;

import DesignPatterns.behavioral.strategy.vehicledrivemodes.solution.context.*;
import DesignPatterns.behavioral.strategy.vehicledrivemodes.solution.strategies.EVDrive;
import DesignPatterns.behavioral.strategy.vehicledrivemodes.solution.strategies.NormalDrive;
import DesignPatterns.behavioral.strategy.vehicledrivemodes.solution.strategies.SportsDrive;

public class Demo {
    public static void main(String[] args) {
        System.out.println("###### Strategy Design Pattern ######");
        System.out.println("###### Example: Vehicle Drive Modes ######");

        Vehicle vehicle = new SportsVehicle(new SportsDrive());
        vehicle.drive();

        vehicle = new GoodsVehicle(new NormalDrive());
        vehicle.drive();

        vehicle = new HybridVehicle(new EVDrive());
        vehicle.drive();

        vehicle = new OffRoadVehicle(new SportsDrive());
        vehicle.drive();
    }
}


