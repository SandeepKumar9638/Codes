import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNestedFoldersAndFile {

    public static void main(String[] args) {
        // Example nested folder path
        String folderPath = "parent/child1/child2/child3";
        // File name and content
        String fileName = "example.txt";
        String fileContent = "This is a sample file content.";

        // Split the path into individual folder names
        String[] folders = folderPath.split("/");

        // Create the base directory (you might need to adjust the base path depending on your requirements)
        File baseDir = new File(".");

        // Initialize the current directory as the base directory
        File currentDir = baseDir;

        for (String folder : folders) {
            // Create a new folder path
            currentDir = new File(currentDir, folder);

            // Create the folder if it does not already exist
            if (!currentDir.exists()) {
                boolean created = currentDir.mkdir(); // Use mkdirs() to create all non-existent parent directories
                if (created) {
                    System.out.println("Created directory: " + currentDir.getAbsolutePath());
                } else {
                    System.out.println("Failed to create directory: " + currentDir.getAbsolutePath());
                }
            } else {
                System.out.println("Directory already exists: " + currentDir.getAbsolutePath());
            }
        }

        // Create the file in the deepest directory
        File file = new File(currentDir, fileName);

        try (FileWriter writer = new FileWriter(file)) {
            // Write content to the file
            writer.write(fileContent);
            System.out.println("File created: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("An error occurred while creating or writing to the file: " + e.getMessage());
        }
    }
}

