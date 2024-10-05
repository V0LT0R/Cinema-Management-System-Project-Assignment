public class CinemaConfig {

    private static CinemaConfig instance;

    private String cinemaName;
    private int numberOfScreens;
    private String operatingHours;

    private CinemaConfig() {
        cinemaName = "Cinema";
        numberOfScreens = 5;
        operatingHours = "8:00 AM - 10:00 PM";
    }

    public static synchronized CinemaConfig getInstance() {
        if (instance == null) {
            instance = new CinemaConfig();
        }
        return instance;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public int getNumberOfScreens() {
        return numberOfScreens;
    }

    public void setNumberOfScreens(int numberOfScreens) {
        this.numberOfScreens = numberOfScreens;
    }

    public String getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(String operatingHours) {
        this.operatingHours = operatingHours;
    }

    @Override
    public String toString() {
        return "CinemaConfig{" +
                "cinemaName='" + cinemaName + '\'' +
                ", numberOfScreens=" + numberOfScreens +
                ", operatingHours='" + operatingHours + '\'' +
                '}';
    }
}
