public class Shadowing {
    static int x = 90;   //this will be shadowed at line 8
    //global scope within this block
    public static void main(String[] args) {
        System.out.println(x);     //90
        int x=40;   //local scope
        System.out.println(x);     //40
        fun();
    }

    static void fun(){
        System.out.println(x);      //90
    }
}
