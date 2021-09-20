public class IPhone extends Phone {

    public IPhone() {
        super(new PayPal(), new PhotoWithCamera(), new WirelessCharging());
    }

    @Override
    public void display() {
        System.out.println("I am IPhone");
    }
}