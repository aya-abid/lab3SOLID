import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CurrentAccount current = new CurrentAccount(500);
        FixedTermAccount fixed = new FixedTermAccount(1000);

        List<CurrentAccount> accounts = new ArrayList<>();
        accounts.add(current);

        Bank.chargeMonthlyFee(accounts);

        System.out.println(
                "Current account balance: " + current.getBalance()
        );
        System.out.println(
                "Fixed-term account balance: " + fixed.getBalance()
        );
    }
}