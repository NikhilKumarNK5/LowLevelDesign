package DesignPatterns.creational.factory.factorymethod;

import DesignPatterns.creational.factory.Shape;
import DesignPatterns.creational.factory.Rectangle;

// Step 4: Concrete Creator classes
public class RectangleCreator extends ShapeFactory {

    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}

