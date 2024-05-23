package OOPS.classes;

public class Main {
    public static void main(String[] args) {

        //store 5 roll nos
        int[] numbers = new int[5];

        //store 5 names
        String[] names = new String[5];

        //data of 5 students:{rollno, name, marks}
        int[] rollno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student students = new Student();
        // System.out.println(Arrays.toString(students);     --returns every value to be null

        Student rishika;  // ---declaration---
        // A class is a named group of properties and methods
        // A class is a template of an object and an object is an instance of a class
        // A class is a logical construct and  an object is a physical reality and occupies space in memory
        // A class is a user defined data type and an object is a variable of that data type
        // A class is a blueprint for an object

        rishika = new Student();  // ---instantiation---   dynamically allocates memory
    }
}

//create a class named as Student
// for every single student 

class Student{
    int rollno;
    String name;
    float marks;
}