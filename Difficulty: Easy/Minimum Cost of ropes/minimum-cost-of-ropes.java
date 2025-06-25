class Solution {
    public static int minCost(int[] arr) {
        // code here
        int price=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.offer(arr[i]);
        }
        while(!pq.isEmpty()){
            if(pq.size()==1)break;
            int currCost=pq.poll()+pq.poll();
            price+=currCost;
            pq.offer(currCost); //our currCost is same as new ropes length
        }
        return price;
    }
}