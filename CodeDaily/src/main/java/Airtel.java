public class Airtel implements Sim{
    @Override
    public void calling() {
    System.out.println("Calling using airtel sim");
    }

    @Override
    public void data() {
        System.out.println("Browsing internet using airtel sim");

    }
}
