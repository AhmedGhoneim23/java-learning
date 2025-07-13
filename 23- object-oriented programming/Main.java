public class Main {

    public static void main(String[] args) {

        //  Object = An entity that holds data (attributes)
        //           And can perform actions (methods)
        //           It is a reference data type

        Car car = new Car();

        car.isRunning = true;

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.price);
        System.out.println(car.year);
        System.out.println(car.isRunning);

        car.start();
        car.drive();
        car.brake();
        car.stop();

        

    }

}
