package DesignPatterns.creational.factory.factorymethod;

import DesignPatterns.creational.factory.Circle;
import DesignPatterns.creational.factory.Shape;

// Step 4: Concrete Creator classes
public class CircleCreator extends ShapeFactory {

    @Override
    public Shape createShape() {
        return new Circle();
    }
}

