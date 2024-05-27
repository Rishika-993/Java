package OOPS.classes;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        Integer num = 45;  // treated as an object

        swap(a, b);
        System.out.println(a + " " + b);  //10 20, do not sap because the values are passed by value and not reference

        // final keyword does not allow the value to be changed
        // final int bonus = 2;
        // bonus = 3; // error

        final A rishika = new A("rishika agarwal");
        rishika.name = "Other name";

        //when a non-primitive is final, you can't reassing it
        rishika = new A("new name");  // error

        A obj;

        for(int i = 0; i < 1000000; i++){
            obj = new A("Object" + i);
        } // object is destroyed every time it's a load on memory after the loop ends
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;   
    }

    // but when we pass object, reference value is passed
    // then also on changing int with integer, value is not swapped as in integer definition final keyword is used  
}


// final variables has to be initialized
// always initialize it while declaring it

class A {
    final int a = 10;
    String name;

    public A(String name){
        System.out.println("Object is created");
        this.name = name;
    }

    @override
    protected void finalize() throws Throwable{
        System.out.println("Object is destroyed");
    }   
}