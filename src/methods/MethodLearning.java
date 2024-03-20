package methods;

public class MethodLearning {

    public static void main(String[] args) {
        System.out.println("METHOD");
        /*
        - Method is used to perform certain task.
        - It's a collection of instruction that perform some specific task.
        - It can be used to bring the code readabilitiy and re-usability
         */
        getPriceOfPen();

        /*
        HOW TO DECLARE A METHOD:
        public int sum(int a, int b) throws Exception {
        // method body
        public - Access Specifiers
        int - return type
        sum - function name
        }
        Access Specifiers:
        -public : can be access through any class in any package
        -private : can be access with in the same class
        -protected : can be access by other classes in the same package or sub classes(which are extends) in different package.
        -Default : if we dont mention anyhting, the default access specifier is used by java. It can be only accessed by classes in same package
         */

        System.out.println("Return Type");
        /*
        - Method do not return anything use 'void'
        - Use Class Name or primitive data types as return type of the method
         */

        System.out.println("Method Name:");
        /*
        -It should be verb(some kind of action)
        -should start with small letter and follow camel case in case of multiple words
         */

        System.out.println("Arguments/Parameters list");
        /*
        - it's a list of variables that will be used in the method
        - parameter list can be blank too
         */

        System.out.println("Method Body");
        /*
        - Method body get finished when you call "return" in mid
        - Get finished when reached to the end
        - you can also stop method by "return" even for void return type
         */

        System.out.println("Types Of Method");
        /*
        1.System Defined Method:
        * Methods which are already defined and ready to use in java like Math.sqrt()

        2.User Defined Method:
        *Methods which programmer creates based upon the program necessity

        3.Overloaded Method:
        *More than one method with same name is created in same class with different parameters

        4.OverRide Method:
        *subclass has the same method as the parent class
        - overloaded(Static Binding) and overRide(Dynamic Binding) comes under polymorphism
        - suppose if a class ha one method and another class extends first class both class have same method during run time
        based on object creating it will take that class method

        5.Static Method:
        * These methods are associated with class
        * can be called with class name
        * Static Methods can not access Non static instance variables and methods
        * static methods cannot be overridden
         when to declare method static:
         - Methods which do not modify the state of the object can be dec
         - Utility method which do not use any instance variable and compute only on arguments
       Ex;
         public static int sum(int a, int b)
         {
         int total = a+b;
         return total;
         }
         here it will accepts some arguments and perform some operations without changing the state of object or variable
        why static methods cannot use non static variables?
        It is because static variables or methods  are associated with classes while non static variables are associated with objects, need to work only on arguments
        * simple don't use static methods if they are using instance variables in a class

        6.Final Method:
        - Final method can not override in java
        - if we cannot override then there is no use to create same method in subclass.
        - why? final method means its implementation can not be changed. if child class can not change its implementation then no use of overridden.

        7.Abstract Method:
        - It is defined only in Abstract classes
        - only method declaration is done
        - its implementation can be done in child-class

        8.Varargs:
        - It is used when we don't know how any arguments will come for that method
        - Instead of writing multiple overloaded methods we will use this one
        - only one var argument is present in the method
        public int num(int a, int ...variable);
        public int num(int ...variable, int a);//will gives error
        It will work fine
        - It should be the last element in the list
       */

        Person person = new Doctor(); //first it will check profession method in doctor if no then it searches in person class
        person.profession();
        System.out.println("VARARGS");
        System.out.println(varSum(1,2,3));

    }

    public static int sum(int val1, int val2){
        int total = val1 + val2;
        System.out.println("addition of val1 and val2 is: " + total);
        return total;
    }

    public static int getPriceOfPen(){
        int capPrice = 2;
        int penBodyPrice = 5;
        int totalPenPrice = sum(capPrice, penBodyPrice);
        return totalPenPrice;
    }

    public static int varSum(int ...variables){
        System.out.println(variables);
        return variables[0];
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
