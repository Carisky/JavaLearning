package src.practice;

public class Multicooker extends AbstractMulticooker{
    void switchProgram(int id){
        switch (id){
            case 1 : {
                System.out.println("Program switched to fish cooking");
                break;
            }
            case 2 : {
                System.out.println("Program switched to meat cooking");
                break;
            }
            case 3 : {
                System.out.println("Program switched to rise cooking");
                break;
            }
            default:{
                System.out.println("Program "+id+" not found");
            }
        }
    }
    @Override
    void cook() {
        System.out.println("Multicooker is cooking");
    }
}
