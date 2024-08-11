/*package in.dsa.zloop.pttrn;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileCounter {

    public static void main(String[] args) {
        // Specify the root directory here
        Path rootDir = Paths.get("B:\\ASL\\ASL\\src\\in\\dsa");

        try {
            long fileCount = countFiles(rootDir);
            System.out.println("Total number of files: " + fileCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static long countFiles(Path rootDir) throws IOException {
        // Use Files.walk to traverse the directory tree
        try (Stream<Path> paths = Files.walk(rootDir)) {
            // Count files only (exclude directories)
            return paths
                .filter(Files::isRegularFile)  // Filter to keep only files
                .count();  // Count the number of files
        }
    }
}
*/