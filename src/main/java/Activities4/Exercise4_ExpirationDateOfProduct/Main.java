package Activities4.Exercise4_ExpirationDateOfProduct;

import Activities4.Exercise4_ExpirationDateOfProduct.model.Product;
import Activities4.Exercise4_ExpirationDateOfProduct.model.ExpirationDate;

/**
 3. Mamy dwa produkty. Data ważności pierwszego to 12/07/2017, drugiego to 21/08/2017. Sprawdź, czy któryś z nich jest przeterminowany. Użyj metod isAfter
 */
public class Main {

    public static void main(String[] args) {

       Product jogurt1 = new Product("Jogobella", "02/05/2017");
       Product jogurt2 = new Product("Danone", "02/09/2018");

        ExpirationDate sprawdzaczWaznosci = new ExpirationDate();
        sprawdzaczWaznosci.czyPrzeterminowany(jogurt1);
        sprawdzaczWaznosci.czyPrzeterminowany(jogurt2);





    }

}
