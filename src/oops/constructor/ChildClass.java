package oops.constructor;

public class ChildClass extends ParentClass{
    ChildClass(){
        super();//no need to write manually by default it will be here
        System.out.println("Inside child class constructor no argument");
    }

    ChildClass(int empId){
        super(empId); // we need to pass required data to the constructor to create an object
    }


}
