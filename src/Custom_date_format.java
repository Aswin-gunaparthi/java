import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Custom_date_format {

    public String getFormattedDate() {

        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");

        return dateTime.format(formatter);
    }
}
