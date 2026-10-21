import java.io.FileWriter;
import java.io.IOException;

public class InvoiceRepository {

    public void save(InvoiceData invoice) throws IOException {
        InvoicePrinter printer = new InvoicePrinter();

        try (FileWriter fw = new FileWriter(invoice.getCustomer() + ".txt")) {
            fw.write(printer.print(invoice));
        }
    }
}