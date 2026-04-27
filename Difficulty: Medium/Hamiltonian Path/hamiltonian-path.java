// User function Template for Java
class Solution {
    boolean check(int n, int m, ArrayList<ArrayList<Integer>> edges) {
        // code here
        HashMap<Integer,ArrayList<Integer>> map= new HashMap<>();
        for(int i=0;i<edges.size();i++){
            int u= edges.get(i).get(0);
            int v= edges.get(i).get(1);
            if(map.containsKey(u)) map.get(u).add(v);
            else{
                map.put(u, new ArrayList<>());
                map.get(u).add(v);
            }
            if(map.containsKey(v)) map.get(v).add(u);
            else{
                map.put(v, new ArrayList<>());
                map.get(v).add(u);
            }
        }
        for(int u:map.keySet()){
            HashSet<Integer> visited = new HashSet<>();
            visited.add(u);
            if(helper(u,map,visited,n))return true;
        }
        return false;
        
    }
    boolean helper(int u,HashMap<Integer,ArrayList<Integer>> map,HashSet<Integer> visited,int size){
        if(visited.size()==size) return true;
        ArrayList<Integer> list= map.get(u);
        for(int i=0;i<list.size();i++){
            int v= list.get(i);
            if(!visited.contains(v)){
                visited.add(v);
                if(helper(v,map,visited,size))return true;
                visited.remove(v);
            }
        }
        return false;
    }
}