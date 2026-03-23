package DesignPatterns.creational.factory.factorymethod;

import DesignPatterns.creational.factory.Shape;

// Step 3: Abstract Creator class
public abstract class ShapeFactory {

    // Factory method - to be implemented by subclasses
    public abstract Shape createShape();

}
