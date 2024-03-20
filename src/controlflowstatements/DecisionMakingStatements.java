package controlflowstatements;

public class DecisionMakingStatements {
    public static void main(String[] args) {

        System.out.println("simple IF");
        //if condition is true, then if-block will get executed

        int value = 10;

        if (value > 8) {
            System.out.println("only executes when value is greater then 8");
        }

        System.out.println("IF ELSE");
        //if condition is true, if-block will get executed else if condition is false, then else-block will get executed

        int val = 7;

        if (val > 8) {
            System.out.println("only executes when value is greater then 8");
        } else {
            System.out.println("this code will executes, if val is less than or equals to 8");
        }

        System.out.println("IF ELSE IF LADDER");
        /* It contains if-statement with multiple(chain of) else-if statements. It evaluate the condition from top and goes down and any condition gets true
        its block will get executed
        */

        int val1 = 13;
        if (val == 1) {
            System.out.println("val is 1");
        } else if (val == 2) {
            System.out.println("val is 2");
        } else if (val == 3) {
            System.out.println("val is 3");
        } else {
            System.out.println("value is: " + val1);
        }

        System.out.println("NESTED-IF STATEMENT");
        //if-else statement within if-block or else-block

        int val2 = 12;

        if (val2 > 8) {
            System.out.println("value is greater then 8");

            if (val2 < 15) {
                System.out.println("value is greater then 8 but else then 15");
            } else {
                System.out.println("value is greater then 15");
            }
        } else {
            System.out.println("value is less then equal to 8");
        }

        System.out.println("SWITCH STATEMENT");
        /* it is similar to if-else-if ladder based on condition particular block will be executed outo of many alternatives
        Syntax:

        switch(expression){
              case value_1:
                   //code statements
                   break;
              case value_1:
                   //code statements
                   break;
              default:
                   //default statements
                   break; //(optional)

                  }
           //which ever the expression value matches with case value that block will be executed.
           // if there is no break statement it will go and execute the next code also
         */

        int a = 1;
        int b = 2;
        switch (a + b) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println(a + b);
        }

        System.out.println("switch another use case");

        String month = "March";
        switch (month) {
            case "January", "February", "March":
                System.out.println("month value is in Q1");
                break;
            case "April", "May", "June":
                System.out.println("month value is in q2");
                break;
            default:
                System.out.println("month value is in q3");
        }

        /*
        we can write like
        case 'JAN':
        case 'feb':
        sout("q1")
        break;
        case 'april'

        *Two cases can not have the same value
        *switch expression data type and case values/constant data type should be same
        *case values should either LITERAL or CONSTANT
        ex:
        int value = 1;
        final int value = 1;(for this case will work fine because it is constant)
        case value:(it will give error)
        case 1 or "name":(for any literal it works fine)
        *putting default is not mandatory it is our wish
        *supported data types:
        -4 primitive types: int, short, byte, char
        -wrapper types for the above primitive data types i.e. Integer, Short, Byte, Character.
        -Enum
        -String

         */


        /*
         *Return is not possible within switch case
         * To overcome that in java 12 they introduced
         1.using "case N->" label (default is mandatory)
         2.using "yield" statement
         */
        String day = "";
        int val4 = 1;
        String outputVal = switch (val4){
            case 1 -> "one"; //Using this "->" we can not have block if statements({}). If we want block of statements and then return the value, we need to use "yield".
           /*
           case 1 -> {
           //some code logic here
           yield "one" // here we will return all business logic instead of using return we will use yield to return
           }
            */
            case 2 -> "Two";
            default -> "None";
        };
        System.out.println(outputVal);

    }
}
