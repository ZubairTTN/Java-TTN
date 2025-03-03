interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet()
    {
        System.out.println("Hello this is Zubair Good Morning");
    }
    default void record4k()
    {
        greet();
        System.out.println("Recording in 4K.....");
    }
}

interface wifi{
    String[] getNetworks();
    void connectToNetwork(String network);


}

class Phone{
    void callNumber(int PhoneNo)
    {
        System.out.println("calling " + PhoneNo);
    }

    void pickCall()
    {
        System.out.println("Connecting...");
    }
}

class MySmartPhone extends Phone implements Camera, wifi
{
    public void takeSnap()
    {
        System.out.println("Taking SnapShot");
    }
    public void recordVideo()
    {
        System.out.println("Recording Video");
    }

    public String[] getNetworks()
    {
        System.out.println("Scanning for available networks...");
        String networks[] = {"Network1", "Network2", "Network3"};
        return networks;
    }
    public void connectToNetwork(String Network)
    {
        System.out.println("Connecting to the " + Network);
    }
    // @Override
    // public void record4k()
    // {
    //     System.out.println("Recoding in 4K 60fps");
    // }
}
public class DefaultMethods{
    public static void main(String[] args) {
        MySmartPhone sm = new MySmartPhone();
        sm.callNumber(1234567890);
        sm.pickCall();
        sm.takeSnap();
        sm.recordVideo();
        sm.record4k();
        sm.getNetworks();
        sm.connectToNetwork("AirtelWifi@");
       
    }

}