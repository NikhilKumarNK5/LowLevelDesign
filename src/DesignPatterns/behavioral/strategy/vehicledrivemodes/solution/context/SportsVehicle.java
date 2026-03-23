package DesignPatterns.behavioral.strategy.vehicledrivemodes.solution.context;


import DesignPatterns.behavioral.strategy.vehicledrivemodes.solution.strategies.DriveStrategy;

// Concrete context subclass
public class SportsVehicle extends Vehicle {

    public SportsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}

