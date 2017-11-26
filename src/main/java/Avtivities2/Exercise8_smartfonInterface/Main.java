package Avtivities2.Exercise8_smartfonInterface;

import Avtivities2.Exercise8_smartfonInterface.model.Computer;
import Avtivities2.Exercise8_smartfonInterface.model.Smartfon;

/**
 3. Zaprojektuj interfejsy Telefon z metodami ringTo(String numer), sendSMS(String numer) oraz Computer z metodami
 calculator(int liczba1, int liczba2), przeglądarka(String adres). Utwórz klasę Smartfon implementującą oba interfejsy.
 */
public class Main {

    public static void main(String[] args) {

        Smartfon lg = new Smartfon("LG", "K500");
        lg.ringTo("505879798");
        lg.browser("www.wp.pl");
        lg.sendSMS("645639852");

        Computer ibm = new Smartfon("Intel", "i7");
        ibm.calculator(7,5);
        ibm.browser("www.google.com");




    }
}
