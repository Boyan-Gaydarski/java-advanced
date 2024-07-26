import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AdvStreamsFilesAndDirEveryThirdLine {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader
                (new FileReader("C:\\\\Users\\\\Hardstep\\\\Downloads\\\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\\\input.txt"));

        Stream<String> lines = reader.lines();

        List<String> stringLines = lines.collect(Collectors.toList());

        BufferedWriter writer = new BufferedWriter(new FileWriter("every-third-line.txt"));

        for (int i = 0; i < stringLines.size(); i++) {
            if ((i + 1) % 3 == 0) {
                writer.write(stringLines.get(i));
                writer.newLine();

            }
        }
        writer.close();
    }
}
