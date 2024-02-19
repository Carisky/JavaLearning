package src.annotations;

import java.security.Provider;

public class Test {

    public static void main(String[] args) {

        Client client =new Client("Ivan");
        Server server = new Server(1234);
        Server server2 = new Server(5678);

        Class<? extends Client> clientClass = client.getClass();

        for (var current : clientClass.getMethods()) {
            About annotation = current.getAnnotation(About.class);
            if (annotation != null) {
                System.out.println(annotation.message() + " | " + annotation.level());
            }
        }

        About clientAnnotation = clientClass.getAnnotation(About.class);
        System.out.println(clientAnnotation.message() + " | " + clientAnnotation.level());

        Class<? extends Server> serverClass = server.getClass();
        About serverAnnotation = serverClass.getAnnotation(About.class);
        System.out.println(serverAnnotation.message() + " | " + serverAnnotation.level());

    }
}
