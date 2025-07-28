class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        ArrayList<Integer>[] adj=new ArrayList[V];
        buildAdj(adj,edges);
        boolean[] vis = new boolean[V];
        for(int i=0;i<adj.length;i++){
            if(!vis[i]){
                if(isCycleUtil(i,vis,adj,-1))return true;
            } 
            
        }
        return false;
    }
    void buildAdj(ArrayList<Integer>[] adj,int[][] edges){
        for(int i=0;i<adj.length;i++){
            adj[i]=new ArrayList<>();
        }
        for(int[] edge:edges){
            int u=edge[0],v=edge[1];
            adj[u].add(v);
            adj[v].add(u);
        }
    }
    public boolean isCycleUtil(int i, boolean[] vis, ArrayList<Integer>[] adj,int par){
        vis[i]=true;
        for(int neigh:adj[i]){
            if(vis[neigh]==true && neigh!=par) return true;
            if(!vis[neigh]) if(isCycleUtil(neigh,vis,adj,i)) return true;
        }
        return false;
    }
}