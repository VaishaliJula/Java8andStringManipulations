package FactoryPatternDemo;

public class FactoryMain {

    public static void main(String[] args) {

        ChannelFactory channelFactory = new ChannelFactory();
        Channel channelD2C = channelFactory.getChannel("D2C");
        channelD2C.channel();

        Channel channelRetail = channelFactory.getChannel("Retail");
        channelRetail.channel();
    }
}
