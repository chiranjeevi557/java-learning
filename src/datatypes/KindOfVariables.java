package datatypes;

public class KindOfVariables {
   static int memberVariable; //member or instance variable
    /*
    int memberVariable; these variable is different for each object
     */
    static int staticVariable = 100; //static variable or class variable common for all classes, only one copy exists every object will refer to that copy
    public static void main(String[] args) {
        byte localVariable = 100; // local variable
        byte local ; //we cannot use local without initalize it

        System.out.println(memberVariable);
        System.out.println(staticVariable);
    }

    KindOfVariables()
    {

    }

    KindOfVariables(int a){

    }

    //method parameter
    public int dummyMethod(int a, int b){
        return a+b;
    }


}
