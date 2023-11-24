package Abstract;

import model.Camera;
import model.DisplayScreen;
import model.Hardware;
import model.Software;

import java.awt.*;

public class SmartPh extends Mobiles{

    private Camera camera;
    private DisplayScreen displayScreen;
    private Hardware hardware;

    private model.Software software;

    public SmartPh(Camera camera, DisplayScreen displayScreen, Hardware hardware, Software software) {

        this.camera = camera;
        this.displayScreen = displayScreen;
        this.hardware = hardware;
        this.software = software;
    }
    public SmartPh(){

    }
    @Override
    public void MobileColor() {
        System.out.println("Color: Blue");
    }

    @Override
    public void MobileSim() {
        System.out.println("Sim: Jio");
    }


}