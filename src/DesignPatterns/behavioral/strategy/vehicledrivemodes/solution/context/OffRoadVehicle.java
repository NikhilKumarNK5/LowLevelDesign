package DesignPatterns.behavioral.strategy.vehicledrivemodes.solution.context;

import DesignPatterns.behavioral.strategy.vehicledrivemodes.solution.strategies.DriveStrategy;

// Concrete context subclass
public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}