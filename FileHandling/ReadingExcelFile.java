import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class ReadingExcelFile {
    public static void main(String[] args) {
        // for reading data from excel file we use apache poi library dependency in our maven 
        String filePath = "data.csv";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while((line = br.readLine()) != null)
            {
                String values[] = line.split(",");
                for(String value : values)
                {
                    System.out.println(value + " | ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
