package Activities1.Exercise8_arrayInputDataWithMinMaxValue;

import java.util.Scanner;

/**
 8. Napisz program, który przechowa w tablicy liczby wpisane przez użytkownika, a kiedy tablica zostanie wypełniona, wypisze je i zakończy działanie.
 */
public class Main {

    public static void main(String[] args) {

        int suma=0;


        Scanner skaner = new Scanner(System.in);
        Integer[] tab = new Integer[5];
        for (int i = 0; i < tab.length; i++) {
            System.out.print("Podaj liczbe " +(i+1) +": ");
            tab[i] = skaner.nextInt();
            suma+=tab[i];

        }
        System.out.println("Suma " + suma);
        int min = tab[0];
        int max = tab[0];
        for (Integer tablicaWypisz:tab
                ) {
            System.out.println(tablicaWypisz);
            if (min>tablicaWypisz) min = tablicaWypisz;
            if (max<tablicaWypisz) max = tablicaWypisz;
        }
        System.out.println("Wartość najmniejsza: " + min);
        System.out.println("Wartość największa: "+ max);

    }
}

