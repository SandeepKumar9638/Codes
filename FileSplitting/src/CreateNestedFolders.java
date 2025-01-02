
import java.io.File;
import java.io.IOException;

public class CreateNestedFolders {

    public static void main(String[] args) {
        // Example nested folder path
        String folderPath = "IITM1234_OP123456_08122024";

        // Split the path into individual folder names
        String[] folders = folderPath.split("_");

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
                    System.out.println("Created: " + currentDir.getAbsolutePath());
                } else {
                    System.out.println("Failed to create: " + currentDir.getAbsolutePath());
                }
            } else {
                System.out.println("Already exists: " + currentDir.getAbsolutePath());
            }
        }
    }
}

