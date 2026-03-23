package SOLID.singleresponsibility.violation;

public class Marker {
    String name;
    String color;
    int year;
    int price;

    public Marker(String name, int price, String color, int year) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.year = year;
    }
}
