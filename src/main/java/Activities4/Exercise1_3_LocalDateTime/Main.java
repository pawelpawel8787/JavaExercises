package Activities4.Exercise1_3_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        // 1. Sprawdź aktualny czas, wypisz go na ekranie. Użyj klasy LocalTime i DateTimeFormatter

        LocalTime timeNow = LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(timeNow.format(timeFormatter));

        // 2. Sprawdź aktualną datę, wypisz ją na ekranie. Użyj klasy LocalDate i DateTimeFormatter

        LocalDate dateToday = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd//MM//yyyy");
        System.out.println(dateToday.format(dateFormatter));

        //3. Sprawdź aktualną datę i czas, wypisz je na ekranie. Użyj klasy LocalDateTime i DateTimeFormatter

        LocalDateTime dateTimeNow = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd//MM//yyyy -- HH:mm:ss");
        System.out.println(dateTimeNow.format(dateTimeFormatter));

    }

}
