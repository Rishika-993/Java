import java.util.ArrayList;
import java.util.Scanner;

public package CollectionFramework.List;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Enter next 5 elements: ");

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Initial list: " + list);

        list.remove(2);
        System.out.println("After removing element at index 2: " + list);

        list.remove(4);
        System.out.println("After removing element at index 4   : " + list);

        list.add(2, 12);
        System.out.println("After adding element 12 at index 2: " + list);

        list.set(2, 14);
        System.out.println("After setting element 14 at index 2: " + list);

        System.out.println("Element at index 3: " + list.get(3));

        System.out.println("Index of element 2: " + list.indexOf(2));

        System.out.println("Size of list: " + list.size());

        list.clear();
        System.out.println("After clearing list: " + list);
    }
}