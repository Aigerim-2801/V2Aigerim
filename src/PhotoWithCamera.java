public class PhotoWithCamera implements PhotoStrategy {

    @Override
    public void photo() {
        System.out.println("I can take a photo with camera");
    }
}
