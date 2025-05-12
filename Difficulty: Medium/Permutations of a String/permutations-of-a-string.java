//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            ArrayList<String> ans = obj.findPermutation(S);
            Collections.sort(ans);
            for (int i = 0; i < ans.size(); i++) {
                out.print(ans.get(i) + " ");
            }
            out.println();

            out.println("~");
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        ArrayList<String> arr=new ArrayList<>();
        per(s,"",arr);
        Set<String> set=new HashSet<>(arr);
        return new ArrayList<String>(set);
    }
    static void per(String s, String ans,ArrayList<String> arr){
        if(s.length()==0){
            arr.add(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            per(s.substring(0,i)+s.substring(i+1),ans+curr,arr);
        }
        
    } 
}