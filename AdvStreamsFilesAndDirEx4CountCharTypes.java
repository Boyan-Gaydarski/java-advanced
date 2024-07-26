import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class AdvStreamsFilesAndDirEx4CountCharTypes {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Hardstep\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        int countVowels = 0;
        int countConsonants = 0;
        int countPunctuation = 0;

        String vowels = "aeoiu";
        String punctuation = "?.,!";


        BufferedReader reader = new BufferedReader(new FileReader(path));

        String line = reader.readLine();
        while (line != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                for (char symbol : word.toCharArray()) {
                    String charAsString = String.valueOf(symbol);
                    if (vowels.contains(charAsString)) {
                        countVowels++;
                    } else if (punctuation.contains(charAsString)) {
                        countPunctuation++;
                    } else {
                        countConsonants++;
                    }
                }
            }
            line = reader.readLine();
        }
        reader.close();

        PrintWriter writer = new PrintWriter("count-output.txt");

        writer.println("Vowels: " + countVowels);
        writer.println("Consonants: " + countConsonants);
        writer.println("Punctuation: " + countPunctuation);
        writer.close();
    }
}
