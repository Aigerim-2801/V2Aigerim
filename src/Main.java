public class Main {

    public static void main(String[] args) {

        /* IPhone */
        Phone iPhone = new IPhone();
        System.out.println("=====================================");
        iPhone.display();
        iPhone.call();
        iPhone.performPay();
        iPhone.performPhoto();
        iPhone.performWirelessCharge();

        /*Home phone*/
        Phone homePhone = new HomePhone();
        System.out.println("=====================================");
        homePhone.display();
        homePhone.call();
        homePhone.performPay();
        homePhone.performPhoto();
        homePhone.performWirelessCharge();

        /*Nokia*/
        Phone nokia = new Nokia();
        System.out.println("=====================================");
        nokia.display();
        nokia.call();
        nokia.performPay();
        nokia.performPhoto();
        nokia.performWirelessCharge();

        /*Samsung*/
        Phone samsung = new Samsung();
        System.out.println("=====================================");
        samsung.display();
        samsung.call();
        samsung.performPay();
        samsung.performPhoto();
        samsung.performWirelessCharge();

        /*Xiaomi*/
        Phone xiaomi = new Xiaomi();
        System.out.println("=====================================");
        xiaomi.display();
        xiaomi.call();
        xiaomi.performPay();
        xiaomi.performPhoto();
        xiaomi.performWirelessCharge();

        /*Xiaomi*/
        /*Допустим модель данного телефона новая и он имеет возможность безпроводной зарядки*/
        /*Еще изменим оплату через Kaspi Gold*/
        Phone xiaomi2 = new Xiaomi();
        System.out.println("=====================================\n" +
                "Допустим модель данного телефона новая и он имеет возможность безпроводной зарядки\n" +
                "Еще изменим оплату через Kaspi Gold");
        xiaomi2.display();
        xiaomi2.call();
        xiaomi2.setPayStrategy(new PayKaspiGold());
        xiaomi2.performPay();
        xiaomi2.performPhoto();
        xiaomi2.setWirelessChargingStrategy(new WirelessCharging());
        xiaomi2.performWirelessCharge();

        /*Nokia*/
        Phone nokia2 = new Nokia();
        System.out.println("=====================================\n" +
                "Допустим модель данного телефона новая и он имеет возможность фотографировать");
        nokia2.display();
        nokia2.call();
        nokia2.performPay();
        nokia2.setPhotoStrategy(new PhotoWithCamera());
        nokia2.performPhoto();
        nokia2.performWirelessCharge();
    }
}
