package collections;

import java.util.PriorityQueue;

public class QueueLearning {
    public static void main(String[] args) {
       /*
         1.In queue we have front and rear
         2.If we want to insert we will insert it into rear and if we want to delete we will delete it from front
         3.Queue is an interface and child of collection interface
         4.it follows FIFO approach
         5.supports all the methods available in collection + some methods particularly for queue only
         6.Head and front both are same refers to the first element
         7.PriorityQueue is the implemented class for queue interface

      */

        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(10);
        numbers.add(9);
        numbers.add(6);
        numbers.add(7);
        numbers.forEach((Integer a)-> System.out.println(a));

    }
}
