package controlflowstatements;

public class IterativeStatements {
    public static void main(String[] args) {
        System.out.println("FOR LOOP");

        /*
        for(initialization of variable;condition check;increment/decrement of variable){
        //statement block
        }
         */

        for(int i=0;i<=10;i++)
        {
            System.out.println(i);
        }

        for(int i=1;i<=3;i++)
        {
            for (int j=1;j<=3;j++){
                System.out.println(i+""+j);
            }

        }

        System.out.println("WHILE LOOP");

        /*
        Initialize variable;
        while(condition check){
        //block of statements
        increment/decrement variable
        }
         */

        int value = 1;
        while (value <= 5)
        {
            System.out.println(value);
            value++;
        }

        System.out.println("DO While");

        // we need to run the loop atleast once
        /*
        initialize variable;
        do{
        //block of statements
        increment/decrement variable
        }while(condition check);
         */

        int value1 = 1;
        do {
            System.out.println(value1);
            value1++;
        }while (value1<=5);

        System.out.println("For each loop");

        int[] array = {1,2,3,4,5};
        for (int val : array){
            System.out.println(val);
        }
        
    }
}
