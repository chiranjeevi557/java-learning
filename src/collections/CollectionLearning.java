package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CollectionLearning {

    public static void main(String[] args) {
        //collection-it is a group of objects. its an interface which provides methods to work on objects
        // below are the most commonly used methods which are implemented by its child classes like Arraylist,linkedlist etc
        //stream and parallel stream also included but it is covered in a separate class
        //these all are collection interface method any class that extends this collection have same methods
        //if there is no collection interface it is very hard to remember for a all class methods

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);                              //collection1
        numbers.add(10);
        numbers.add(3);
        numbers.add(3);

        //size
        System.out.println(numbers.size());

        //isEmpty
        System.out.println(numbers.isEmpty());

        //contains
        System.out.println(numbers.contains(4));

        //add
        System.out.println(numbers.add(5));

        //remove using index
        System.out.println(numbers.remove(3));

        //remove the data and 3 is normal int we need to convert it into object and if multiple occurence are present it will remvove first occurence
        System.out.println(numbers.remove(Integer.valueOf(3)));

        Stack<Integer> data = new Stack<>();
        data.add(10);
        data.add(20);                               //collection 2
        data.add(30);
        data.add(40);

        //addall
        numbers.addAll(data);

        //check whether the stack elements are present after all
        System.out.println(numbers.containsAll(data));

        //i need to remove all stack elements
        System.out.println(numbers.removeAll(data));

        //i need to remove all elements in list
        numbers.clear();

        //check whether the list is empty or not
        System.out.println(numbers.isEmpty());

    }
}
