package oops.constructor;

public class Constructor {
    public static void main(String[] args) {
        /*
        - It is used to create an instance / initializing the instance variable
        - Its similar to method expect:
        * Name : Constructor name is same as Class Name
        * Return Type: Constructor do not have any return type explicitily
        * implicitily java will add return type as class name to the constructor
        * if constructor has return type then it act as a method
        * Name and Return Type will distinguish the constructor and method
        * Constructor can not be static or final or abstract, synchronized
         */
        System.out.println("CONSTRUCTOR");
        Employee1 employee1 = new Employee1(); // During run time the new will tells jvm to call contructor not method even if it have same class name
        Employee1 employee11 = new Employee1(10);

        /*
        1.why constructor does not have return type ?
        2.why constructor can not be final?
        final method cannot be overriden
        class Employee {
        Employee(){};
        }
        class Main extends Employee{
        }
        when we use extends all methods and variables of super class can be inherited to subclass.
        Suppose if constructor also inherited generally the Main class has construcor like Main() then main class
        treated Employeed constructor as a method and tells to provide a return type for that.
        constructor can not be overriden then what is the use of using final for constructor
        3.why construcor can not be abstract ?
        abstract class Employee {
        abstract void print();
        }
        in order to implement print() we need to extends Employee class but constructor can not be overriden
        3.why constructor can not be static ?
        class Employee {
        int empId;
        Employee(id)
        {
        empId = id;
        }}
        *.If i declared constructor as static it cannot be accessed non static variables
        4.can we define a constructor in interface ?
        interface Employee{
        public print();
        }
        for interface we cannot create object
        public Main implements Employee{
        Main(){}
        print();
        }
        here already Main has its constructor then we cannot initalize anothe constructor
        constructor primary usage is to create an object
        */

    }
}
