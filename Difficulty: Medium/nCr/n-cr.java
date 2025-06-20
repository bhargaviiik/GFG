class Solution {
    public int nCr(int n, int r) {
        // code here
        if(r>n)return 0;
        if(r==0||r==n)return 1;
        r=Math.min(r,(n-r));
        long res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i)/(i+1);  //i+1 ensures reverse order=>precise division.. 
        }
        return (int)res;
        }
    }
   