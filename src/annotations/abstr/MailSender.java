package src.annotations.abstr;

public interface MailSender {

    String create(String text);
    void send();
}
