package SOLID.openclosed.violation;

public class InvoiceDaoOld {
    Invoice invoice;

    public InvoiceDaoOld(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        // Save into the DB the invoice
        System.out.println("Saving to DB...");
    }

}
