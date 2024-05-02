//Method overloading
class Student{
    String  name;
    int age;

    public void printInfo(String name){     //using same function for different purposes is polymorphism
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }
}

//inheritance  - when properties and methods of a class are inherited by another class: increases reusability
//(Base class/parent class and child class/subclass)
class Shape{
    String color;
}

class Triangle extends Shape{}

public class OOPS {
    public static void main(String args[]){
        // Student s1 = new Student();
        // s1.name = "Rishika";
        // s1.age = 22;

        // s1.printInfo(s1.age);
        // s1.printInfo(s1.name, s1.age);

        Triangle t1 = new Triangle();
        t1.color = "red";  //shows that Traingle had existing property color from shape
    }
}
