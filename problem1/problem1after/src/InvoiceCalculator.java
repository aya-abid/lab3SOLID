public class InvoiceCalculator {
    public double subtotal(InvoiceData invoice) {
        double sum = 0;

        for (InvoiceLine line : invoice.getLines()) {
            sum += line.price();
        }
        return sum;
    }

    public double total(InvoiceData invoice) {
        return subtotal(invoice) * 1.20;
    }
}