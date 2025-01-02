
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class UploadPDF {

    public static void main(String[] args) {
        // Define the path for the nested folders and the local PDF file
        String folderPath = "parent/child1/child2/child3";
        String localPDFPath = "C:/Users/sandeep.a/Desktop/IITM1234_OP123456_08122024.pdf";
    //    String localPDFPath1= "file:///C:/Users/sandeep.a/Desktop/IITM1234_OP123456_08122024.pdf"// Update this path
        String fileName = "sandeep.pdf";

        // Split the folder path into individual folder names
        String[] folders = folderPath.split("/");

        // Create the base directory (you might need to adjust the base path depending on your requirements)
        File baseDir = new File(".");

        // Initialize the current directory as the base directory
        File currentDir = baseDir;

        // Create the nested directories
        for (String folder : folders) {
            currentDir = new File(currentDir, folder);
            if (!currentDir.exists()) {
                boolean created = currentDir.mkdirs(); // Create all non-existent parent directories
                if (created) {
                    System.out.println("Created directory: " + currentDir.getAbsolutePath());
                } else {
                    System.out.println("Failed to create directory: " + currentDir.getAbsolutePath());
                }
            } else {
                System.out.println("Directory already exists: " + currentDir.getAbsolutePath());
            }
        }

        // Define the destination path for the PDF file
        File destinationFile = new File(currentDir, fileName);

        // Copy the local PDF file to the destination directory
        Path sourcePath = new File(localPDFPath).toPath();
        Path destinationPath = destinationFile.toPath();

        try {
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("PDF file uploaded successfully: " + destinationFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("An error occurred while copying the PDF file: " + e.getMessage());
        }
    }
}
