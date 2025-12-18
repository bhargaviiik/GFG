class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> s= new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            int curr= arr[i];
            while(!s.isEmpty() && s.peek()<=curr) s.pop();
            if(s.isEmpty()) ans.add(0,-1);
            else ans.add(0,s.peek());
            s.push(curr);
        }
        return ans;
    }
}