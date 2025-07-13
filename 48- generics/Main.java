import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Generics = A concept where you can write a class, interface or method
        //            that is compatible with different data types.
        //            <T> type parameter (placeholder that gets replaced with real type)
        //            <String> type argument (specifies the type)

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Banana");
        fruits.add("Orange");

        // ----------------------------------------------------

        Box<String> box = new Box<>();

        box.setItem("banana");

        System.out.println(box.getItem());

        // -----------------------------------------------------

        Product<String, Double> product1 = new Product<>("apple", 1.50);
        Product<String, Integer> product2 = new Product<>("apple", 1);

        System.out.println(product1.item);
        System.out.println(product1.price);

        System.out.println(product2.item);
        System.out.println(product2.price);


    }

}
