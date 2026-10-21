public class EmailNotifier implements Notifier {
    private String server;

    public EmailNotifier(String server) {
        this.server = server;
    }

    public void notify(String to, String message) {
        System.out.println("Email to " + to + " via " + server);
        System.out.println(message);
    }
}