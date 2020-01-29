public class Main {

    public static void main(String[] args)
    {
        TV tv1 = new TV();
        tv1.setpower();
        tv1.channelup();
        tv1.setChannel(1);
        tv1.volumeUP();
        System.out.println(tv1.getChannel());
        System.out.println(tv1.getSerialNum());
        System.out.println(tv1.getVolume());
        System.out.println(tv1);


        //TV tv2= new TV();
       // System.out.println(tv2.getSerialNum());

    }
}