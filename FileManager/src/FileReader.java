import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReader {
    FileInputStream fis = new FileInputStream("test.txt");

    public FileReader() throws FileNotFoundException {
    }
}
