import java.util.List;

public class Bank {
    public static void chargeMonthlyFee(
            List<? extends WithdrawableAccount> accounts) {

        for (WithdrawableAccount a : accounts) {
            a.withdraw(10);
        }
    }
}