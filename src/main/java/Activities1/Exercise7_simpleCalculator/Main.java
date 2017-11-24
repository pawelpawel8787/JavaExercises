package Activities1.Exercise7_simpleCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 7. Napisz program, który będzie wczytywał od użytkownika znak (np. +, -, *) a następnie 2 liczby. Wyświetli wynik odpowiedniej
 * operacji i znów zapyta o znak i dwie liczby. Jeśli znak równy będzie ‘q’ lub ‘Q’, zakończ program.
 */
public class Main {

    public static void main(String[] args) throws InputMismatchException {

        Scanner skaner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        String exit = "Q";
        String znak = "";
        while (!(znak.equals(exit))) {
            System.out.println("Podaj pierwsza liczbe: ");
            try {
                a = skaner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Wpisałeś złe wyrażenie. Proszę o podanie liczby całkowitej.");
                skaner.nextLine();
            }
            System.out.println("Podaj druga liczbe: ");
            try {
                b = skaner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Wpisałeś złe wyrażenie. Proszę o podanie liczby całkowitej.");
                skaner.nextLine();
            }
            System.out.println("Podaj znak + , - lub *: ");
            try {
                skaner.nextLine();
                znak = skaner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Wpisałeś złe wyrażenie. Proszę o podanie znaku.");
            }

            if (znak.equals("+")) {
                System.out.println(a + b);
            }
            if (znak.equals("-")) {
                System.out.println(a - b);
            }
            if (znak.equals("*")) {
                System.out.println(a * b);
            }
            if (znak.equals(exit)) {
                break;
            }

        }
    }
}
