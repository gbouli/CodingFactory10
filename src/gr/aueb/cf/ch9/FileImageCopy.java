package gr.aueb.cf.ch9;

import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Αντιγραφή εικόνας από ένα αρχείο σε ένα άλλο.
 */
public class FileImageCopy {

    public static void main(String[] args) {
        Path source = Path.of("C:\\Users\\mpoul\\Desktop\\image.jpg");
        Path target = Path.of("C:\\Users\\mpoul\\Desktop\\image-copy.jpg");

        copyImage(source, target);
    }

    public static void copyImage(Path sourcePath, Path destPath) {
        try (var sourceStream = Files.newInputStream(sourcePath);
             var targetStream = Files.newOutputStream(destPath)) {
            sourceStream.transferTo(targetStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

