package DesignPatterns.creational.factory.simplefactory;

import DesignPatterns.creational.factory.Circle;
import DesignPatterns.creational.factory.Rectangle;
import DesignPatterns.creational.factory.ShapeType;
import DesignPatterns.creational.factory.Shape;
import DesignPatterns.creational.factory.Square;

public class ShapeFactory {
    public static Shape createShape(ShapeType shapeType) {
        if (shapeType == null) {
            return null;
        }
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case RECTANGLE -> new Rectangle();
            case SQUARE -> new Square();
            default -> throw new IllegalStateException("ShapeType doesn't exist.");
        };
    }
}

