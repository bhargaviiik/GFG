class Solution {
    public Queue<Integer> rearrangeQueue(Queue<Integer> q) {
        // code here
        Queue<Integer> q2 = new LinkedList<>();
        int mid=q.size()/2;
        int c=0;
        while(c<mid){
            q2.add(q.remove());
            c++;
        }
        for(int i=0;i<mid;i++){
            q.add(q2.remove());
            q.add(q.remove());
        }
        return q;
        
    }
}
