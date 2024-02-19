package src.annotations.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Test4 {
    static int x = 100;
    int y = 100;

    public static void main(String[] args) {

        Operationalable oper31 = new Operationalable() {
            @Override
            public int calculate(int a, int b) {
                return a+b;
            }
        };

        Test4 test = new Test4();

        Operationalable oper10 = test::methodSum1;

        Operationalable oper1 = Integer::sum;

        int c = oper1.calculate(10,30);
        System.out.println(c);

        Operationalable oper11 =  (a, b) -> a+b;

        c = oper11.calculate(10,30);
        System.out.println(c);

        Operationalable oper2 = (b, a) -> a-b;
        c = oper2.calculate(10,30);
        System.out.println(c);

        Operationalable oper3 = Integer::sum;
        c = oper3.calculate(45,56);
        System.out.println(c);

        Operationalable oper4 = Test4::methodSum;
        int d = oper4.calculate(43,54);
        System.out.println(d);

       final int x1 = 100;

        Operationalable1 oper5 = (a,b) -> {
            System.out.println(x1);
//            x1 = 1000;
            x = 1000;
            System.out.println(x);
            return a+b+x; };
        int result = oper5.calculate(10,20);
        x = 2000;
        System.out.println(result);

        Test4 testObject = new Test4();
        testObject.testMethod(234,456);

//        Supplier<Integer> supl1 = () -> 100;
        Supplier<Integer> supl1 = () -> {
            Random rand = new Random();
            return rand.nextInt(100);
            };

        System.out.println(supl1.get());

        Function<String,Integer> func1 = (a) -> Integer.valueOf(a);
        Function<String,Integer> func2 = Integer::valueOf;

        System.out.println(func2.apply("123"));

        Function<String, Integer> func11 =  Integer::valueOf;
        BiConsumer<String, Integer> biconsumer = (a,b) -> System.out.println(a + " | " + b);
        Consumer<String> consumer1 = (a) -> System.out.println(a);


        List<Integer> list1 = new ArrayList<>();
        Random rnd = new Random();

        for (int i=0; i<100; i++)
        {
            list1.add(rnd.nextInt(100));
        }

//        list1.sort((a,b) -> a.compareTo(b));
//        list1.sort(Integer::compareTo);
        list1.sort(new MyCompare());

        System.out.println();
        System.out.println("/////////////////////////////////////////////");
        System.out.println();

        for (Integer integer : list1) {
            System.out.println(integer);
        }

        System.out.println();
        System.out.println("/////////////////////////////////////////////");
        System.out.println();

//        list1.forEach((intValue) -> System.out.println(intValue));
        list1.forEach(System.out::println);

    }

    public void testMethod(int aa, int bb) {
        Operationalable oper1 = (a,b) -> {
            y = 1000;
            return a+b+y; };
        int res = oper1.calculate(aa,bb);
        System.out.println(res);
    }

    public static int methodSum(int a, int b) {
        return a+b;
    }

    public int methodSum1(int a, int b) {
        return a+b;
    }

    @FunctionalInterface
    interface Operationalable {
        int calculate(int a, int b);
    }

    @FunctionalInterface
    interface Operationalable1 {
        int calculate(int a, int b);
    }

}

class MyCompare implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return -o1.compareTo(o2);
    }
}
