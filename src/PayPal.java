public class PayPal implements PayStrategy{
    @Override
    public void Pay() {
        System.out.println("I can pay with PayPal");
    }
}