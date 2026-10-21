public class EmailSender {
    private String server;

    public EmailSender(String server) {
        this.server = server;
    }

    public void send(String email, String message) {
        System.out.println("Email sent to " + email);
        System.out.println("Server: " + server);
        System.out.println("Message: " + message);
    }
}