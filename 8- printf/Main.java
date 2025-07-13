
public class Main {

    public static void main(String[] args){

        // printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        // [specifier-character]

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);

        // ------------------------------------------------------------

        // [.precision]

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("%.1f\n", price1);             //   10.0
        System.out.printf("%.2f\n", price2);             //   100.15
        System.out.printf("%.3f\n", price3);             //   -54.010

        // ------------------------------------------------------------

        // [flags]

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative , space if positive

        System.out.printf("%+.1f\n", 9.99);                 //   +10.0
        System.out.printf("%+.2f\n", 100.15);               //   +100.15
        System.out.printf("%+.3f\n", -54.01);               //   -54.010

        System.out.printf("%,.2f\n", 9000.99);             //   9,000.99
        System.out.printf("%,.2f\n", 100000.15);           //   100,000.15
        System.out.printf("%,.2f\n", -54000.01);           //   -54,000.01

        System.out.printf("%(.2f\n", 9.99);               //   9.99
        System.out.printf("%(.2f\n", 100.15);             //   100.15
        System.out.printf("%(.2f\n", -54.01);             //   (54.01)

        System.out.printf("% .2f\n", 9.99);               //    9.99
        System.out.printf("% .2f\n", 100.15);             //    100.15
        System.out.printf("% .2f\n", -54.01);             //   -54.01

        // ------------------------------------------------------------

        // [width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);             //   0001
        System.out.printf("%04d\n", id2);             //   0023
        System.out.printf("%04d\n", id3);             //   0456
        System.out.printf("%04d\n", id4);             //   7890

        System.out.printf("%4d\n", id1);             //      1
        System.out.printf("%4d\n", id2);             //     23
        System.out.printf("%4d\n", id3);             //    456
        System.out.printf("%4d\n", id4);             //   7890

        System.out.printf("%-4d\n", id1);             //   1
        System.out.printf("%-4d\n", id2);             //   23
        System.out.printf("%-4d\n", id3);             //   456
        System.out.printf("%-4d\n", id4);             //   7890

    }

}
