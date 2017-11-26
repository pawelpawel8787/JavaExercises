package Avtivities2.Exercise7_amfibiaInterface.main;


import Avtivities2.Exercise7_amfibiaInterface.model.Amfibia;

public class Main {

    public static void main(String[] args) {

        Amfibia amfibia1 = new Amfibia("Audi", "blue", 4);
        System.out.println("Pojazd marki " + amfibia1.getModel() + " koloru " + amfibia1.getColor() + " posiada " + amfibia1.getNumberOfSeats() + " miejsca.");
        amfibia1.drive(200);
        amfibia1.swim(70);

        Amfibia amfibia2 = new Amfibia("Ferrari", "pink", 2);
        System.out.println("Pojazd marki " + amfibia2.getModel() + " koloru " + amfibia2.getColor() + " posiada " + amfibia2.getNumberOfSeats() + " miejsca.");
        amfibia2.drive(300);
        amfibia2.swim(120);
    }

}
