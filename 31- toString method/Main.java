public class Main {

    public static void main(String[] args) {

        // .toString() = Method inherited from the object class.
        //               Used to return a string representation of an object.
        //               By default, it returns a hash code as a unique identifier.
        //               It can be overridden to provide meaningful details.

        Car car = new Car("Ford", "mustang", 2025, "Red");

        System.out.println(car);

        // System.out.println(car.make + " " + car.model + " " + car.year + " " + car.color);


    }

}
