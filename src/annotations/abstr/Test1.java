package src.annotations.abstr;

public class Test1 {

    public static int valueStatic = 200;

    public static void main(String[] args) {

        int value = 100;

        AbstractClass class1 = new AbstractClass("Ivan") {
            @Override
            public void rename() {
                System.out.println("fdfsfds");
            }

            @Override
            public void send() {
                System.out.println("fdfsfds");
            }

            @Override
            public void printInfo() {
                super.printInfo();
                System.out.println("My info" + value + " | " + valueStatic);

                valueStatic = 2000;
                System.out.println("My info" + value + " | " + valueStatic);

                newMethod();
            }

            private void newMethod() {
                System.out.println("Test");
            }
        };

        class1.printInfo();
        class1.rename();

        MailSender mailSender = new MailSender() {
            @Override
            public String create(String text) {
                return "rerwerew";
            }

            @Override
            public void send() {
                System.out.println("fdfsfds");
            }
        };

        mailSender.create("frewrewr");
        mailSender.send();

        Normal normal = new Normal("Pavel") {
            @Override
            public void printInfo() {
                super.printInfo();
                System.out.println("My info");
                printInfo2();
            }

            public void printInfo2() {
                System.out.println("test test");
            }
        };

        normal.printInfo();
        normal.getName();

    }
}
