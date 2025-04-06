import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandle{
    public static void main(String args[]) throws Exception
    {
        // creating a file named Zubair.txt
        File myFile = new File("Zubair.txt");
        try{
            myFile.createNewFile();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        // writing into Zubair.txt using FileWriter
        try{
            FileWriter fileWriter = new FileWriter("Zubair.txt");

            fileWriter.write("Writing into Zubair.txt file\n Okay so this is the second append");
            fileWriter.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }


        // Reading a file 
        File myFile2 = new File("Zubair.txt");
        try{
            Scanner sc = new Scanner(myFile2);
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

        //deleting a file 
        File myFileDel = new File("Del.txt"); //first creating a file to delete 
        try{
            myFileDel.createNewFile();
        }catch(IOException e)
        {
            System.out.println(e);
        }

        try {
            if(myFileDel.delete())
            {
                System.out.println(myFileDel.getName()+ " File deleted");
            }
        } catch (Exception e) {
            System.out.println("Error while deleting file"+ myFileDel.getName() );
        }
        
        
    }
}