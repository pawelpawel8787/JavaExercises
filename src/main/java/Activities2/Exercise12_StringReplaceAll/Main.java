package Activities2.Exercise12_StringReplaceAll;

/**
 12. (Poziom 2) Zmień napis: "    stado owiec jeździ rowerem   " na "STADO KRÓW JEŹDZI"
 */
public class Main {

    public static void main(String[] args) {

        String sentence = "    stado owiec jeździ rowerem   ";

        String newSentence = sentence.replaceAll(sentence,"STADO KRÓW JEŹDZI");
        System.out.println(newSentence);


    }
}
