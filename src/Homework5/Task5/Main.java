package src.Homework5.Task5;

public class Main {
    public static void main(String[] args) {
        Violin violin = new Violin("Stradivarius");
        Trombone trombone = new Trombone("Bass Trombone");
        Ukulele ukulele = new Ukulele("Soprano Ukulele");
        Cello cello = new Cello("Baroque Cello");

        violin.show();
        violin.sound();
        violin.desc();
        violin.history();

        trombone.show();
        trombone.sound();
        trombone.desc();
        trombone.history();

        ukulele.show();
        ukulele.sound();
        ukulele.desc();
        ukulele.history();

        cello.show();
        cello.sound();
        cello.desc();
        cello.history();
    }
}
