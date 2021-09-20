public class Nokia extends Phone {

    public Nokia() {
        super(new PayNoWay(), new PhotoNoWay(), new WirelessChargingNoWay());
    }

    @Override
    public void display() {
        System.out.println("I am Nokia");
    }
}