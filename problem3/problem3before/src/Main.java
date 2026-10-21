import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Account a1 = new Account(500);
        Account a2 = new FixedTermAccount(1000);

        List<Account> accounts = new ArrayList<>();
        accounts.add(a1);
        accounts.add(a2);

        Bank.chargeMonthlyFee(accounts);
    }
}