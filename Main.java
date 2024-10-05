public class Main {
    public static void main(String[] args) {
        CinemaConfig config = CinemaConfig.getInstance();

        config.setCinemaName("Chaplin Cinema");
        config.setNumberOfScreens(10);
        config.setOperatingHours("9:00 AM - 12:00 PM");

        System.out.println(config);

        CinemaConfig anotherConfigReference = CinemaConfig.getInstance();
        System.out.println(anotherConfigReference);
    }
}
