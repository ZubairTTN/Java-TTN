
import java.util.*;
public class Variables {
    int instanceVar = 10;
    static int staticVar = 20;
    public void methodExample()
    {
        int localVar = 30;
        System.out.println("Instancevar " + instanceVar);
        System.out.println("staticvar " + staticVar);
        System.out.println("localVar "+ localVar);
        System.out.println();
    }

    public static void main(String[] args)
    {
        Variables obj1 = new Variables();
        obj1.methodExample();

        obj1.instanceVar = 100;
        Variables.staticVar = 200;
        obj1.methodExample();

        Variables obj2 = new Variables();
        obj2.methodExample();
    }
}
