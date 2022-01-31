import java.io.*;

public class FileConfig {

    private static void newFile(String fileName) throws FileNotFoundException {
        OutputStream file = new FileOutputStream(fileName + ".txt");
        OutputStreamWriter fileW = new OutputStreamWriter(file);
        BufferedWriter fileB = new BufferedWriter(fileW);
    }

    public static String createFile(String fileName) throws FileNotFoundException{
        newFile(fileName);
        return String.format("%s%s",fileName,".txt");
    }

    public static BufferedReader readingFile(String fileName)throws FileNotFoundException{
        FileInputStream file = new FileInputStream(fileName);
        InputStreamReader  reading = new InputStreamReader(file);
        return new BufferedReader(reading);
    }
}
