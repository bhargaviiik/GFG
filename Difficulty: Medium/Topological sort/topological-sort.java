class Solution {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        boolean[] vis=new boolean[V];
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer>[] adj=new ArrayList[V];
        ArrayList<Integer> ans=new ArrayList<>();
        buildAdj(adj,edges);
        for(int i=0;i<adj.length;i++){
            if(!vis[i]) topoSortUtil(i,adj,vis,s);
        }
        while(!s.isEmpty()){
            ans.add(s.pop());
        }
        return ans;
        
    }
    static void buildAdj(ArrayList<Integer>[] adj,int[][]edges){
        for(int i=0;i<adj.length;i++){
            adj[i]=new ArrayList<>();
        }
        for(int[] edge:edges){
            int u=edge[0],v=edge[1];
            adj[u].add(v);
        }
    }
    static void topoSortUtil(int i,ArrayList<Integer>[] adj,boolean[] vis,Stack<Integer> s){
        vis[i]=true;
        for(int neigh:adj[i]){
            if(!vis[neigh]) topoSortUtil(neigh,adj,vis,s);
        }
        s.add(i);
    }
}