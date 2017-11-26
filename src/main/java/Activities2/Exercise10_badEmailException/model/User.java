package Activities2.Exercise10_badEmailException.model;

/**
 10. (Poziom 2) Utwórz klasę User z polem String email. Dodaj do niej metodę setEmail, która w trakcie działania wyrzuca wyjątek BadEmailException,
 kiedy w podanym napisie nie znajdzie się znak '@'.
 */
public class User {

    private String email;

    public User(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail()throws BadEmailException {
        if (!(getEmail().contains("@"))) {
            throw new BadEmailException("Podany email " + getEmail() + " nie zawiera znaku @");
        }
        else{
            System.out.println("Podany adres email " + getEmail() + " jest prawidłowy");
        }
    }
}
