package sprint3;

// there should be info about method-overloading but nah
public class Polymorphism {
    public static void main(String[] args) {
        MailClient drone = new Drone();
        drone.send("sdf", "asdf", "kjdfkdkf fuck you");
        System.out.println(drone);
    }
}

interface MailClient {
    void send(String from, String to, String text);
    void recieve();
}

class Dove implements MailClient {
    @Override
    public void send(String from, String to, String text) {
        System.out.println("Голубь полетел к " + from + " от " + to + " с письмом: " + text);
    }

    @Override
    public void recieve() {
        System.out.println("Голубь вернулся с ответным письмом!");
    }
}

class Drone implements MailClient {
    @Override
    public void send(String from, String to, String text) {
        System.out.println("Дрон отправился к " + from + " от " + to + " с электронным посланием: " + text);
    }

    @Override
    public void recieve() {
        System.out.println("Дрон принёс ответное сообщение.");
    }
}