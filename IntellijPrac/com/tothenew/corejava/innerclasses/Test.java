package com.tothenew.corejava.innerclasses;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Tesla");

        Car.Engine engine = car.new Engine();
        // here we are creating an Engine instance using the instance of the Car
        engine.start();
        engine.stop();

        Computer computer = new Computer("Acer", "Nitro", "Windows");

        Computer.OperatingSystem os = computer.new OperatingSystem("Linux");

        computer.getOs().displayInfo();
        // here computer.getOs() calls the getter method to access the private os instance and the getter method will return the os instance and then we call displayInfo() method on the return os instance;

        // here we are accessing the USB class without creating the Computer object 
        Computer.USB usb = new Computer.USB("Type C");

        // *************************************************************************************************************************************

        ShoppingCart shopCart = new ShoppingCart(2000); 
        // CreditCard rupay = new CreditCard(78645632);

        // here instead of passing the implemented class object of the interface class we are directly using the Override pay method from Payment class using anonymous inner class 
        shopCart.processPayment(new Payment() {
            @Override
            public void pay(double amount)
            {
                System.out.println("Paid " + amount + " Using Credit Card");
            }
            
        });

    }

}
