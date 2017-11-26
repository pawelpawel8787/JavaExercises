package Activities1.Exercise8_arrayInputDataWithMinMaxValue;

import java.util.Scanner;

/**
 8. Napisz program, który przechowa w tablicy liczby wpisane przez użytkownika, a kiedy tablica zostanie wypełniona, wypisze je i zakończy działanie.
 */
public class Main {

    public static void main(String[] args) {

        int sum=0;


        Scanner skaner = new Scanner(System.in);
        Integer[] array = new Integer[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Podaj liczbe " +(i+1) +": ");
            array[i] = skaner.nextInt();
            sum+=array[i];

        }
        System.out.println("Suma " + sum);
        int min = array[0];
        int max = array[0];
        for (Integer writeArray:array
                ) {
            System.out.println(writeArray);
            if (min>writeArray) min = writeArray;
            if (max<writeArray) max = writeArray;
        }
        System.out.println("Wartość najmniejsza: " + min);
        System.out.println("Wartość największa: "+ max);

    }
}

