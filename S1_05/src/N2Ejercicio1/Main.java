//line below to be commented when JAVA compile
package N2Ejercicio1;

import java.io.*;
import java.util.*;

public class Main {

        public static void main(String[] args) {
            String currentDirectoryPath = System.getProperty("user.dir"); // This is the current working directory
            File currentDirectory = new File(currentDirectoryPath);

            String configuration = "config.properties";
            String filePath = currentDirectory + File.separator + configuration;

            Properties properties = new Properties();
            try (InputStream input = new FileInputStream(filePath)) {
                properties.load(input);
            } catch (IOException e) {
                System.err.println("Error loading configuration file: " + e.getMessage());
                return;
            }

            // Get the paths from the properties file
            String inputDirectoryPath = properties.getProperty("input.directory");
            String outputFilePath = properties.getProperty("output.file.path");

            // Convert the paths to absolute paths relative to the current working directory
            File inputDirectory = new File(currentDirectory, inputDirectoryPath);
            File outputFile = new File(currentDirectory, outputFilePath);

            // Validate the input directory
            if (!inputDirectory.isDirectory()) {
                System.out.println("The specified input path is not a directory.");
                return;
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                FolderLister directoryTree = new FolderLister();
                directoryTree.listDirectoryRecursive(inputDirectory, "", writer);
            } catch (IOException e) {
                System.err.println("Error while writing the file: " + e.getMessage());
            }
        }
    }
