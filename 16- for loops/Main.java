
public class Main {

    public static void main(String[] args) throws InterruptedException{

        // for loop = execute some code a CERTAIN amount of times

        int start = 20;

        for (int i = start; i > 0 ; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Happy New Year!");

        // ------------------------------------------------

        for (int i = 0; i < 10; i++){

            if (i == 5){
                continue;
            }

            if (i == 7){
                break;
            }

            System.out.println(i);
        }

        // ------------------------------------------------

        /*
        for (int i = 1; i < 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i < 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i < 10; i++){
            System.out.print(i + " ");
        }

         */


        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= 9; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
