package Activities3.Exercises3_12_StringMethods;

import java.util.Scanner;

/**
 * Created by HP on 2017-08-02.
 */
public class Main {

    public static void main(String[] args) {

        // pobierz od uzytkownika imie i nazwisko. Upewnij sie ze nie maja bialych znakow na koncu i na poczatku, wyswietl napis "imie i nazwisko"
        // z podstawionymi zmiennymi. Jezeli imie to Jan, zamien je na Janek. Jezeli nazwisko jest dluzsze niz 10 znakow,
        // pozostaw jedynie pierwsze 10 znakow i wielokropek, np. Brzeczyszczykiewicz => Brzeczy.....

        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String imie = skaner.nextLine();
        System.out.println("Podaj nazwisko");
        String nazwisko = skaner.nextLine();

        if (imie.equals("Jan")) {
            System.out.println(imie.replace("Jan", "Janek"));
        }
        if (nazwisko.length() > 10) {

            System.out.println(nazwisko.substring(0, 9));
        } else {
            System.out.println(nazwisko);
        }


//        3. Utwórz String "Ala ma kota" używając StringBuildera i metody append.

        StringBuilder wyrazenie3 = new StringBuilder();
        System.out.println(wyrazenie3.append("Ala ma kota"));

//        4. Znajdź znak na 5 pozycji w napisie "Ala ma kota" (metoda charAt())

        String wyrazenie4 = "Ala ma kota";
        System.out.println(wyrazenie4.charAt(5));

//        5. Sprawdź czy napis "Ala ma kota" zaczyna się od słowa "Ala" (startsWith()) i kończy słowem "kota" (endsWith)

        String wyrazenie5 = "Ala ma kota";
        System.out.println(wyrazenie5.startsWith("Ala"));
        System.out.println(wyrazenie5.endsWith("kota"));


//       6. Sprawdź długość napisu "Litwo! ojczyzno moja!" (length())

        String wyrazenie6 = "Litwo! ojczyzno moja!";
        System.out.println(wyrazenie6.length());

//      7. Sprawdź, na którym miejscu występuje znak d w napisie "abcdefgh"

        String wyrazenie7 = "abcdefgh";
        System.out.println(wyrazenie7.indexOf("d"));

//      8. Wytnij z napisu "Ala ma kota, kot ma mleko" napis od 7 do 12 znaku (substring)

        String wyrazenie8 = "Ala ma kota, kot ma mleko";
        System.out.println(wyrazenie8.substring(7, 12));

//      9. Sprawdź czy napis "Ala ma kota" zawiera napis "ALA" (contains). Nie zwracaj uwagi na wielkość liter (toUpperCase(), toLowerCase())

        String wyrazenie9 = "     Ala ma kota       ";
        boolean czyZawiera = wyrazenie9.trim().toUpperCase().contains("ALA");
        System.out.println(czyZawiera);

//      10. Sprawdź czy napisy "Ala ma kota" i "ALA MA KOTA" są takie same (equals(), equalsIgnoreCase

        String alaMale = "Ala ma kota";
        String alaDuze = "ALA MA KOTA";
        boolean czyTakieSame = (alaMale.toUpperCase().equals(alaDuze));
        System.out.println(czyTakieSame);

//      11. Zamień imię Ala na Tadek w napisie "Ala ma kota" (replace())

        String wyrazenie11 = "Ala ma kota";
        System.out.println(wyrazenie11.replace("Ala", "Tadek"));
    }
}
