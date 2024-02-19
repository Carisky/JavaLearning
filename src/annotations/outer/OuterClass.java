package src.annotations.outer;

public class OuterClass {

    private String name;

    public OuterClass(String name) {
        this.name = name;

//        StaticNestedClass staticNestedClass = new StaticNestedClass(888);
//        InnerClass innerClass = new InnerClass(777);
    }

    public String getName() {
        return name;
    }

    static class StaticNestedClass{
        // статический вложенный класс
        private int value;
        public static int valueStatic = 100;

        public StaticNestedClass(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
//            System.out.println(name);
        }
    }

    public class InnerClass {
        // вложенный внутренний класс
        private int value;

        public InnerClass(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void calc(int a, int b) {
            System.out.println(a + b);
  //          System.out.println(name);
        }

    }

    public void doTest() {
        //внутренний класс в локальном методе
        class RealTest implements TestInt {

            private double score;

            public void doSome() {
                //…
                System.out.println("from local inner class" + name);
            }

            public void calc(int a, int b) {
                System.out.println(a + b);
            }
        }

        RealTest realTest = new RealTest();
        realTest.calc(34,45);
        realTest.doSome();
        double score1 = realTest.score;

        //анонимный класс
        TestInt anonim = new TestInt() {
            @Override
            public void doSome() {
                //…
                System.out.println("from local anonim class" + name);
            }
        };

        anonim.doSome();

        TestInt anonim2 = () -> {System.out.println("from local anonim class" + name); };

    }
}
