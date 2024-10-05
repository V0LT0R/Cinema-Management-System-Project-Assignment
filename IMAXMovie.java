public class IMAXMovie implements Movie {
    private String title;
    private int duration;

    public IMAXMovie(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public String getType() {
        return "IMAX";
    }

    @Override
    public void displayInfo() {
        System.out.println("Movie Type: IMAX\nTitle: " + title + "\nDuration: " + duration + " minutes");
    }
}
