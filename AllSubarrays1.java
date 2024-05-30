import java.util.*;

// implementing amazon's subarray problem with n^3 complexity

public class AllSubarrays1
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
		    arr[i] = sc.nextInt();
		}
		int sum =0;
		
		for(int i=0; i<n; i++){
		    for(int j=0; j<n; j++){
		        for(int k=j; k<n; k++){
		            sum = sum + arr[k];
		        }
		    }

		}
		System.out.println(max);
		
	}
}
