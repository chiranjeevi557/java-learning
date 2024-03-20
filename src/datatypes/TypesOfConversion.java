package datatypes;

public class TypesOfConversion {
    public static void main(String[] args) {
        System.out.println("Widening/Automatic Conversion");
        /*
        *here we will convert lower data type into higher data type(here compiler itself automatically converts it)
        int a = 10;
        long b = a;(here it will do automatic conversion from smaller data type to longer data type)
         */
        byte x = 10;
        int intVariable = x;
        System.out.println(intVariable);

        System.out.println("Downcasting/Explicit Conversion");
        /*
        * here we will convert higher data type into lower data type
         */
        int integerVariable = 10;
        byte byteVariable = (byte) integerVariable; // it will throw error we need to do explicit conversion
        System.out.println(byteVariable);

        int integerVariable1 = 128;
        byte byteVariable1 = (byte) integerVariable1; // range of byte is -128 to 127
        /*
        here we are forcefully converting
        -128 to 127
        in the above example 128 comes after 127
        so -128 to 127 will loop continuosly upto the desired value and prints that value
         */
        System.out.println(byteVariable1);

        System.out.println("Promotion");

        byte a = 127;
        byte b = 1;
        int sum = a+b;

    }
}
