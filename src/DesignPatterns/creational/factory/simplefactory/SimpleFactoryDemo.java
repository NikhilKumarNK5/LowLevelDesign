package DesignPatterns.creational.factory.simplefactory;

import DesignPatterns.creational.factory.Shape;
import DesignPatterns.creational.factory.ShapeType;

// Step 3: Simple Factory Demo (Bloated Design)
public class SimpleFactoryDemo {

    public static void main(String[] args) {
        System.out.println("======= Simple Factory Design Pattern ======");

        // set the type you want
        ShapeType shapeType = ShapeType.SQUARE;
        // get the shape
        Shape shape = ShapeFactory.createShape(shapeType);
        shape.draw();
        shape.computeArea();

        System.out.println("----------------------------------------------");

        shapeType = ShapeType.CIRCLE;
        shape = ShapeFactory.createShape(shapeType);
        shape.draw();
        shape.computeArea();
    }

}