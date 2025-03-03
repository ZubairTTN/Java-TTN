class BankAccount{
    private long accountNumber;
    private double balance;

    public void deposit(double amount)
    {
        System.out.println("Balance amount is: " + (balance += amount));
    }

    public void withdraw(double amount)
    {
        System.out.println("balance amount is: " + (balance -= amount));
    }

    // getter 
    public long getAccNum()
    {
        return this.accountNumber;
    }

    public double getBalance()
    {
        return this.balance;
    }

    // setters
    public void setBalance(double amount)
    {
        this.balance = amount;
    }
    public void setAccNum(long accNum)
    {
        this.accountNumber = accNum;
    }
}

public class P1 {
    public static int sum(int ...a)
        {
            int sum = 0;
            for(int i : a)
            {
                sum += i;
            }
            return sum;
        }

        public static boolean isPrime(int x)
        {
            int res = 0;
            for(int i = 1; i<x/2; i++)
            {
                if(x % i== 0)
                {
                    res++;
                }
            }

            return res == 1;
        }

        // Recursion
        public static int fact(int n)
        {
            if(n == 0)
            {
                return 1;
            }

            return n * fact(n-1);
        }
    public static void main(String[] args) {
        

        System.out.println(sum(1, 4, 5, 6));

        System.out.println(isPrime(13));
        System.out.println(isPrime(65));
        System.out.println(fact(5));

        BankAccount b1 = new BankAccount();
        b1.setAccNum(1234567788);
        b1.setBalance(6000);

        System.out.println(b1.getAccNum());
        System.out.println(b1.getBalance());

        b1.deposit(2300);
        System.out.println(b1.getBalance());

        b1.withdraw(1000);
        System.out.println(b1.getBalance());
    }
}
