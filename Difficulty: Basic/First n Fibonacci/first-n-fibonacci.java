//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        // taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        // taking total count of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // taking total number of elements
            int n = sc.nextInt();

            // calling fibonacciNumbers() method
            int[] res = new Solution().fibonacciNumbers(n);

            // printing the elements of the array
            for (int i = 0; i < res.length; i++) System.out.print(res[i] + " ");
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        if(n==1){
            int[] arr={0};
            return arr;
        }
        else if(n==2){
            int[] arr={0,1};
            return arr; 
        }
        
        int[] arr=new int[n];
        return fib(n,arr,2);
        
    }
    static int[] fib(int n,int[] arr,int i){
        arr[0]=0;
        arr[1]=1;
        if(i==n){
            return arr;
            
        }
        arr[i]=arr[i-1]+arr[i-2];
        fib(n,arr,i+1);
        return arr;
    }
}