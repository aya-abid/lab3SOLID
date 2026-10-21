public class SmsNotifier implements Notifier {

    public void notify(String to, String message) {
        System.out.println("[SMS to " + to + "] " + message);
    }
}