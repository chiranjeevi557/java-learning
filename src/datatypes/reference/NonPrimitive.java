package datatypes.reference;

import java.util.Arrays;

public class NonPrimitive {
    public static void main(String[] args) {
        System.out.println("Reference Data Types");
        /*
        Types
        1.Class
        2.String
        3.Interface
        4.Array
        Passing to Methods:
        Primitive Data Types: They are passed by value. Changes made to the parameter within a method do not affect the original variable.
        Reference Data Types: The reference is passed by value, but changes to the object's state are visible outside the method.
        *in java everything is pass by value
        *In contrast, objects (including instances of wrapper classes for primitives) are typically stored on the heap memory.
         The heap is a region of memory used for dynamic memory allocation, and objects persist in the heap until they are no longer referenced.
        */

        System.out.println("CLASS");
        Employee employeeObject = new Employee();//when we use new inside heap memory some space is allocated for that object
        //employeeObject is an reference to the space or object created in the heap memory
        employeeObject.setEmpId(10);
        Employee employee = employeeObject;
        modify(employeeObject);

        System.out.println("STRINGS");
        /*
        in heap memory some space is alreay allocated for strings called stringpool
        *strings are immutable
        *string literals - the elements present in string constant pool
         */

        String s1 = "hello"; //this will call string literal and store in string pool
        String s2 = "hello"; //this will checks whether that string already presented in the stringpool. if it presents this reference will point to the string pool instead of creating new one
        String s3 = new String("hello"); // this is not a sting literal and it will create new object for that string in the heap memory
        System.out.println(s1==s2); //this will return whether both strings are point to the same memory in heap
        System.out.println(s1.equals(s2));//this will check both contents are same or not
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        //suppose here i want to change s1 value
        s1 = "hello world"; // first it will checks hello world present or not then create new hello world in string pool and points to that
        // but here hello still exists in heap that is not possible to replace thats why strings are called immutable
        String s4 = "Hello";
        String s5 = "hello";
        System.out.println(s4.equals(s5));
        System.out.println(s4.equalsIgnoreCase(s5));

        System.out.println("INTERFACE");
        Person software = new Engineer(); //in heap it creates an object of engineer
        Person teacher = new Teacher(); // here person id parent and teacher is child
        Teacher teacher1 = new Teacher();
        Engineer engineer = new Engineer();
        System.out.println(software.getClass());

        System.out.println("ARRAY");
        int[] arr = new int[5]; //here we are allocating five memory locations in the heap
        int[] arr1 = {1,2,3,4,5}; //here we cannot perform any operations like max,min because it is not a class
        int arr2[] = {1,2,3,4,5};//we have Arrays class which will help to perform some operations like searching,sorting
        System.out.println(arr1.length);

        System.out.println("2D Array");
        int arr3[][] = new int[5][4];
    }
    private static void modify(Employee employee){
        employee.setEmpId(20);
    }
}
