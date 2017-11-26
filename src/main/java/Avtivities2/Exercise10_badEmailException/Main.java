package Avtivities2.Exercise10_badEmailException;


import Avtivities2.Exercise10_badEmailException.model.BadEmailException;
import Avtivities2.Exercise10_badEmailException.model.User;


public class Main {

    public static void main(String[] args) {

        User email1 = new User("poczta@wp.pl");

        try {
            email1.setEmail();
        }catch (BadEmailException e){
            System.out.println(e.getMessage());
        }

    }
}
