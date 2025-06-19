// User function Template for Java

class Solution {
    public int nthFibonacci(int n) {
        // code here
        if(n==0||n==1)return n; //n in if is for that level of no.
        return nthFibonacci(n-1)+nthFibonacci(n-2);//for 2 itll be 1+0
    }
}