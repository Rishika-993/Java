/*
Problem Statement- 

Sample Input:
hello
java


Sample Output:
9(sum)
No(lexicographical order)
Hello Java (capital fisrt sring first letter and add second string with first letter capitalized)
 */


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int length = A.length() + B.length();
        int lexico = A.compareTo(B);
        String order = "No";
        if(lexico>0){
            order = "Yes";
        }
        String Acap = A.substring(0,1).toUpperCase()  + A.substring(1).toLowerCase();
        String Bcap = B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase();
        
        
        System.out.println( length + "\n" + order + "\n" + Acap + " " + Bcap);
    }
}



