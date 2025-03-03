
// Types of Modifiers (public, protected, private, default)
// package Bank;
class Account{
    public String name;
    protected String email;
    private String password;

    // to access the private methods or attributes getters and setters are used
    // getters
    public String getpassword()
    {
        return this.password;
    }
    // setters
    public void setpassword(String pass)
    {
        this.password = pass;
    }
}
public class Bank {
    public static void main(String[] args)
    {
        Account acc1 = new Account();
        acc1.name = "Zubair";
        acc1.email = "kaici@gmail.com";
        acc1.setpassword("abcd");
        System.out.println(acc1.getpassword());
    }
}
