class Solution {
    static boolean isPrime(int n) {
        // code here
        if(n<2)return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++){ //divisors repeat after square root..
            if(n%i==0)return false;
        }
        return true;
    }
}