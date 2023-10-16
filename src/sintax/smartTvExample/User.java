package sintax.smartTvExample;

public class User {

    public static void main(String[] args) {

        SmartTv tv = new SmartTv();

        System.out.println(" \n-------Power-------\n");
        System.out.println("Tv on? " + tv.getIsOn());
        tv.turnOn();
        System.out.println("Tv off? " + tv.getIsOn());
        System.out.println(" \n--------------\n");

        System.out.println(" \n------Channel--------\n");
        System.out.println("Current channel: " + tv.getChannel() + "\n");
        tv.changeChannel(0);
        System.out.println("Current channel: " + tv.getChannel() + "\n");
        tv.changeChannel(16);
        System.out.println("Changing to channel...");
        System.out.println("Current channel: " + tv.getChannel());
        System.out.println(" \n--------------\n");

        System.out.println(" \n------Volume--------\n");
        System.out.println("Volume: " + tv.getVolume());

        tv.decreaseVolume();
        System.out.println("Volume: " + tv.getVolume());

        tv.increaseVolume();
        System.out.println("Volume: " + tv.getVolume());

        tv.increaseVolume();
        System.out.println("Volume: " + tv.getVolume());

        tv.increaseVolume();
        System.out.println("Volume: " + tv.getVolume());
        
        tv.increaseVolume();
        System.out.println("Volume: " + tv.getVolume());

        tv.decreaseVolume();
        System.out.println("Volume: " + tv.getVolume());

    }

}
