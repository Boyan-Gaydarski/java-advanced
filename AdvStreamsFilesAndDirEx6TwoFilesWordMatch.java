import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class AdvStreamsFilesAndDirEx6TwoFilesWordMatch {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("C:\\Users\\Hardstep\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt");
        List<String> lines = Files.readAllLines(path);

        LinkedHashMap<String, Integer> wordsCount = new LinkedHashMap<>();


        for (String line : lines) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                wordsCount.put(word, 0);

            }
        }

        Path pathSearched = Path.of("C:\\Users\\Hardstep\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt");

        List<String> searchedLines = Files.readAllLines(pathSearched);

        for (String line : searchedLines) {
            Arrays.stream(line.split("\\s+")).forEach(
                    word -> {
                        if (wordsCount.containsKey(word)) {
                            wordsCount.put(word, wordsCount.get(word) + 1);
                        }
                    }
            );

        }
        PrintWriter writer = new PrintWriter("results.txt");
        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
            writer.println(entry.getKey() + " - " + entry.getValue());
        }
        writer.close();
    }

}





