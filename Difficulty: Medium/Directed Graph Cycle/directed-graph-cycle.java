class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        boolean[] vis=new boolean[V];
        boolean[] stack=new boolean[V];
        ArrayList<Integer>[] adj=new ArrayList[V];
        buildAdj(edges,adj);
        for(int i=0;i<adj.length;i++){
            if(!vis[i]) if(isCyclicUtil(i,adj,vis,stack)) return true;
        }
        return false;
    }
    void buildAdj(int[][] edges,ArrayList<Integer>[] adj){
        for(int i=0;i<adj.length;i++){
            adj[i]=new ArrayList<>();
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            adj[u].add(v); //only u to v since graph is directed..
        }
    }
    boolean isCyclicUtil(int i,ArrayList<Integer>[] adj,boolean[] vis,boolean[] stack){
        vis[i]=true;
        stack[i]=true;
        for(int neigh:adj[i]){
            if(stack[neigh])return true;
            else{
                if(isCyclicUtil(neigh,adj,vis,stack)) return true;
                stack[neigh]=false;
            } 
        }
        stack[i]=false;
        return false;
    }
}