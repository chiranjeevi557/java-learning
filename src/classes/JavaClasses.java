package classes;

public class JavaClasses {
    public static void main(String[] args) {
        System.out.println("CONCRETE CLASS");
        /*
        1.These are those class that we can create an instance variable using NEW keyword
        2.All the methods in this class have implementation
        3.It can also be your child class from interface or extend abstract class
        4.A class access modifier can be "public" or "package privte"(no explicit modifier defined)
         */

        System.out.println("ABSTRACT CLASS ");
        /*
        show only important features and hide its internal implementation.
        2 ways to achieve abstraction:
        1.class is declared as abstract through keyword "abstract"
        2.It can have both abstract and non-abstract methods
        3.we cannot create an instance of this class
        4.we parent has some features which all child classes have in common, then this can be used.
        5.constructors can be created inside them.And with super keyword from child classes we can access them.
         */
        Audi audi = new Audi(10);

        System.out.println("SUPER AND SUBCLASS AND OBJECT CLASS");
        /*
        1.A class that is derived from another class is called a subclass
        2.And from class through which subclass is derived its called superclass
        3.In java, in the absense of any other explicit superclass, every class is implicitily a subclass of object class
        4.object is the top most class in java
        It has some common methods like clone(), toString(), equals(), notify(), wait() etc.
         */

        Object o = new Audi(10);
        System.out.println(o.getClass());

        System.out.println("NESTED CLASS");
        /*
        Class within another class is called Nested Class

        when to use ?
        If you know that, a class(A) will be used by only one another class(B), then instead of
        created new file(A.java) for it, we can create nested class inside B class itself.
        And
        Also help us to group logically related classes in one file.
        The class this is useful for that class only

        Scope:
        Its scope is same as of its outer class

        It is of 2 types:
        - static nested class
        - non-static nested class or Inner Class
        * Member inner class
        * Local inner class
        * Anonymous inner class

        Static Nested Class:
        * It do not have access to the non static instance variable and method of outer class
        * Its object can be initiated without initiating the object of Outer class
        * It can be privated, public, protected or package-private(default, no explicit declaration)
         */

        OuterClass.NestedClass nestedClass = new OuterClass.NestedClass(); // here nestedclass is associated with class
        nestedClass.print();

        /*
        Inner Class or Non Static Nested Class:

        * It have access to all the instance variable and method of outer class
        * Its object can be initiated on after initiating the object of outer class.

        1.Member Inner Class:
        - it's can be private,public,protected,default
        2.Local Inner Class:
        - These are those classes which are defined in any block like for loop, while loop block, if condition block, method etc.
        - It can not be declared as private,protected,public. Only default(not defined eplicit) access modifier is used.
        - it can not be initiated outside of this block.
         */
        // example of member inner class
        OuterClass outerClass = new OuterClass(); // here innerclass is not a static class so first we need to create object of outer class through that object we will create object of inner class

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.print();

        /*
        2.Local Inner class:
        - These are those classes which are defined in any block like for loop, while loop block, if condition block, method etc
        - It can not be declared as private, protected, public. Only default(not defined explicit) access modifier is used.
        - It can  not be initiated outside of this block.
         */

        outerClass.displayLocal();

    }

}
