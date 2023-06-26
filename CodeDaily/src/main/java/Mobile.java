public class Mobile {
    public static void main(String[] args) {
        Airtel airtel = new Airtel();
        airtel.calling();
        airtel.data();
        System.out.println("######################");
        Vodaphone vodaphone = new Vodaphone();
        vodaphone.calling();
        vodaphone.data();
        System.out.println("######################");

        Sim sim = new Airtel();
        sim.calling();
        sim.data();
        System.out.println("######################");

        Sim sim1 = new Vodaphone();
        sim1.calling();
        sim1.data();
    }
}
