package datatypes;

public class WrapperClass {
    public static final int EMP_ID = 20;
    public static void main(String[] args) {
        System.out.println("Wrapper classes");
        /*
        *In java, we have 8 primitive data types
        * For all 8 we have wrapper/Reference data types
        * Integer,Character,Short,Byte,Long,Float,Double,Boolean
        * Advantages:
        * in primitive data type we cannot change the value by pass the value to a method
        * but in reference we can change the value
        * primitive are stored in stack
        * suppose if i want to use that value not to change that value by passing it to another method
         then go with primitive else go with wrapper/reference
         * All collections are work with reference data types only
         */
        int x = 10;
        change(x);
        System.out.println(x); // here x value is not change if it is reference type it will change
        int a = 10;
        Integer a1 = a; //primitive to wrapper class (Autoboxing)
        Integer a2 = 10;
        int a3 = a2;  //wrapper to primitive (unboxing)

        System.out.println("Constant Variables");
        //constant variables cannot be changed
       // EMP_ID = 40; not able to change
        System.out.println(EMP_ID);
    }
    public static void change(int x)
    {
        x=20;
        System.out.println(x);
    }
}
