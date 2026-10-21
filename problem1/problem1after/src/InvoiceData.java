import java.util.ArrayList;
import java.util.List;

public class InvoiceData {
    private final String customer;
    private final List<InvoiceLine> lines = new ArrayList<>();

    public InvoiceData(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public List<InvoiceLine> getLines() {
        return lines;
    }

    public void addLine(String item, double price) {
        lines.add(new InvoiceLine(item, price));
    }
}