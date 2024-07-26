import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class AdvStreamsFilesAndDirNestedFolders {
    public static void main(String[] args) throws IOException {

        File file = new File(
                "C:\\Users\\Hardstep\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");


        Deque<File> queue = new ArrayDeque<>();

        queue.add(file);

        int count = 1;

        while (!queue.isEmpty()) {
            File f = queue.poll();
            count++;
            System.out.println(f.getName());

            File[] files = f.listFiles();

            for (File innerFile : files) {
                if (innerFile.isDirectory()) {
                    queue.offer(innerFile);
                }
            }
        }
        System.out.println(count + " folders");
    }
}
