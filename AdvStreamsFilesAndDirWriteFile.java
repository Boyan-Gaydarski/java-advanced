import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class AdvStreamsFilesAndDirWriteFile {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Hardstep\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        Scanner scanner = new Scanner(inputStream);

        String table = ",.!?";

        FileOutputStream outputStream = new FileOutputStream("output.txt");

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            for (int i = 0; i < line.length(); i++) {
                char symbol = line.charAt(i);
                if (!table.contains(String.valueOf(symbol))) {
                    outputStream.write(symbol);
                }
            }
            outputStream.write('\n');
        }
    }
}
