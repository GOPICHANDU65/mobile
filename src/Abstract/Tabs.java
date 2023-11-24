package Abstract;


import model.Camera;
import model.DisplayScreen;
import model.Hardware;
import model.Software;

public class Tabs extends Mobiles{
    private Camera camera;
    private DisplayScreen displayScreen;
    private Hardware hardware;
    private model.Software software;

    public Tabs(Camera camera, DisplayScreen displayScreen, Hardware hardware, Software software) {
        this.camera = camera;
        this.displayScreen = displayScreen;
        this.hardware = hardware;
        this.software=software;
    }

    public Tabs() {

    }
    @Override
    public void MobileColor() {
        System.out.println("Color: Red");
    }

    @Override
    public void MobileSim() {
        System.out.println("Sim: Idea");

    }


}