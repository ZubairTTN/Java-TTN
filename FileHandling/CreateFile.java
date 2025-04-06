import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File myFile = new File("Sonu.txt");

        try{
            myFile.createNewFile();
            System.out.println("Success in creating Sonu.txt");
        }
        catch(IOException e)
        {
            System.out.println("Error while creating file ");
        }
        
    }
}
