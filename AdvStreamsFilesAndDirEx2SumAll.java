import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class AdvStreamsFilesAndDirEx2SumAll {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("C:\\Users\\Hardstep\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");

        long sum = 0;

        byte[] values = Files.readAllBytes(path);
        for (byte value : values) {
            if (value == 10 || value == 13) {
                continue;
            }
            sum += value;
        }
        System.out.println(sum);
    }
}
