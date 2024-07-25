import java.io.IOException;

public class FileManagerMain {
    public static void main(String[] args) throws IOException {
        FileCreator create = new FileCreator();
        try {
            create.createFile("test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}