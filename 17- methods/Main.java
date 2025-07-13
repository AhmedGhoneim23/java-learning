
public class Main {

    public static void main(String[] args) {

        // method = a block of reusable code that is executed when called ()

        String name = "Spongebob";
        int age = 24;

        happyBirthday(name, age);

        double result = square(4);
        System.out.println(result);

        System.out.println(cube(9));


        String fullName = getFullName("Spongebob", "Squarepants");
        System.out.println(fullName);


        if(ageCheck(age)){
            System.out.println("You may sign up!");
        }else {
            System.out.println("You must be 18+ to sign up");
        }


    }


     static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old\n", age);
        System.out.println("Happy Birthday to you!\n");
    }

    static double square (double num){
        return num * num ;
    }

    static double cube (double num){
        return num * num * num ;
    }

    static String getFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    static boolean ageCheck (int age){
        return age >= 18;       // true or false    
    }

}
