package Abstract;

import model.Camera;
import model.DisplayScreen;
import model.Hardware;
import model.Software;

import javax.swing.plaf.synth.ColorType;

public abstract class Mobiles {
    public abstract void MobileColor();
    public abstract  void  MobileSim();
    int camera;
    int displayScreen;
    int hardware;
    int Software;


    public final void getMobiles() {
        getSoftware();
        gethardware();
        getcamera();
        getdisplayscreen();
        MobileSim();
        MobileColor();
        System.out.println("Mobile Delivered Successfully");

    }
    public model.Software getSoftware() {
        return new Software(20,"IntelCore");
    }

    public Hardware gethardware(){
        return new Hardware(4,256);

    }
    public Camera getcamera(){
        return new Camera(40,350,12.55);
    }
    public DisplayScreen getdisplayscreen(){
        return new DisplayScreen( 75.7 , 150.9,"LCD Multi-Touch");
    }



}