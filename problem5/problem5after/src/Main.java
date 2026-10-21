public class Main {
    public static void main(String[] args) {
        StudentRepository store =
                new CsvStudentRepository("students.csv");

        Notifier notifier = new SmsNotifier();

        EnrollmentService service =
                new EnrollmentService(store, notifier);

        service.enroll("22885676", "SAFI Amal", "0612345678");

        try {
            service.enroll("22885676", "SAFI Amal", "0612345678");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}