public class RegularMovie implements Movie {
    private String title;
    private int duration;

    public RegularMovie(String title, int duration) {
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
        return "Regular";
    }

    @Override
    public void displayInfo() {
        System.out.println("Movie Type: Regular\nTitle: " + title + "\nDuration: " + duration + " minutes");
    }
}



