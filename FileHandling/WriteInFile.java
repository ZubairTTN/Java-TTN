import java.io.FileWriter;
import java.util.Scanner;

public class WriteInFile {
    public static void main(String[] args) {
        try {
            FileWriter myFile = new FileWriter("Sonu.txt");
            myFile.write("Hello this is writing into the file for prac");
            myFile.close();
            System.out.println("Success in writing into the file");
        } catch (Exception e) {
            System.out.println("Error while Writing into the file ");
            e.printStackTrace();
        }
    }
}
