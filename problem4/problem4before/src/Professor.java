public class Professor implements UniversityMember{
    private final String name;
    public Professor(String name) { this.name = name; }
    public void enrollInCourse(String code) {
        throw new UnsupportedOperationException();
    }
    public void payTuition(double amount) {
        throw new UnsupportedOperationException();
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
