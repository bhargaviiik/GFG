class Solution {
    // Function to return a list of BST elements in a given range.
    public static ArrayList<Integer> printNearNodes(Node root, int low, int high) {
        ArrayList<Integer> arr=new ArrayList<>();
        // code here.
        return helper(root,low,high,arr);
    }
    public static ArrayList<Integer> helper(Node root,int low,int high,ArrayList <Integer> arr){
        if(root==null){
            return arr;
        }
        if(root.data>low && root.data>high){
            helper(root.left,low,high,arr);
        }
        else if(root.data<high && root.data<low){
            helper(root.right,low,high,arr);
        }
        else if(root.data>=low && root.data<=high){
            helper(root.left,low,high,arr);
            arr.add(root.data);
            helper(root.right,low,high,arr);
        }
        return arr;
    }
}