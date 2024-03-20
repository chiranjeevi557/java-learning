package oops.constructor;

public class Employee {
    Employee(){}

    //private Employee(){}

    public static Employee getInstance(){
        return new Employee(); //like this only we will use private constructor
    }


}
