public class ThreeDMovie implements Movie {
    private String title;
    private int duration;

    public ThreeDMovie(String title, int duration) {
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
        return "3D";
    }

    @Override
    public void displayInfo() {
        System.out.println("Movie Type: 3D\nTitle: " + title + "\nDuration: " + duration + " minutes");
    }
}