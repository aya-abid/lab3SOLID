public class Student implements Learner {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public void enrollInCourse(String code) {
        System.out.println(name + " enrolls in " + code);
    }

    public void payTuition(double amount) {
        System.out.println(name + " pays " + amount + " MAD");
    }
}