package SOLID.openclosed.violation;

public class Invoice {
    private Marker marker;
    private int quantity;
    private int total;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public void calculateTotal() {
        System.out.println("Calculating total....");
        this.total = this.marker.price * this.quantity;
    }
}