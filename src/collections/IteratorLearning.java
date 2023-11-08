package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IteratorLearning {
    public static void main(String[] args) {
        //iterator is an interface

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println("iterating the numbers using iterator ");

        Iterator<Integer> integerIterator = numbers.iterator();  // returns the iterator object
        while(integerIterator.hasNext()) // hasNext checks whether the element is present or not
        {
            int value = integerIterator.next();
            System.out.println(value);
            if(value == 4)
            {
                integerIterator.remove();
            }
        }

        System.out.println("iterating the numbers using for each loop ");

        for(int number:numbers) {       //any collection which is a child of iterable it can use foreach loop
            System.out.println(number);
        }

        System.out.println("iterating the numbers using for each method");

        numbers.forEach((Integer a) -> System.out.println(a));
    }
}
