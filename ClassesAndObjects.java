class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println(this.color);  //tells which object is trying to access that method
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}


public class ClassesAndObjects {
    public static void main(String args[]){
        Pen pen1 = new Pen();   //this pen like fuction which creates object pen is called constructor, methods that just creates objects and do not return anything and do not have any return type
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();


        Student s1 = new Student("Rishika", 22);
        s1.printInfo();
    }
}
