package src.practice;

public class Oven extends AbstractMulticooker{
    public void initTimer (int time){
        System.out.println("Timer for Oven seted to "+time);
    }

    @Override
    void cook() {
        System.out.println("Oven is cooking");
    }
}
