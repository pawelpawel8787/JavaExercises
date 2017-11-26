package Activities2.Exercise5_buildingArea.model;

/**
 * Created by HP on 2017-07-12.
 */
public class Building {

    private double height;
    private double width;
    private double length;
    private double numberOfFloors;

    public Building(double height, double width, double length, double numberOfFloors) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.numberOfFloors = numberOfFloors;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getLiczbaPieter() {
        return numberOfFloors;
    }

    public double area(){
        return width * length;



    }

}
