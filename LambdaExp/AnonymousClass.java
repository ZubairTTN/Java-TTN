// Important: Functional interface are those interface class that has only one method 


interface Hello{
    void greet();
    void hi();
}

// class Anonymous implements Hello{
//     @Override
//     public void greet()
//     {
//         System.out.println("Greetings");
//     }

//     @Override
//     public void hi()
//     {
//         System.out.println("Hii");
//     }
//     public void display()
//     {
//         System.out.println("Hello Zubair");
//     }
// }
public class AnonymousClass {
    
    public static void main(String[] args) {
        // Anonymous demo = new Anonymous();
        // demo.greet();

        // Dynamic method dispatch
        // Hello h1 = new Anonymous();


        // this is anonymous class
        Hello h = new Hello()
        {
            @Override
            public void greet()
            {
                System.out.println("Greetings");
            }

            @Override
            public void hi()
            {
                System.out.println("Hiiiii");
            }
        };
        h.greet();
        h.hi();
    }
}
