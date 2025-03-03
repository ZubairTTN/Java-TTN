interface SampleInterface
{
    public void method1();
    public void method2();
}
// derived interface class can only extend base interface class and not implement but a normal class can only implement the interface class 
interface ChildSampleInterface extends SampleInterface{
    public void method3();
    public void method4();
}
class MySampleClass implements ChildSampleInterface{
    @Override
    public void method1()
    {
        System.out.println("Method1");
    }
    @Override
    public void method2()
    {
        System.out.println("Method2");
    }
    @Override
    public void method3()
    {
        System.out.println("Method3");
    }
    @Override
    public void method4()
    {
        System.out.println("Method4");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        MySampleClass 
    }
}
