package datatypes;

public class Primitive {
    public static void main(String[] args) {
        System.out.println("VARIABLE");
        /*
        variable is a container which holds some value
        Datatype tells what kind of data that variable store
        Datatype variable = value;
        int var = 32;
        *Java is static typed language and strong typed language
        *This means that the type of variable (such as integer, string, etc.) must be explicitly declared before the code is compiled.
        *strong typed means we will assign the
        *variable should be all small if it contains only one word else camel case should be followed.
        Ex:name,firstName
        *For Constant, variable name should be defined in CAPITAL LETTERS
        Ex:
        Primitives in Java are typically stored in the stack memory. The stack is a region of memory that operates in a last-in, first-out (LIFO) manner.
        It is used for method execution, local variables, and managing method calls and returns.
         */
        System.out.println("TYPES oF VARIABLES");

        /*
        1.Primitive type
        2.Reference type
        Primitive type:
        1.char
        2.byte
        3.short
        4.int
        5.long
        6.float
        7.double
        8.boolean
        char,byte,short,int,long are integral types which means it will accept both positive and negative values
        float,double are fractional types it will accept fractional types(decimal numbers)
         */

        System.out.println("CHAR");
        /*
        *2bytes(16 bits)
        * 2 power 16 ---------- 2 power 0
        * character representation is of ASCII value
        * Range: 0 to 65535 i.e '\u0000' to '\uffff'
        *A-Z(65-90)
        * a-z(97-122)
        * char can store ASCII codes also
         */

        char a = 'a';
        char b = 97;
        System.out.println(a);
        System.out.println(b);

        System.out.println("BYTE");
        /*
        * 1byte(8 bits)
        * 2 power 8 ------ 2 power 0
        * signed two complement
        * Range -128 to 127
        * default value is zero
        * The default values are automatically assigned to the class variables only not the variables inside method
         */
        byte a1 = 120;
        System.out.println(a1);

        System.out.println("SHORT");
        /*
         * 2byte(16 bits)
         * 2 power 16 ------ 2 power 0
         * signed two complement (signed means it allows negative numbers)
         * Range -32768 to 32767
         * default value is zero
        */

        System.out.println("integer");
        /*
         * 4byte(32 bits)
         * 2 power 32 ------ 2 power 0
         * signed two complement (signed means it allows negative numbers)
         * Range -2,147,483,648 to 2,147,483,647
         * default value is zero
         */

        System.out.println("long");
        /*
         * 8byte(64 bits)
         * 2 power 64 ------ 2 power 0
         * signed two complement (signed means it allows negative numbers)
         * Range -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
         * default value is zero
         * suppose if any integer value want to treat as long we can specify 100l
         * long c = 100;
         * In this case, 100 is within the range of an int, but since it is assigned to a long variable, it is automatically promoted to long.
           This behavior is part of Java's type promotion rules. However, to make it explicit and avoid any confusion, it's often a good practice to use the l or L suffix when assigning values to long variables.
         */
        long c = 100;
        System.out.println(c);
        System.out.println();

        System.out.println("boolean");
        /*
        *1 bit
        *true or false
        *default value is false
         */

    }
}
