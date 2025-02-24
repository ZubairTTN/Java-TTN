public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
        int temp, sum = 0, digit ;
        temp = n;
        while(n >0)
        {
            digit = n%10;
            n = n/10;
            sum = sum + digit*digit*digit;
        }

        if(sum == temp)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}
