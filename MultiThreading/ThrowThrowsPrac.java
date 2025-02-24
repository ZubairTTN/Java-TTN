
public class ThrowThrowsPrac{

    static void withdraw(int amount) throws ArithmeticException{
        if(amount >5000)
        {
            throw new ArithmeticException("Withdrawal limit exceeded");
        }
        else{
            System.out.println("Withdraw successfully");
        }
    }
    public static void main(String[] args) {
        try{
            withdraw(6000);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }

}