import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AdvStreamsFilesAndDirExtractIntegers {

    public static void main(String[] args) throws FileNotFoundException {

        String path = "C:\\Users\\Hardstep\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";


        Scanner scanner = new Scanner(new FileInputStream(path));

        PrintWriter writer = new PrintWriter("integers-out.txt");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                writer.println(number);
            }
            scanner.next();
        }
        writer.flush();
        writer.close();
    }
}
