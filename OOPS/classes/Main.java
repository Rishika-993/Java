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

        Student rishika;  // ---declaration---                 statically allocates memory at compile time 
        // A class is a named group of properties and methods
        // A class is a template of an object and an object is an instance of a class
        // A class is a logical construct and  an object is a physical reality and occupies space in memory
        // A class is a user defined data type and an object is a variable of that data type
        // A class is a blueprint for an object

        rishika = new Student();  // ---instantiation---   dynamically allocates memory at runtime
        System.out.println(rishika);  //OOPS.classes.Student@1b6d3586
        System.out.println(rishika.rollno);  //0
        System.out.println(rishika.name);  //null   
        System.out.println(rishika.marks);  //0.0

        // A constructor is a speacial function that runs when you create an object and it allocates some variables

        Student yashi = new Student(13, "Yashi", 90.0f);
    }
}

//create a class named as Student
// for every single student 

class Student{
    int rollno;
    String name;
    float marks;

    //default constructor
    // we need a way to add the values to the above
    
    // we need one word to access every object

    Student(){
        this.rollno = 13;
        this.name = "rishika agarwal";
        this.marks = 88f;
    }   

}