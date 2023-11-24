package Client;

import Abstract.Mobiles;

import Abstract.SmartPh;
import Abstract.Tabs;


public class MobileUserClient {
    public static void main(String[]args) {
        String userChoice = "Iphone";
        System.out.println("Selected Mobile: " + userChoice);
        Mobiles mobileInstance = new Tabs();
        Mobiles mobiles=new SmartPh();
        mobileInstance.MobileColor("Red");
        mobileInstance.MobileSim("Jio");
        System.out.println("Hardware: " + mobileInstance.gethardware());
        System.out.println("Camera: " + mobileInstance.getcamera());
        System.out.println("Display Screen: " + mobileInstance.getdisplayscreen());
        System.out.println("Software: " + mobileInstance.getSoftware());
    }
}