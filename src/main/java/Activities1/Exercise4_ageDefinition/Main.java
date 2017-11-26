package Activities1.Exercise4_ageDefinition;

import java.util.Scanner;

/**
 * 4. Napisz program, który zapyta ożytkownika o wiek, a następnie wypisze czy jest pełnoletni
 * 4.a Dodaj zabezpieczenie przed wpisaniem liczby mniejszej niż 1 oraz wypisanie specjalnego komunikatu, kiedy użytkownik ma więcej niż 100 lat
 * 4.b Zrealizuj zabezpieczenie za pomocą wyjątku
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ile masz lat?");
        int age = input.nextInt();
        if (age > 18) {
            System.out.println("Jestes pelnoletni!");
        }
        if (age < 1) {
            System.out.println("Nie mozesz miec mniej niz 1 rok");
        }

        if (age > 100) {
            System.out.println("Masz " + age + " lat. Należy Ci się podwójna emerytura z ZUSu.");
        }
    }
}
