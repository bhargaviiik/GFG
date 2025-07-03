class Solution {
    int maxLen(int arr[]) {
        // code here
        int sum=0;
        //hm:sum,idx
        int length=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if (sum == 0) {
                length = i + 1;
            }
            if(hm.containsKey(sum)){
                length=Math.max(length,i-hm.get(sum));
            }else{
                hm.put(sum,i);
            }
        }
        return length;
    }
}