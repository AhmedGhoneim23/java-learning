public class Main {

    public static void main(String[] args) {

        // Interface = A blueprint for a class that specifies a set of abstract methods
        //             that implementing classes must define.
        //             Supports multiple inheritance

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();

        fish.flee();
        fish.hunt();



    }

}
