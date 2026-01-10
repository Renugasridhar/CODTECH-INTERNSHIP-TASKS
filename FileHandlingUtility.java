import java.io.*;
import java.util.Scanner;

public class FileHandlingUtility {

    static String fileName = "sample.txt";

    // Method to write data to file
    public static void writeFile() {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("This is a sample file.\n");
            writer.write("Java File Handling Utility.\n");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }

    // Method to read data from file
    public static void readFile() {
        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            System.out.println("\n--- File Content ---");
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    // Method to modify (append) data to file
    public static void modifyFile() {
        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write("This line is appended to the file.\n");
            writer.close();
            System.out.println("File modified successfully.");
        } catch (IOException e) {
            System.out.println("Error modifying file.");
        }
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("File Handling Utility");

        writeFile();    // Write data
        readFile();     // Read data
        modifyFile();   // Modify data
        readFile();     // Read updated file
    }
}