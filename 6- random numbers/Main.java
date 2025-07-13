import java.util.Random;

public class Main {

    public static void main(String[] args){

        Random random = new Random();


        int number ;

        number = random.nextInt(1, 23);

        System.out.println(number);

        // ----------------------------------------

        double number2 ;

        number2 = random.nextDouble(24 , 100);

        System.out.println(number2);

        // ----------------------------------------

        boolean isHead ;

        isHead = random.nextBoolean();

        if (isHead) {
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }




    }

}
