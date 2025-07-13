public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Red", "mustang");
        Car car2 = new Car("Blue", "corvette");
        Car car3 = new Car("Yellow", "charger");

        // Car[] cars = new Car[3];
        // cars[0] = car1;
        // cars[1] = car2;
        // cars[2] = car3;

        // Car[] cars = { new Car("Red", "mustang"),
        //                new Car("Blue", "corvette"),
        //                new Car("Yellow", "charger")};

        Car[] cars = {car1, car2, car3};


        for (Car car: cars){
            car.drive();
        }



    }

}
