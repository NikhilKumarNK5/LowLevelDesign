package SOLID.singleresponsibility.solution;

public class Invoice {
    private Marker marker;
    private int quantity;
    private int total;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    // Responsibility 1 - Calculate total
    public void calculateTotal() {
        System.out.println("Calculating total....");
        this.total = this.marker.price * this.quantity;
    }
}
