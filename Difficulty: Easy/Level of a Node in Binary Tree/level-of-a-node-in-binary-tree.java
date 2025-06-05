class Solution {
    /* Returns level of given data value */
    int getLevel(Node node, int data) {
        // Write your code here
        //parameterized recursion involves leveles which are same for left and right so after it comes back at root to traverse to right idx should be what it was initially at root
        return level(node,data,1);
    }
    int level(Node node,int data,int idx){
        if(node==null){
            return 0;
        }
        else if(node.data==data){
            return idx;
        }
        int a=level(node.left,data,idx+1);
        int b=level(node.right,data,idx+1);
        if(a!=0)return a;
        else return b;
    }
}