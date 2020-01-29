public class Main {

    public static void main(String[] args)
    {
        TV tv1 = new TV();
        tv1.setpower();
        tv1.channelup();
        tv1.setChannel(1);
        tv1.volumeUP();
        //tv1.volumeDwn();
        System.out.println("The channel is " + tv1.getChannel());
        
        System.out.println("The volume is " + tv1.getVolume());
        
        System.out.println("This is a load of jibberish" + tv1);

        
        System.out.println(tv1.getSerialNum());
        
        TV tv2 = new TV();
        System.out.println(tv2.getSerialNum());
        
        TV tv3 = new TV();
        System.out.println(tv3.getSerialNum());

    }
}