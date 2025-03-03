//  we cannot make objects of interface classes
// with interface class we use implements instead od extends for inheritance 
interface Cycle{
    int a = 67; //properties in the interface are final they cannot be changed by any object 
    void applyBrake(int dec); //interface methods are public by default we can skip writting public if we want it will automatically take it as public
    void speedUp(int inc);
}
 
interface CycleTyres{
    void ceat();
    void mrf();
}
// all the methods inherited from the interface class must be set public in the inherited class 
class Avon implements Cycle, CycleTyres{
    int a = 9;
    public void applyBrake(int dec)
    {
        System.out.println("Applying breaks");
    }

    public void speedUp(int inc)
    {
        System.out.println("Applying SpeedUp");
    }

    public void mrf()
    {
        System.out.println("mrf tyres included");
    }
    public void ceat()
    {
        System.out.println("Ceat tyres included");
    }

}
public class InterfaceClass {
    public static void main(String[] args) {
         Avon av1 = new Avon();
         av1.applyBrake(5);
         av1.speedUp(7); 
        //  we can create a properties in the interface 
         System.out.println(av1.a);

        //  we cannot modify the properties in the interfaces but properties can be override in the derived classes 

        av1.mrf();
        av1.ceat();

    }
}
