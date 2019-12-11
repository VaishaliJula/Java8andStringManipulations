package DecoratorPatternDemo;

public class NotifyDecorator implements Channel {

    protected Channel c;

    public NotifyDecorator(Channel c) {
        this.c = c;
    }

     public void handle() {
        c.handle();
//        System.out.println("Notify User");
    }
}
