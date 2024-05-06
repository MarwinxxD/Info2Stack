import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class b {
    public void studisPhase() {
        LocalDate studisDay = LocalDate.of(2024, 6, 6);
        LocalTime studisTime = LocalTime.of(12, 0);
        LocalDateTime studisStart = studisDay.atTime(studisTime);
        LocalDateTime studisEnd = LocalDateTime.of(2024, 6, 17, 12, 0);
        Duration duration = Duration.between(studisStart, studisEnd);
        System.out.println("Die STUDIS Anmeldephase geht " + duration.getSeconds() / (60 * 60) + " Stunden lang");
    }
}
