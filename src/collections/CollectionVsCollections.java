package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionVsCollections {
    public static void main(String[] args) {
        //collection is an interface and collections is an utility class which provides some static methods to work on collections like sort,swap,search,copy etc

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        //sort it will sort the existing one not return new one from that
        Collections.sort(numbers);
        System.out.println(numbers);

        //binary search, before searching the elements are in ascending order
        Collections.sort(numbers);
        System.out.println(Collections.binarySearch(numbers,20));

        //max and min values
        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));

        numbers.forEach((Integer a)-> System.out.println(a));
    }
}
