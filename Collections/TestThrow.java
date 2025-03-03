public class TestThrow {
    static void validate(int age)
        {
            if(age<18)
            {
                throw new ArithmeticException("Not Eligible to Vote");
            }
            else
            {
                System.out.println("you can vote");
            }
        }
    public static void main(String[] args) {
        validate(16);
    }
}
