public class TeachingAssistant implements Learner, Teacher {
    private final String name;

    public TeachingAssistant(String name) {
        this.name = name;
    }

    public void enrollInCourse(String code) {
        System.out.println(name + " enrolls in " + code);
    }

    public void payTuition(double amount) {
        System.out.println(name + " pays " + amount + " MAD");
    }

    public void teach(String code) {
        System.out.println(name + " teaches " + code);
    }

    public void gradeExam(String code) {
        System.out.println(name + " grades " + code);
    }
}