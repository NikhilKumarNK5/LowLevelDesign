package SOLID.singleresponsibility.violation;

public class ViolationDemo {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Marker("name", 10, "color", 2020), 10);
        invoice.calculateTotal();
        invoice.saveToDB();
        invoice.printInvoice();
    }
}