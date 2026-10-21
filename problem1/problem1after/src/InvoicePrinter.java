public class InvoicePrinter {

    private final InvoiceCalculator calculator = new InvoiceCalculator();

    public String print(InvoiceData invoice) {
        StringBuilder sb = new StringBuilder();

        sb.append("Invoice for ")
                .append(invoice.getCustomer())
                .append("\n");

        for (InvoiceLine line : invoice.getLines()) {
            sb.append(formatLine(line.item(), line.price()));
        }

        sb.append(formatLine("Subtotal", calculator.subtotal(invoice)));
        sb.append(formatLine("TOTAL", calculator.total(invoice)));

        return sb.toString();
    }

    private String formatLine(String label, double value) {
        return String.format("%s %.2f%n", label, value);
    }
}