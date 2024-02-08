package src.practice;

public class DialPhone extends Phone implements Caller{
    private boolean hasAnswerphone;
    public DialPhone(){
        this.hasAnswerphone = false;
    }

    public void autoAnswer(){
        System.out.println("DialPhone auto answer");
    }

    @Override
    void powerOn() {
        System.out.println("DialPhone power on");
    }
    void powerOff() {
        System.out.println("DialPhone power off");
    }
    public void call() {
        System.out.println("Call from DialPhone");
    }
}
