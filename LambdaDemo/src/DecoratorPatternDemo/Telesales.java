package DecoratorPatternDemo;

public class Telesales implements Channel {

    @Override public void handle() {
        System.out.println("Telesales");
    }
}
