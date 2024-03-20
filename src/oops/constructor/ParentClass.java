package oops.constructor;

public class ParentClass {
   int empId;
    ParentClass(){
        System.out.println("this is parent class");
    }

    ParentClass(int empId){
        this.empId = empId;
    }
}
