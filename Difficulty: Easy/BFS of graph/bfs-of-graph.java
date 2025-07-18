class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans= new ArrayList<>();
        if(adj.size()==0)return ans;
        boolean[] vis=new boolean[adj.size()];
        
        for(int i=0;i<adj.size();i++){
            if(!vis[i]){
                Queue<Integer> q = new LinkedList();
                q.add(i);
                bfsUtil(adj,ans,q,vis);
            }
        }
        return ans;
    }
    static ArrayList<Integer> bfsUtil(ArrayList<ArrayList<Integer>> graph,ArrayList<Integer> list,Queue<Integer> q,boolean[] vis){
        while(!q.isEmpty()){
            int curr=q.poll();
            if(!vis[curr]){
                list.add(curr);
                vis[curr]=true;
                for(int i=0;i<graph.get(curr).size();i++){
                    q.add(graph.get(curr).get(i));
                    
                }
            } 
            
        }
        
       
        return list;
    }
}