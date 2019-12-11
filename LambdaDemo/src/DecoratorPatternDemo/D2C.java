package DecoratorPatternDemo;

public class D2C implements Channel {

    @Override public void handle() {
        System.out.println("D2C");
    }
}
