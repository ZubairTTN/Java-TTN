package MultiThreading2.MT2;

/* here we are understanding when to use extend and when to use implement  */
class A{
    /*some methods and attributes */
}
class B extends A implements Runnable{
    /*some methods and attributes */
    @Override
    public void run()
    {
        /* here class B is extending class A and if we want to create the class B Thread then we cannot "extend Thread" as multiple inheritance is not supported in java so in this case we implement Runnable and not extend Thread   
         * 
         * class B extends A implements Runnable
        */
    }
}
public class ImplReason {

}
