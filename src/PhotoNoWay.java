public class PhotoNoWay implements PhotoStrategy{

    @Override
    public void photo() {
        System.out.println("I cannot take a photo");
    }
}
