package N1Ejercicio4;//package S1_05.N1Ejercicio4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String currentDirectoryPath = System.getProperty("user.dir");
        System.out.println("Current Path: " + currentDirectoryPath);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the file path: ");
        String filePath = scanner.nextLine();
        scanner.close();
        System.out.println("File Path: " + filePath);

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error while reading file: " + e.getMessage());
        }
    }
}
