class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans=new ArrayList<>();
        boolean[] vis=new boolean[adj.size()];
        for(int i=0;i<adj.size();i++){
            if(!vis[i]){
                dfsUtil(i,adj,vis,ans);
            }
        }
        return ans;
        
    }
    void dfsUtil(int i,ArrayList<ArrayList<Integer>> adj,boolean[] vis,ArrayList<Integer> ans){
        vis[i]=true;
        ans.add(i); //every node is getting added to the list
        for(int neigh:adj.get(i)){
            if(!vis[neigh]){
                dfsUtil(neigh,adj,vis,ans);
            }
        }
    }
}