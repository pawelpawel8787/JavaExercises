package Activities2.Exercise8_smartfonInterface.model;

/**
 3. Zaprojektuj interfejsy Telefon z metodami ringTo(String numer), sendSMS(String numer) oraz Computer z metodami
 calculator(int liczba1, int liczba2), przeglądarka(String adres). Utwórz klasę Smartfon implementującą oba interfejsy.
 */
public class Smartfon implements Computer, Telefon {

    private String model;
    private String mark;

    public Smartfon(String model, String mark) {
        this.model = model;
        this.mark = mark;
    }

    @Override
    public void ringTo(String number) {
        System.out.println("Dzwoenie pod numer" + number);

    }

    @Override
    public int calculator(int number1, int number2) {

        System.out.println(number1 + number2);
        return number1 + number2;

    }

    @Override
    public void browser(String adres) {
        System.out.println("Przegladam strone " + adres);

    }

    @Override
    public void sendSMS(String number) {

        System.out.println("Wyslalem SMSa pod numer: " +number);

    }
}
