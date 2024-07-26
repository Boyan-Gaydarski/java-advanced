import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AdvStreamsFilesAndDirEx1SumLines {
    public static void main(String[] args) throws FileNotFoundException {

        BufferedReader reader = new BufferedReader(new FileReader
                ("C:\\Users\\Hardstep\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"));

        Stream<String> lines = reader.lines();

        List<String> stringLines = lines.collect(Collectors.toList());


        for (String stringLine : stringLines) {
            int sum = 0;
            for (int i = 0; i < stringLine.length(); i++) {
                int current = stringLine.charAt(i);
                sum += current;

            }
            System.out.println(sum);


        }
    }
}
