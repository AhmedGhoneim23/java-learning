import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        // How to work with DATES & TIMES using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        // for UTC time
        Instant instant = Instant.now();
        System.out.println(instant);

        // custom format
        LocalDateTime dateTime1 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
        String newDateTime = dateTime1.format(formatter);
        System.out.println(newDateTime);



        LocalDate date2 = LocalDate.of(2024, 7, 11);
        LocalDate date3 = LocalDate.of(2025, 1, 23);
        if (date2.isBefore(date3)){
            System.out.println(date2 + " is earlier than " + date3);
        }
        else if (date2.isAfter(date3)){
            System.out.println(date2 + " is later than " + date3);
        }
        else if (date2.isEqual(date3)) {
            System.out.println(date2 + " is equal to " + date3);
        }


    }

}
