package OOPS.classes;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        Integer num = 45;  // treated as an object

        swap(a, b);
        System.out.println(a + " " + b);  //10 20, do not sap because the values are passed by value and not reference

    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;   
    }

    // but when we pass object, reference value is passed
    // therefore, the values are swapped
}
