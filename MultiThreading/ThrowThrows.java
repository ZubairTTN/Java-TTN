public class ThrowThrows {
    static void divide(int a, int b) throws ArithmeticException{

    
    
        if(b==0){
            throw new ArithmeticException("Cannot divide by Zero");
        }
        System.out.println("Result: " + (a/b));
    
}
    public static void main(String[] args) {
        try{
            divide(10, 0);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
