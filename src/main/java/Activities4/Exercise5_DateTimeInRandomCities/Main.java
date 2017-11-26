package Activities4.Exercise5_DateTimeInRandomCities;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 5. Wypisz aktualną godzinę strefach czasowych: "America/Los_Angeles", "Asia/Tokyo", "Europe/Paris"
 */
public class Main {

    public static void main(String[] args) {

        LocalTime actualHour = LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        ZonedDateTime timeInLosAngeles = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        ZonedDateTime timeInParis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        ZonedDateTime timeInTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println("Czas w Los ANgeles: " +timeInLosAngeles.format(timeFormatter));
        System.out.println("Czas w Prayzu: " +timeInParis.format(timeFormatter));
        System.out.println("Czas w Tokio: " +timeInTokyo.format(timeFormatter));

    }

}
