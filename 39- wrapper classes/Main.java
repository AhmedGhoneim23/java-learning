
public class Main {

    public static void main(String[] args) {

        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitives unless you need an object.
        //                   Allows use of Collections Framework and static Utility Methods.

        // Autoboxing
        Integer a = 123;    // it's like  =>  Integer a = new Integer(123);
        Double b = 3.14;
        Character c = 'n';
        Boolean d = true;


        // there's also a technique called unboxing to convert a wrapper class back to its primitive

        // unboxing
        int x = a;
        double z = b;
        char y = c;
        boolean q = d;

        // --------------------------------------------------------------

        // if you ever need to convert a primitive data type into a string

        String w = Integer.toString(123);
        String e = Double.toString(3.14);
        String r = Character.toString('n');
        String t = Boolean.toString(true);

        String u = w + e + r + t;

        System.out.println(u);

        // or we can do

        int f = Integer.parseInt("123");
        double g = Double.parseDouble("3.14");
        char h = "Pizza".charAt(0);
        boolean j = Boolean.parseBoolean("true");

        // ---------------------------------------------------

        char letter = 'b';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));




    }

}
