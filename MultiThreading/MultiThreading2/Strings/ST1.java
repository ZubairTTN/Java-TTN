package MultiThreading2.Strings;
// Strings are immutable in java and are stored in string pool
public class ST1 {
    public static void conc()
    {
        String result = "";
        for(int i = 0; i< 1000; i++)
        {
            result += "New Text";
            // result will create a new String in each iteration leading to poor memory management 
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1.concat(" Zubair");
        System.out.println(str1);
        System.out.println(str2);
        conc();
        
    }
}
