class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> list= new ArrayList<>();
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            boolean flag=false; // flag is for every i
            int j=i+1;
            while(j<n){
                if(arr[j]>arr[i]){
                    list.add(arr[j]);
                    flag=true;
                    break;
                    
                }
                j++;
            }
            if(!flag){
                list.add(-1);
            }
        }
        return list;
    }
}