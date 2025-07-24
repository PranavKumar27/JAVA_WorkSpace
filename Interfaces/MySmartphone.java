// package Interfaces;

class Phone
{
    void dial() { System.out.println("Phone Number Dialed"); }
    void sms() { System.out.println("SMS Sent from Phone"); }
}

interface ICamera // I stands here for Interface
{
    void clickPhoto();
    void recordVideo();
}

interface IMusic
{
    void playMusic();
    void recordMusic();
}

class SmartPhone extends Phone implements ICamera,IMusic 
{
    // New Method
    void videoCall() { System.out.println(" SmartPhone Video Call On-Going"); }
    void newNetwork() { System.out.println(" SmartPhone Getting Ultra Fast 5G Mobile Data"); }

    //  abstract method of Interface ICamera
    public void clickPhoto(){ System.out.println(" SmartPhone Photo Clicked"); }
    public void recordVideo() { System.out.println(" SmartPhone Video Recorded"); } 

    //  abstract method of Interface IMusic
    public void playMusic() { System.out.println(" SmartPhone Music is being Played"); }
    public void recordMusic() { System.out.println(" SmartPhone Music has been Recorded"); }
}

public class MySmartphone {
    public static void main(String[] args) 
    {
        SmartPhone S = new SmartPhone();
        
        S.dial();
        S.sms();
        S.clickPhoto();
        S.recordVideo();
        S.playMusic();
        S.recordMusic();
        S.newNetwork();
        S.videoCall();
        
        System.out.println("ICamera Interface Can Only Call Camera Method Even though Icamera Ic = new Smartphone  ICamera Reference can hold SmartPhone Obj");

        ICamera Ic = S;
        Ic.clickPhoto();
        Ic.recordVideo();

        Phone p = S;
        p.dial();
        p.sms();
        
        
    }
}
