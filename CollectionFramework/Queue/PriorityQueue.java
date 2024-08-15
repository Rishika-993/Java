import java.util.*;
package CollectionFramework.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<>();
        q.add("Ravi");
        q.add("Amit");
        q.add("Aditi");
        q.add("Ajay");
        System.out.println("Head:" + q.element());
        System.out.println("Head:" + q.peek());
        q.forEach((n) -> System.out.println( n + " "));
    }
}

//Output: Head: Aditi
//        Head: Aditi
//        Aditi Amit Ravi Ajay 