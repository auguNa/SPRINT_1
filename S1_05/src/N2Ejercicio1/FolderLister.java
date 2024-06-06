//line below to be commented when JAVA compile
package N2Ejercicio1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class FolderLister {
    public void listDirectoryRecursive(File directory, String indent, BufferedWriter writer) throws IOException {
        String[] fileList = directory.list();

        Arrays.sort(fileList);

        for (String file : fileList) {
            File currentFile = new File(directory.getPath() + File.separator + file);

            long lastModifiedTime = currentFile.lastModified();
            Date lastModifiedDate = new Date(lastModifiedTime);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            writer.write(indent + (currentFile.isDirectory() ? "D " : "F ") + file + " (Last modified: " + sdf.format(lastModifiedDate) + ")\n");

            if (currentFile.isDirectory()) {
                listDirectoryRecursive(currentFile, indent + "    ", writer);
            }
        }
    }

    public void saveDirectoryTreeToFile(File directory, String outputPath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            listDirectoryRecursive(directory, "", writer);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

