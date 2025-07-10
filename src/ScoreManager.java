import java.io.*;
import java.nio.file.*;

public class ScoreManager {
    public void saveScore(String filename, String username, int score) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(filename), StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            writer.write(username + "-" + score + " points");
            writer.newLine();
        } catch (IOException e) {
            System.err.print("Error writing classification file: " + e.getMessage());
        }
    }
}

