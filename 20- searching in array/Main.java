

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        int target = 14;
        boolean isFounded = false;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == target){
                System.out.println("Your number in index: " + i);
                isFounded = true;
                break;
            }
        }

        if (!isFounded){
            System.out.println("Element not found in the array");
        }

        // if (StringArrayName[i].equals(target))




    }

}
