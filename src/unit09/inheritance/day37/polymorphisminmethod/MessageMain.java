package unit09.inheritance.day37.polymorphisminmethod;

public class MessageMain {
    public static void main(String[] args) {
        Message msg1 = new Message();
        sendMessage(msg1);
        Message msg2 = new TextMessage();
        sendMessage(msg2);
        Message msg3 = new VideoMessage();
        sendMessage(msg3);
        sendMessage(new JSONMessage());
    }
    public static void sendMessage(Message msg){
        System.out.println("Sending a "+msg.getClass().getSimpleName());
    }
}
