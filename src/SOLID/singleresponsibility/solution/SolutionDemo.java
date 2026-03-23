package SOLID.singleresponsibility.solution;

public class SolutionDemo {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Marker("color", "name", 10, 2020), 10);
        InvoiceDao invoiceDao = new InvoiceDao(invoice);
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);

        invoice.calculateTotal();
        invoiceDao.saveToDB();
        invoicePrinter.print();
    }
}
