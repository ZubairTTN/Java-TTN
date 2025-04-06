import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriter {
    public static void main(String[] args) {
        try {
            BufferedWriter file = new BufferedWriter(new FileWriter("Sonu.txt"));
            file.write("This is written using BufferedWriter");
            file.newLine();
            file.write("This is another line using BufferedWriter");
            file.close();
            System.out.println("Success Write");
        } catch (Exception e) {
            System.out.println("Error while writing in the file");
        }
    }
}
