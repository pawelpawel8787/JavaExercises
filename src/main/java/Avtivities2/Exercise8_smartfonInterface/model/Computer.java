package Avtivities2.Exercise8_smartfonInterface.model;

/**
 3. Zaprojektuj interfejsy Telefon z metodami ringTo(String numer), sendSMS(String numer) oraz
 Computer z metodami calculator(int liczba1, int liczba2), przeglądarka(String adres).
 Utwórz klasę Smartfon implementującą oba interfejsy.
 */
public interface Computer {

    default int calculator(int number1, int number2)
    {
        return number1+number2;
    }
    public void browser(String adress);
}
