import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) {
        try {
            File file = new File("Sonu.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("error while reading file");
        }
    }
}
