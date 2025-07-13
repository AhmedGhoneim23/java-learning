public class Main {

    public static void main(String[] args) {

        // Super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overriding
        //         Calls the parent constructor to initialize attributes
        

        Student student = new Student("Spongebob","Squarepants", 3.43);
        Employee employee = new Employee("Patrick","Star", 30000);

        student.showGpa();
        employee.showSalary();


    }

}
