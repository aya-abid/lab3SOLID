import java.io.*;

public class CsvStudentStore {
    private String filename;

    public CsvStudentStore(String filename) {
        this.filename = filename;
    }

    public boolean exists(String cne) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] student = line.split(",");
                if (student[0].equals(cne)) {
                    reader.close();
                    return true;
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            return false;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public void append(String cne, String name, String email) {
        try {
            FileWriter writer = new FileWriter(filename, true);
            writer.write(cne + "," + name + "," + email + "\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}