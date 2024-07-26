import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class AdvStreamsFilesAndDirEx3AllCaps {
    public static void main(String[] args) throws IOException {

        Path pathFile = Path.of("C:\\Users\\Hardstep\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");

        List<String> lines = Files.readAllLines(pathFile);

        File outputFile = new File("C:\\Users\\Hardstep\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt");

        PrintWriter writer = new PrintWriter(outputFile);
        lines.forEach(line -> writer.println(line.toUpperCase()));
        writer.close();
    }
}
