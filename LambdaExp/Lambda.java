// here we are creating a interface function
// interface function are those interface class that has only one method
interface lamb{
    public void greet(int a);

}
public class Lambda {
    public static void main(String args[])
    {
        lamb l = (a)->{
            System.out.println(" Hello Zubair " + a*a);
        };
        l.greet(6);
    }
}
