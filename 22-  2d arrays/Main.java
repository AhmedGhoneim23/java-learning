public class Main {

    public static void main(String[] args) {

        // 2D array = an array where each element is an array
        //            useful for storing a matrix of data

        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        String[][] groceries = {fruits, vegetables, meats};


        // groceries[0][0] = "pineapple";
        // groceries[1][0] = "celery";
        // groceries[2][1] = "eggs";


        for (String[] foods: groceries){
            for (String food: foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }



        for(String food: groceries[1]){
            System.out.println(food);
        }


    }

}
