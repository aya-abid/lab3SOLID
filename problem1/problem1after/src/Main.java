import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        InvoiceData invoice = new InvoiceData("ALAMI Samir");

        invoice.addLine("Laptop", 9000);
        invoice.addLine("Mouse", 150);
        invoice.addLine("USB cable", 50);

        InvoiceCalculator calculator = new InvoiceCalculator();
        InvoicePrinter printer = new InvoicePrinter();
        InvoiceRepository repository = new InvoiceRepository();

        System.out.print(printer.print(invoice));

        repository.save(invoice);
    }
}