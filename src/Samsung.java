public class Samsung extends Phone {

    public Samsung() {
        super(new PayNFC(), new PhotoWithCamera(), new WirelessCharging());
    }

    @Override
    public void display() {
        System.out.println("I am Samsung");
    }
}
