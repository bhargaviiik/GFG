// User function Template for Java

class Solution {
    static String[] findPrefixes(String[] arr, int N) {
        // code here
        String[] ans = new String[N];
        Trie t = new Trie();
        for(String str:arr)t.insert(str);
        for(int i=0;i<ans.length;i++){
            ans[i]=t.unique(arr[i]);
        }
        return ans;
        
    }
    static class Node{
        boolean isRepeated=false;
        char data;
        Node[] child;
        Node(char data){
            this.data=data;
            child = new Node[26];
        }
    }
    static class Trie{
        Node root;
        Trie(){
            root = new Node('.');
        }
        void insert(String str){
            char[] words=str.toCharArray();
            Node temp=this.root;
            for(char c:words){
                int idx=c-'a';
                if(temp.child[idx]==null){
                    Node node = new Node(c);
                    temp.child[idx]=node;
                }else{
                    temp.child[idx].isRepeated=true;
                }
                temp=temp.child[idx];
            }
        }
        String unique(String str){
            Node temp=this.root;
            char[] words=str.toCharArray();
            StringBuilder ans = new StringBuilder();
            for(char c:words){
                if(temp.child[c-'a'].isRepeated==false){
                    ans.append(temp.child[c-'a'].data);
                    break;
                }
                ans.append(temp.child[c-'a'].data);
                temp=temp.child[c-'a'];
            }
            return ans.toString();
        }
    }
};