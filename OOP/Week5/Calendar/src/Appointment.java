import java.time.*;

public class Appointment {
    private LocalDateTime dateTime;
    private String title;

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public LocalDate getDate() {
        return dateTime.toLocalDate();
    }
    public LocalTime getTime() {
        return dateTime.toLocalTime();
    }

    public String getTitle() {
        return title;
    }

    public boolean occursOn() {
        return false;
    }
}
