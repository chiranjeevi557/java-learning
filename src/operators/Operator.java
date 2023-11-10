package operators;

public class Operator {
    public static void main(String[] args) {
        /* operator:indicates what action to be performed like addition etc ex:+
           operand:this indicates the items, on which action has to apply on
           Expression:It consist of 1 or more Operand and O or more Operators.

           a=b+c(expression)
           a- operand
           +-operator
        */

        //Airthmetic Operators

        System.out.println("Arithmetic Operators");
        int division = 5/2; //quotient
        System.out.println(division);

        int mod = 5%2; //reminder
        System.out.println(mod);

        int sum = 5+2;
        System.out.println(sum);

        int subtract = 5-2;
        System.out.println(subtract);

        int multiply = 5*2;
        System.out.println(multiply);

        //Relational operators compares two operand relation and return true or false
        System.out.println("Relational Operators");

        int a=5;
        int b=7;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        //Logical operators combines two or more conditions and return true or false
        System.out.println("Logical Operators");

        //AND operator
        //In AND only True and True are true remaining all are false
        System.out.println(a<3 && a!=b);
        System.out.println(a>3 && a!=b);

        //OR operator
        //In OR only False or False are false remaining all are true
        System.out.println(a<3 || a!=b);
        System.out.println(a>3 || a!=b);

        //Unary operators are used to perform operations on single operand
        System.out.println("Unary Operators");
        int number = 5;
        boolean flag = true;

        //Increment operator
        /*
          operand++(postfix increment)
          ++operand(prefix increment)
          number++(here first it will return number for the assigned variable or in println and then increment that number)
          ++number(here first it will increment the number and it will return to the assigned variable)
         */
        System.out.println(number++);
        System.out.println(++number);

        //Decrement operator
        System.out.println(number--);
        System.out.println(--number);

        //Logical NOT operator
        //if the value is True it makes it as false and if the value is false it makes the value as true
        System.out.println(!flag);

        //Unary Minus operator
        //it will makes give value to negative
        System.out.println(-a);

        //Unary Plus operator
        //it will makes given value to positive
        System.out.println(+a);

        //Assignment operators are used to assign new values to the variable
        System.out.println("Assignment Operators");
        int number1 = 5;
        int variable;

        variable = number1;
        System.out.println(variable);

        variable = 0;
        variable+=number1;
        System.out.println(variable);

        variable-=3;
        System.out.println(variable);

        variable*=number1;
        System.out.println(variable);

        variable/=number1;
        System.out.println(variable);

        System.out.println("Bitwise Operators");
        //It works on bit 1 and 0 and its very fast because it directly works with processor no need to convert from numbers to bits
        /*
        Bitwise And(&)     Bitwise OR(|)   Bitwise XOR(both 1 or 0 it will 0)    Bitwise NOT(~)
        1  0 = 0            1  0 = 1       1  0 = 1                              1  =  0
        0  1 = 0            0  1 = 1       0  1 = 1                              0  =  1
        1  0 = 0            1  0 = 1       1  0 = 1
        1  1 = 1            1  1 = 1       1  1 = 0
        0  0 = 0            0  0 = 0       0  0 = 0

        Generally the order is - - - - 64 32 16 8 4 2 1 (1 is 2 power 0, 2 is 2 power 1 like that)

        0 1 0 0(First zero is most significant bit(MSB) and last zero least significant bit)
        * for positive numbers we need to add MSB as zero at first bit place
        * for negative numbers we need to add MSB as 1 at first bit place
        * The first bit we will add based on positive or negative sign of the number not it get from the number that is converting to bits
        * if MSB is zero then that number is positive
        * if MSB is 1 then that number is negative
        * for 4 the bits are 1 0 0 but before 1 we are adding o because it is positive number


        */

        int data1 = 4;
        int data2 = 6;

        //Bitwise AND
        /*
         for data1= 0 1 0 0
         for data2= 0 1 1 0
         AND      = 0 1 0 0

         similarly we will do it for OR also
         */
        System.out.println(data1 & data2);

        //Bitwise OR
        System.out.println(data1 | data2);

        //Bitwise XOR
        System.out.println(data1 ^ data2);

        //Bitwise NOT
        /*
        for data1= 0 1 0 0
        here MSB is 0 after applying NOT the MSB will changed to 1 it means negative number
        for NOT=   1 0 1 1
        here for first one the value is 2 power -3 because it is negative, for zero it is zero, for one 2 power 1, for one 2 power 0 = -8+0+2+1=-5;)
        *In java integer is signed so we well use minus power if MSB is 1
        * The formula for Bitwise NOT is -(n+1)
        5 = 0101
        To get -5, we know that we have to find its 2nd Complement
        1st complement = 1010
        2nd Complement = 1010+1=1011
         */
        System.out.println(~data1);

        System.out.println("Bitwise Shift Operators");

        int number4 = 4;

        //left shift
        System.out.println(a<<1);
        System.out.println(a<<2);

        //right shift
        System.out.println(a>>1);
        System.out.println(a>>2);

        System.out.println("Ternary Operators");
        //It mimics the if else condition
        //(condition)?(expression1):(expression2)

        int a1=4;
        int b1=5;

        int maxValue = (a>b) ? a1 : b1;
        System.out.println(maxValue);

        System.out.println("Type Comparison Operator");
        //instanceOf(It is used to do the type check, whether particular object is of certain class or not)

        ParentClass parentClass = new ChildClass();
        System.out.println(parentClass instanceof ChildClass);

        String val = "chiru";
        System.out.println(val instanceof String);

        Operator operator = new Operator();
        System.out.println(operator instanceof Operator);

        System.out.println("Need to learn Operator Precedence");


    }
}

