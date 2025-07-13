public class Main {

    public static void main(String[] args) {

        // varargs = makes methods more flexible, no need for overloaded methods
        //           ... (ellipsis)

        System.out.println(add(1, 2, 3, 8, 5));

        System.out.println(average(1, 2, 3, 4, 5, 6));

    }

    static int add(int... numbers){

        int sum = 0;

        for (int number: numbers){
            sum+= number;
        }

        return sum;
    }


    static double average(double... nums){

        double sum = 0;

        for (double num: nums){
            sum+= num;
        }

        return sum / nums.length;
    }

}
