package FactoryPatternDemo;

public class ChannelFactory {

    public Channel getChannel(String channelType){
        if(channelType == null){
            return null;
        }
        if(channelType.equalsIgnoreCase("D2C")){
            return new D2C();
        }
        if(channelType.equalsIgnoreCase("Retail")){
            return new Retail();
        }

        return null;
    }
}
