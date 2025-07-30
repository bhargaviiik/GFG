class Solution {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        //now using bfs(kahs algorithm)
        ArrayList<Integer>[] adj=new ArrayList[V];
        buildAdj(adj,edges);
        int[] indeg=new int[V];
        buildIndeg(adj,indeg);
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0) q.add(i);
        }
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int neigh:adj[curr]){
                if(--indeg[neigh]==0)q.add(neigh);
            }
            ans.add(curr);
        }
        return ans;
    }
    static void buildAdj(ArrayList<Integer>[] adj,int[][] edges){
        for(int i=0;i<adj.length;i++){
            adj[i]=new ArrayList<>();
        }
        for(int j=0;j<edges.length;j++){
            int u=edges[j][0],v=edges[j][1];
            adj[u].add(v);
        }
    }
    static void buildIndeg(ArrayList<Integer>[] adj,int[] indeg){
        for(int i=0;i<adj.length;i++){
            for(int neigh:adj[i]){
                indeg[neigh]++;
            }
        }
    }
}