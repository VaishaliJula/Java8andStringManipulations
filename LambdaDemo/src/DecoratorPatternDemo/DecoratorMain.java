package DecoratorPatternDemo;

public class DecoratorMain {

    public static void main(String[] vaish){

        Channel d2c =  new D2C();
        Channel emailNotificationD2c = new EmailNotifyDecorator(new D2C());
        Channel emailNotificationTelesales = new EmailNotifyDecorator(new Telesales());

        System.out.println("Simple Channel");
        d2c.handle();
        System.out.println("Email Notification to");
        emailNotificationD2c.handle();
        System.out.println("Email Notification to");
        emailNotificationTelesales.handle();

    }
}
