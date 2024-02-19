package src.annotations;

@SuppressWarnings("all")
public class Main {

    public static void main(String[] args) {
	// write your code here
        Myclass myclass =new Myclass();
//        myclass.finalize();
        myclass.test();
    }


}

class Myclass {

    @Deprecated(since = "17",forRemoval = true)
    public void test() {
        System.out.println("Test called");
 //      finalize();
    }
}
