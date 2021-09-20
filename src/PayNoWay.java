public class PayNoWay implements PayStrategy{

    @Override
    public void Pay() {
        System.out.println("I cannot pay");
    }
}
