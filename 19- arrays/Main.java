import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // array = a collection of values of the same data type
        //         think of it as a variable that can store more than one value


        String[] fruits = {"apple", "orange", "banana", "coconut"};

        // fruits[0] = "pineapple";
        // Arrays.sort(fruits);
        // Arrays.fill(fruits,"pineapple");


        for (int i = 0 ; i < fruits.length; i++){
            System.out.print(fruits[i] + " ");
            System.out.println();
        }


        // foreach loop
        for (String fruit : fruits){
            System.out.println(fruit);
        }

        // ----------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        String[] fruits2;
        int size;

        System.out.print("What # of food do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        fruits2 = new String[size];

        for (int i = 0; i < size; i++){
            System.out.print("Enter a food: ");
            fruits2[i]= scanner.nextLine();
        }

        for (String fruit : fruits2){
            System.out.println(fruit);
        }

        System.out.println(size);








    }

}
