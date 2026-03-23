package DesignPatterns.behavioral.strategy.vehicledrivemodes.solution.context;

import DesignPatterns.behavioral.strategy.vehicledrivemodes.solution.strategies.DriveStrategy;

// Concrete context subclass
public class HybridVehicle extends Vehicle {

    public HybridVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}

