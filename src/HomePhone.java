public class HomePhone extends Phone {

    public HomePhone() {
        super(new PayNoWay(), new PhotoNoWay(), new WirelessChargingNoWay());
    }

    @Override
    public void display() {
        System.out.println("I am home phone");
    }
}