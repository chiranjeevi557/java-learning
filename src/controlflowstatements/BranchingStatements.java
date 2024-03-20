package controlflowstatements;

public class BranchingStatements {
    public static void main(String[] args) {

        System.out.println("BREAK");
        //used mostly in the loops
        for(int val=1; val<=10; val++){
            if(val == 3){
                break;
            }
            System.out.println(val);
        }

        System.out.println("CONTINUE");
        //used to skip that value
        for(int val=1; val<=10; val++){
            if(val == 3){
                continue;
            }
            System.out.println(val);
        }
    }
}
