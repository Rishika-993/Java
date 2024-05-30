package GFG;

//Problem : finding maximum average of subarray of size k, in an array of size n and returning the starting index of the subarray
//Time complexity : O(n)
//Space complexity : O(1)

class Solution {
    int findMaxAverage(int[] arr, int n, int k) {
        
        int sum=0;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        int max = sum;
        int index = 0;
        for(int i=k; i<n-1; i++){
            sum += arr[i];
            sum -= arr[i-k];
            if(sum>max){
                max = sum;
                index = i-k+1;
            }
        }
        return index;
    }
}