import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class AdvStreamsFilesAndDirEx5LineNumbers {
    public static void main(String[] args) throws IOException {

        Path filePath = Path.of("C:\\Users\\Hardstep\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");

        List<String> lines = Files.readAllLines(filePath);
        int row = 1;

        PrintWriter writer = new PrintWriter("number-lines-output.txt");

        for (String line : lines) {
            writer.println(row++ + ". " + line);

        }
        writer.close();
    }
}
