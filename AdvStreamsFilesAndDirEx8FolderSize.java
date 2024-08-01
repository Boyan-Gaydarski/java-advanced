import java.io.File;

public class AdvStreamsFilesAndDirEx8FolderSize {
    public static void main(String[] args) {

        String path = "C:\\Users\\Hardstep\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";

        File folder = new File(path);
        long size = 0;

        for (File file : folder.listFiles()) {
            size += file.length();

        }
        System.out.println("Folder size: " + size);
    }
}
