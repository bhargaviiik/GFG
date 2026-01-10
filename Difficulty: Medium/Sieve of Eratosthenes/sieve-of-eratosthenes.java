class Solution {
    public int[] sieve(int n) {
        // code here
        List<Integer> ans= new ArrayList<>();
        boolean[] composite = new boolean[n+1];
        int count=0;
        for(int i=2;i<=n;i++){
            if(!composite[i]){
                ans.add(i);
                for(int j=i*i;j<=n;j=j+i){
                    composite[j]=true;
                }
            }
        }
        int[] arr= new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
        }
        return arr;
    }
}