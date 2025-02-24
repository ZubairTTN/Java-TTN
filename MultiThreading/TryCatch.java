public class TryCatch {
    public static void main(String[] args) {
        // types of Exceptions:
        // checked Exceptions -> also known as compile time exceptions
        // unchecked Exceptions -> also kanown as Runtime Exceptions
        int a = 60000;
        int b = 0;
        try{
            int c = a/b;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
