package DesignPatterns.behavioral.strategy.vehicledrivemodes.solution.context;

import DesignPatterns.behavioral.strategy.vehicledrivemodes.solution.strategies.DriveStrategy;

// Concrete context subclass
public class GoodsVehicle extends Vehicle {

    public GoodsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}