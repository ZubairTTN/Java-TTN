// interface Adder{
//     int add(int a, int b);
// }

// public class LambdaExample {
//     public static void main(String[] args) {
//         Adder sum = (a,b) -> a+b;
//         System.out.println(sum.add(5,2));
//     }
// }

 interface Adder{
    int add(int a, int b);
 }
public class LambdaExample{

    public static void main(String[] args) {
        Adder sum = (a,b) -> a+b;
        System.out.println(sum.add(4,6));
    }
}