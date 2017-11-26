package Activities4.Exercise4_ExpirationDateOfProduct.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by HP on 2017-08-03.
 */
public class ExpirationDate {

    public void czyPrzeterminowany(Product product) {

        LocalDate today = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String nameOfProductToCheck = product.getExpiratioDate();
        LocalDate checkedDateOfProduct = LocalDate.parse(nameOfProductToCheck, dateFormatter);

        if (today.isAfter(checkedDateOfProduct)) {
            System.out.println("Product jest przeterminowany");
        } else
            System.out.println("Mozesz jesc");
    }
}