package src.practice;

import java.util.Scanner;

public class Post implements MailSender {
    @Override
    public String createMail(String mail) {
        System.out.println("Enter the mail content for the post:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    @Override
    public void sendMail(String mail) {
        System.out.println("Enter the recipient's address for the post:");
        Scanner scanner = new Scanner(System.in);
        String recipient = scanner.nextLine();
        System.out.println("Sending post to " + recipient + ": " + mail);
    }
}
