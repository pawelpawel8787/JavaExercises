package Activities2.Exercise13_CharCounterMethod;


public class CharCounter {

    public static void charcounter(String sentence){


        int counter = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i)== 'a'){
                counter++;
            }
        }
        System.out.println("Liczba wystapien litery a: " + counter);

    }
}
