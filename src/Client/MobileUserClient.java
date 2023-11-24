package Client;

import Abstract.Mobiles;

import Abstract.SmartPh;
import Abstract.Tabs;


public class MobileUserClient {
    public static void main(String[]args) {
        String userChoice = "Iphone";
        System.out.println("Selected Mobile: " + userChoice);
        Mobiles mobileInstance = new Tabs();
        mobileInstance.getMobiles();
        System.out.println("Hardware: " + mobileInstance.gethardware());
        System.out.println("Camera: " + mobileInstance.getcamera());
        System.out.println("Display Screen: " + mobileInstance.getdisplayscreen());
        System.out.println("Software: " + mobileInstance.getSoftware());
        System.out.println("*****************************");
        String UserChoice = "Iphone";
        System.out.println("Selected Mobile: " + UserChoice);
        Mobiles smartPh= new SmartPh();
        smartPh.getMobiles();
        System.out.println("Hardware: " + smartPh.gethardware());
        System.out.println("Camera: " + smartPh.getcamera());
        System.out.println("Display Screen: " + smartPh.getdisplayscreen());
        System.out.println("Software: " + smartPh.getSoftware());

    }






}