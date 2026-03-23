package DesignPatterns.creational.factory.factorymethod;

import DesignPatterns.creational.factory.Square;
import DesignPatterns.creational.factory.Shape;

// Step 4: Concrete Creator classes
public class SquareCreator extends ShapeFactory {

    @Override
    public Shape createShape() {
        return new Square();
    }
}
