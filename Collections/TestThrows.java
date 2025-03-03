import java.io.IOException;

public class TestThrows {
    static void divide(int a, int b) throws ArithmeticException{
        if(b == 0)
        {
            throw new ArithmeticException("Cannot divide by zero");
        }
        System.out.println("result: " + (a/b));
    }
    public static void main(String[] args) {
        try{
            divide(10,0);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
