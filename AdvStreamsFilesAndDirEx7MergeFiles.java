import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class AdvStreamsFilesAndDirEx7MergeFiles {
    public static void main(String[] args) throws IOException {

        Path pathFile1 = Path.of("C:\\Users\\Hardstep\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt");

        List<String> lines = Files.readAllLines(pathFile1);

        PrintWriter writer = new PrintWriter("merged-output.txt");

        for (String line : lines) {

            writer.println(line);

        }
        writer.flush();

        Path pathFile2 = Path.of("C:\\Users\\Hardstep\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt");

        List<String> lines2 = Files.readAllLines(pathFile2);

        for (String line : lines2) {

            writer.println(line);
        }
        writer.close();
    }
}
