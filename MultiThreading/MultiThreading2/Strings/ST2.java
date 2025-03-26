package MultiThreading2.Strings;

// StringBuilder is not Thread safe as it is immutable 
// String is Thread safe 
// StringBuffer is Thread safe 
public class ST2 {
    public static void main(String[] args) {
        String s1 = "Zubair";
        StringBuilder sb = new StringBuilder("Hello Zubair");
        /* using StringBuilder we can perform actions/ changes on the string using methods  */
        System.out.println(sb);
        sb.append(" !!!!!! ").append(" @@@@@@@ ").reverse(); //we can perform chaining with the methods
        System.out.println(sb);
        System.out.println(sb.charAt(2));

        // here sb is mutable and if we want to create a immutable string of sb we can do:
        String st = sb.toString(); // now here st is immutable string 
        
    }
}
