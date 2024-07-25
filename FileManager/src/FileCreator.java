import java.io.File;
import java.io.IOException;

public class FileCreator {
    public void createFile(String fileName) throws IOException {
        try {
            File text = new File("C:\\Users\\Marwin Merkl\\IdeaProjects\\FileManagerTest\\src\\" + fileName);
            if (text.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
