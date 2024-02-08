package src.practice;

public abstract class AbstractDevice {
    private String name;
    private String serialNumber;

    public AbstractDevice(){
        powerOn();
    }

    abstract void powerOn();
    abstract void powerOff();

}
