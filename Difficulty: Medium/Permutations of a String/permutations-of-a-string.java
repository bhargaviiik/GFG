class Solution {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        Set<String> set=new HashSet<>();
        helper(s,"",set);
        ArrayList<String> arr=new ArrayList<>(set);
        return arr;
    }
    public void helper(String str,String ans,Set<String> set){
        if(str.length()==0){
            set.add(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            helper(newStr,ans+curr,set);
        }
    }
}