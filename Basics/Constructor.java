package Basics;

public class Constructor {
    public static void main(String[] args) {
        // A obj = new A(100, 200);
        // obj.show();

        // A r = new A();
        // A r2 = new A(r);
    }
}

class A{
    int x; int y;
    String b;
    double c;

    // default constructor 

    // A(){
    //     x=0; y=0;
    // }

    //parameterized constructor

    // A(int a, int b){
    //     x=a; y=b;
    // }

    //copy constructor

    // A(){
    //     x = 10; b = "Copying";
    //     System.out.println(x + " " + b);
    // }
    // A(A ref){
    //     x = ref.x;
    //     b = ref.b;
    //     System.out.println(x + " " + b);
    // }

    //private constructor

    // private A(){
    //     x=10; c=10.20; b="rishika";
    //     System.out.println(x + " " + c + " " + b);
    // }

    // A obj = new A();     //can only be called in same class and not in other and too in the public class, so have to save the file with A.java to run this
    // if A object created in another class then error will come for private access

    //constructor overloading 
    //create more than one constructor in the same class with different paramenters then it is called constructor overloading
    
    void show(){
        System.out.println(x + " " + y);
    }
}

