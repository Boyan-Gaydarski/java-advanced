import java.io.FileInputStream;
import java.io.IOException;

public class AdvStreamsFilesAndDirReadFile {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Hardstep\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        int nextByte = inputStream.read();

        while (nextByte != -1) {
            System.out.print(Character.toChars(nextByte));
            nextByte = inputStream.read();
        }
    }
}
