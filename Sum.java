/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Sum {
    public static void main(String args[]){
        sum1();
        int ans = sum2();
        System.out.println(ans);

        int ans2 = sum3(20, 30);
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.next();
        String personalized = myGreet("Rishika Agarwal");
        personalized = myGreet(name);
        System.out.println(personalized);
        in.close();
    }
    static String myGreet(String name){
    String message = "Hello" + name;
    return message;

}

static  int sum3(int a, int b){
    int sum =  a + b;
    return sum;
}


static void sum1(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number 1:");
    int n1 = scan.nextInt();
    System.out.println("Enter number 2:");
    int n2 = scan.nextInt();
    int sum = n1 + n2;
    System.out.println(sum);        //void print some value(of undetermined) format and can't return a value
}

static int sum2(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number 1:");
    int n1 = scan.nextInt();
    System.out.println("Enter number 2:");
    int n2 = scan.nextInt();
    int sum = n1 + n2;
    return sum;                    // int returns vlaue of int type and after a return vale funtion is finished and nothing can be done after it, finish line
    //for specified return types declared at defintion of funtion, it has to return that datatype value
}
    
}





