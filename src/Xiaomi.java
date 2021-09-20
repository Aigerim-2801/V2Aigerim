public class Xiaomi extends Phone {

    public Xiaomi() {
        super(new PayNoWay(), new PhotoWithCamera(), new WirelessChargingNoWay());
    }

    @Override
    public void display() {
        System.out.println("I am Xiaomi");
    }

}