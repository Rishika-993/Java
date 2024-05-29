package OOPS.staticExample;

public class Main {
    public static void main(String[] args) {
        Human rishika = new Human(21, "Rishika", 100000, false);
        Human yashi = new Human(21, "Yashi", 100000, false);
    }
    
}

//static variables are shared among all the objects of the class.
//static variables are not dependant on objects
// main is static as we should be able to run main function without creating an object of it