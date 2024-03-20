package classes;

public class OuterClass {
    int instanceVariable = 10;
    static int classVariable = 20;

    static class NestedClass{  // we will declare this class as private also but its object is not created in another class
        public void print(){
            System.out.println(classVariable); //not able to access instanceVariable
        }

    }

    class InnerClass {  // we will declare it for innerclass
        public void print(){
            System.out.println(classVariable + instanceVariable);
        }
    }

    public void displayLocal(){ //within in this block only we will be initiated
        int methodLocalVariable = 3;
        class LocalInnerClass{
            int LocalInnerVariables = 4;
            public void print(){
                System.out.println(instanceVariable + classVariable + methodLocalVariable + LocalInnerVariables);
            }
        }
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.print();
    }

    public void display(){
        NestedClass nestedClass = new NestedClass();
        nestedClass.print();
    }

}
