import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestaFileConfig {
    public static void main(String[] args) throws FileNotFoundException {
        String file = FileConfig.createFile("Cliente-" + 5);
         BufferedReader readerFile = FileConfig.readingFile("ServerData.txt");
        try {
            System.out.println(readerFile.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
