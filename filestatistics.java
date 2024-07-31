import java.io.*;

public class FileStatistics {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("sample.txt"))) {
            int words = 0, chars = 0, lines = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                lines++;
                chars += line.length();
                words += line.split("\\s+").length;
            }
            System.out.println("Lines: " + lines + ", Words: " + words + ", Characters: " + chars);
        } catch (IOException e) { e.printStackTrace(); }
    }
}
