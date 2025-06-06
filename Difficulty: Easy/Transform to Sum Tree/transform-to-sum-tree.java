/*Complete the Given Function

Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=null;
        right=null;
    }
}*/

class Solution {
    public void toSumTree(Node root) {
        // add code here.
        change(root);
    }
    public int change(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=change(root.left);
        int rightSum=change(root.right);
        //before modifying current nodes value,calculating next
        int oldVal=root.data;
        root.data=leftSum+rightSum;
        return oldVal+root.data;
    }
}