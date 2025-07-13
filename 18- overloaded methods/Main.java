
public class Main {

    public static void main(String[] args) {

        //  overloaded methods = methods can share the same name but different parameters

        System.out.println(add(1, 2, 5, 11));

    }

    static double add (double a, double b){
        return a + b;
    }
    static double add (double a, double b, double c){
        return a + b + c;
    }
    static double add (double a, double b, double c, double d){
        return a + b + c + d;
    }
}
