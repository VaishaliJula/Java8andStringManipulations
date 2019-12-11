package DecoratorPatternDemo;

public class EmailNotifyDecorator extends NotifyDecorator {

    public EmailNotifyDecorator(Channel c){

        super(c);

    }

    @Override public void handle() {
        c.handle();
        sendEmailNotification(c);

    }

    private void sendEmailNotification(Channel c){
        System.out.println("Notification sent");
    }
}
