package src.practice;

public abstract class AbstractMulticooker extends AbstractDevice {
    abstract void cook();
    @Override
    void powerOn() {
        System.out.println("Cooker power on");
    }
    void powerOff() {
        System.out.println("Cooker power off");
    }

}
