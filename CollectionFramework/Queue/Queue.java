import java.util.Queue;
import java.util.LinkedList;

package CollectionFramework.Queue;

public class Queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(2);
        q.add(5);
        // 10 20 2 5
        // F       R
        q.forEach((n) -> System.out.println( n + " "));


        q.remove();
        // 20 2 5
        // F    R
        System.out.println();
        q.forEach((n) -> System.out.println( n + " "));

        q.add(80);
        // 20 2 5 80
        // F       R
        System.out.println();
        q.forEach((n) -> System.out.println( n + " "));
    }
}
