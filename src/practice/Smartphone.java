package src.practice;
import java.util.Scanner;

public class Smartphone extends Mobile implements Caller, EmailSender {
    private String os;

    public Smartphone() {
        this.os = "Android 12.7";
    }

    public void runApp() {
        System.out.println("App is run on " + this.os);
    }

    @Override
    public String editMail(String mail) {
        System.out.println("Enter the edited mail content:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String createMail(String mail) {
        System.out.println("Enter the mail content:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void sendMail(String mail) {
        System.out.println("Enter the recipient's email address:");
        Scanner scanner = new Scanner(System.in);
        String recipient = scanner.nextLine();
        System.out.println("Sending mail to " + recipient + ": " + mail);
    }

    public void call() {
        System.out.println("Call from Smart Phone");
    }
}
