public interface StudentRepository {
    boolean exists(String cne);
    void save(String cne, String name, String email);
}