import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // They help protect object data and add rules for accessing or modifying them
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.

        Car car = new Car("Charger","Yellow", 10000);

        car.SetModel("Ford");
        car.setPrice(77777);

        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());



    }

}
