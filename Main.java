import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        MovieSchedule originalSchedule = new MovieSchedule("Inception", dateFormat.parse("10-10-2024"), "18:00");

        System.out.println("Original Schedule: " + originalSchedule);

        MovieSchedule clonedSchedule1 = originalSchedule.clone();
        clonedSchedule1.setScreeningTime("20:00");
        System.out.println("Cloned Schedule with modified time: " + clonedSchedule1);

        MovieSchedule clonedSchedule2 = originalSchedule.clone();
        clonedSchedule2.setScreeningDate(dateFormat.parse("12-10-2024"));
        System.out.println("Cloned Schedule with modified date: " + clonedSchedule2);

        System.out.println("Original Schedule remains unchanged: " + originalSchedule);
    }
}
