public class Professor implements Teacher, Researcher {
    private final String name;

    public Professor(String name) {
        this.name = name;
    }

    public void teach(String code) {
        System.out.println(name + " teaches " + code);
    }

    public void gradeExam(String code) {
        System.out.println(name + " grades " + code);
    }

    public void publishPaper(String title) {
        System.out.println(name + " publishes " + title);
    }
}