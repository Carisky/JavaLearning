package src.practice;

public class Mobile extends Phone{

    private String display;
    private int simCount;

    public Mobile(){
        this.display = "6.3 inches oled";
        this.simCount = 2;
    }

    @Override
    void call() {
        System.out.println("Call from Mobile");
    }
    void powerOn() {
        System.out.println("Mobile power on");
    }
    void powerOff() {
        System.out.println("Mobile power off");
    }
}
