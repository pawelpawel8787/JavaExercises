package Activities1.Exercise6_catchCorrectNumber;

import java.util.Scanner;

/**
 * 6. Napisz program, który będzie sprawdzał, czy liczba wpisana przez użytkownika jest równa pewnej zdefiniowanej liczbie od 1 do 10.
 * Jeśli użytkownik trafi, program wyświetli odpowiedni komunikato i zakończy działanie.
 */
public class Main {

    public static void main(String[] args) {


        Scanner skaner = new Scanner(System.in);
        int number;
        int correctNumber = 10;

        do {

            System.out.println("Podaj liczbe");
            number = skaner.nextInt();


        } while (number != correctNumber);
        System.out.println("Gratulacje!");

    }
}
