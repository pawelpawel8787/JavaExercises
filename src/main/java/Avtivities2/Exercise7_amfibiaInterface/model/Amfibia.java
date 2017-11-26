package Avtivities2.Exercise7_amfibiaInterface.model;

//7. (Poziom 2) Zaprojektuj interfejs Pojazd z metodą jedź oraz Motorówka z metodą płyń. Zaprojektuj klasę Amfibia, implemenującą oba te interfejsy.

public class Amfibia implements Motorowka, Samochod{

    private String model;
    private String color;
    private int numberOfSeats;

    public Amfibia(String model, String color, int numberOfSeats) {
        this.model = model;
        this.color = color;
        this.numberOfSeats = numberOfSeats;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void drive(int speedOnGround) {
        System.out.println("Pojazd na drodze osiaga " + speedOnGround + " km/h.");

    }

    @Override
    public void swim(int speedOnWater) {
        System.out.println("Pojazd na wodzie osiaga " + speedOnWater + " km/h.");

    }
}
