public abstract class Phone {

    private PayStrategy payStrategy;
    private PhotoStrategy photoStrategy;
    private WirelessChargingStrategy wirelessChargingStrategy;

    public Phone(PayStrategy payStrategy, PhotoStrategy photoStrategy, WirelessChargingStrategy wirelessChargingStrategy) {
        this.payStrategy = payStrategy;
        this.photoStrategy = photoStrategy;
        this.wirelessChargingStrategy = wirelessChargingStrategy;
    }

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void setPhotoStrategy(PhotoStrategy photoStrategy) {
        this.photoStrategy = photoStrategy;
    }

    public void setWirelessChargingStrategy(WirelessChargingStrategy wirelessChargingStrategy) {
        this.wirelessChargingStrategy = wirelessChargingStrategy;
    }

    public void performPhoto() {
        photoStrategy.photo();
    }

    public void performPay() {
        payStrategy.Pay();
    }

    public void performWirelessCharge() {
        wirelessChargingStrategy.WirelessCharging();
    }

    public abstract void display ();

    public void call() {
        System.out.println("I am calling");
    }

}
