import java.io.FileNotFoundException;
import java.util.Scanner;

public class WeatherSummary {
    /**
     * Reads newline-delimited temperatures from System.in and prints summary
     * statistics to System.out.
     * 
     * Example input:
     * 66.4
     * 77.1
     * 72.6
     * 
     * Example output:
     * Max: 66.4
     * Min: 77.1
     * Average: 72.03333333333333
     * 
     * @param args command line arguments (ignored)
     */
    public static void main(String[] args) {
        // Implement this method!
        // Hint: use Scanner. nextDouble() and hasNextDouble() will be helpful here!
        System.out.println("test");
        java.io.File checkFile = new java.io.File("temps");
        System.out.println("real?" + checkFile.exists() + "length" + checkFile.length());
        try (Scanner scanner = new Scanner(new java.io.File("temps"))) {
            while(scanner.hasNextDouble()) {
                System.out.println(scanner.nextDouble());
            }
        } catch (FileNotFoundException error) {
            System.out.println("File not found.");
        }
    }
}
