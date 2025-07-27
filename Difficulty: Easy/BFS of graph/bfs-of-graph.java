import java.util.*;
class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here connected hence no outer loop
        ArrayList<Integer> ans=new ArrayList<>();
        boolean vis[]=new boolean[adj.size()];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!vis[curr]){
                vis[curr]=true;
                ans.add(curr);
                for(int neigh:adj.get(curr)){
                    if(!vis[neigh])q.add(neigh);
                }
            }
        }
        return ans;
    }
}