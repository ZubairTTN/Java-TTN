import java.io.FileWriter;

public class AppendInFile {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("Sonu.txt", true);
            file.write("This append text will not replace the pre existing text");
            file.close();
            System.out.println("Success append");
            
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
