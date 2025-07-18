class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] vis = new boolean[adj.size()];
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<adj.size();i++){
            if(!vis[i]){
                dfsUtil(adj,ans,i,vis);
            }
        }
        return ans;
    }
    ArrayList<Integer> dfsUtil(ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans,int ele,boolean[] vis){
        ans.add(ele);
        vis[ele]=true;
        ArrayList<Integer> vertex=adj.get(ele);
        for(int i=0;i<vertex.size();i++){
            int curr=vertex.get(i);
            if(!vis[curr]) dfsUtil(adj,ans,curr,vis);
        }
        return ans;
    }
}