package Activities2.Exercise7_amfibiaInterface.model;

/**
 * Created by HP on 2017-07-13.
 */
public interface Samochod {

    default void drive(int speedOnGround) {}
}
