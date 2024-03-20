package oops.constructor;

public class Employee1 {
    public int empId;
    public String name;

    Employee1(){
        this(10);  //it is a part of constructor chaining using this
    }
    Employee1(int empId){
        this("chiru"); //it is a part of constructor chaining using this
    }

    Employee1(String name){this.name = name;}

    public int Employee()
    {
        return empId;
    }

}
