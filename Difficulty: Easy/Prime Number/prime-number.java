class Solution {
    static boolean isPrime(int n) {
        // code here
        if(n==1) return false;
        if(n==2 || n==3 || n==5) return true;
        if(n%2==0 || n%3==0 || n%5==0) return false;
        for(int i=5;i*i<=n;i++){
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
}