package Activities4.Exercise4_ExpirationDateOfProduct.model;

/**
 * Created by HP on 2017-08-03.
 */
public class Product {

    private String name;
    private String expiratioDate;

    public Product(String name, String expiratioDate) {
        this.name = name;
        this.expiratioDate = expiratioDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpiratioDate() {
        return expiratioDate;
    }

    public void setExpiratioDate(String expiratioDate) {
        this.expiratioDate = expiratioDate;
    }
}
