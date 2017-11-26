package Activities2.Exercise11_StringBuilderReplaceName;

import java.util.Scanner;

/**
 11. (Poziom 1) Wczytaj imię od użytkownika, następnie wyświetl napis, np. "Cześć Gienek! Jak się masz?". Użyj StringBuildera i metody append().
 */
public class Main {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj swoje imie: ");

        String name = skaner.nextLine();

        StringBuilder sentence = new StringBuilder();
        System.out.println();

        System.out.println(sentence.append("Czesc " + name + "! Jak się masz?"));
    }
}
