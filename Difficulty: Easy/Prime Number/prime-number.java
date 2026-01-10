class Solution {
    static boolean isPrime(int n) {
        // code here
        //Instead of checking till n, we can check till √n because a larger factor of n must be a multiple of a smaller factor that has been already checked.
        if(n==1) return false;
        if(n==2 || n==3 || n==5) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=6;(i-1)<=(int)Math.sqrt(n);i=i+6){
            if(n%(i-1)==0 || n%(i+1)==0) return false;
        }
        return true;
    }
}