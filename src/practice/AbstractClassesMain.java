package src.practice;

public class AbstractClassesMain {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.call();

        System.out.println("-".repeat(40));

        Smartphone smartphone = new Smartphone();
        smartphone.runApp();
        System.out.println("Smartphone Email Example:");
        smartphone.sendMail(smartphone.createMail("Hello, this is a new email."));
        String editedMail = smartphone.editMail("This is the edited content of the email.");
        smartphone.sendMail(editedMail);

        System.out.println("-".repeat(40));

        DialPhone dialPhone = new DialPhone();
        dialPhone.call();
        dialPhone.autoAnswer();

        System.out.println("-".repeat(40));

        Post post = new Post();
        post.sendMail(post.createMail("This is a post."));

        System.out.println("-".repeat(40));

        Multicooker multicooker = new Multicooker();
        multicooker.switchProgram(2);
        multicooker.switchProgram(1);
        multicooker.switchProgram(3);
        multicooker.switchProgram(4);
        multicooker.cook();

        System.out.println("-".repeat(40));

        Oven oven = new Oven();
        oven.initTimer(30);
        oven.cook();


        sendEmailsFromMailSenders(smartphone, post);

        turnOffDevices(mobile, smartphone, dialPhone, multicooker, oven);
    }


    private static void turnOffDevices(AbstractDevice... devices) {
        for (AbstractDevice device : devices) {
            device.powerOff();
        }
        System.out.println("All devices turned off.");
    }

    private static void sendEmailsFromMailSenders(MailSender... mailSenders) {
        for (MailSender mailSender : mailSenders) {
            System.out.println("Email from " + mailSender.getClass().getSimpleName() + ":");
            mailSender.sendMail(mailSender.createMail("This is a broadcast email."));
        }
    }
}
