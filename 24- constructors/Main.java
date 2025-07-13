public class Main {

    public static void main(String[] args) {

        //  constructor = A special method to initialize objects
        //                You can pass arguments to a constructor
        //                and set up initial values

        Student student1 = new Student("Spongebob", 24, 3.4);
        Student student2 = new Student("Patrick", 24, 2.2);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        student1.study();
        student2.study();


    }

}
