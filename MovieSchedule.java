import java.util.Date;

public class MovieSchedule implements Prototype<MovieSchedule> {
    private String movieTitle;
    private Date screeningDate;
    private String screeningTime;

    public MovieSchedule(String movieTitle, Date screeningDate, String screeningTime) {
        this.movieTitle = movieTitle;
        this.screeningDate = screeningDate;
        this.screeningTime = screeningTime;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public Date getScreeningDate() {
        return screeningDate;
    }

    public void setScreeningDate(Date screeningDate) {
        this.screeningDate = screeningDate;
    }

    public String getScreeningTime() {
        return screeningTime;
    }

    public void setScreeningTime(String screeningTime) {
        this.screeningTime = screeningTime;
    }

    @Override
    public MovieSchedule clone() {
        return new MovieSchedule(this.movieTitle, new Date(this.screeningDate.getTime()), this.screeningTime);
    }

    @Override
    public String toString() {
        return "MovieSchedule [movieTitle=" + movieTitle + ", screeningDate=" + screeningDate + ", screeningTime=" + screeningTime + "]";
    }
}
