class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int ans=0;
        Boolean[][] dp= new Boolean[arr.length+1][sum+1];
        return helper(0,arr,sum,ans,dp);
    }
    static boolean helper(int i,int[] arr,int sum,int ans,Boolean[][] dp){
        if(ans==sum)return true;
        if(i>=arr.length || ans>sum) return false;
        if(dp[i][ans]!=null) return dp[i][ans];
        return dp[i][ans]=helper(i+1,arr,sum,ans+arr[i],dp) || helper(i+1,arr,sum,ans,dp);
    }
}