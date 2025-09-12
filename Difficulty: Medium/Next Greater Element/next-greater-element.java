class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        Stack<Integer> s= new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            ans.add(-1);
        }
        for(int i=arr.length-1;i>=0;i--){
            int curr=arr[i];
            while(s.isEmpty()==false && s.peek()<=curr) s.pop();
            if(s.isEmpty()){
                s.push(arr[i]);
                continue;
            }
            ans.set(i,s.peek());
            s.push(arr[i]);
        }
        return ans;
    }
}