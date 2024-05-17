package Array;

public class Main {
    int[] ros;   //declaration of array, ros is getting defined in the stack: compile time
    ros = new int[5];     // inititialization: actually here object is being created in the memory (heap): run time
    int rnos = new int[5];
}
