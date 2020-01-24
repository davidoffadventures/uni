public class Main {

    public static void main(String[] args)
    {
        TV tv1 = new TV();
        tv1.setpower();
        tv1.channelup();
        tv1.setChannel(1);
        System.out.println(tv1.getChannel());
        System.out.println(tv1.getSerialNum());


        TV tv2= new TV();
        System.out.println(tv2.getSerialNum());

    }
}