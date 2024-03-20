package oops.constructor;

public class TypesOfConstructor {
    public static void main(String[] args) {
        System.out.println("Types Of Constructor");

        System.out.println("Default Constructor");
        Employee employee = new Employee();
        //there is no constructor in employee class so java creates a default constructor
        //suppose is there any constructor already in that class then java doesn't create default constructor

        System.out.println("No Args Constructor");
        Employee1 employee1 = new Employee1();

        System.out.println("Parameterized");
        // new tells that call that constructor
        Employee1 employee11 = new Employee1(10);

        System.out.println("Constructor overloaded");
        //same like method overloading but constructor overloading doesn't works

        System.out.println("Private constructor");
        //nobody will be allowed to create an object
        //with in that class is possible
        //mostly used in singleton pattern
        Employee.getInstance();

        System.out.println("Constructor Chaining");
        /*
        constructor chaining can be achieved using
        1.this:
        this can be used to invoke the contructors with in the class
        refer Employee class
        2.super:
        super is happened in between parent and child
        */
        ChildClass childClass = new ChildClass();
        /*here first it will class the parent class constructor then it calls the child class constructor
        *here in childclass constructor there is super() which is presents default when a class extends another class
        * so when we tried to create child class object then this super() is invoked and initiates the parent object
         */



    }
}
