class Solution {
    static int knapsack(int W, int val[], int wt[]) {
        // code here
        int[][] dp=new int[wt.length+1][W+1];
        return helper(0,W,val,wt,dp);
    }
    static int helper(int i,int W,int val[],int wt[],int[][] dp){
        if(i>=wt.length || W==0) return 0;
        if (dp[i][W] != 0) return dp[i][W];
        int value1=0;//we cant init inside if here..
        if(wt[i]<=W){
            //include
            value1=val[i]+helper(i+1,W-wt[i],val,wt,dp); //two varibales affecting calls
        }
        //exclude
        int value2=helper(i+1,W,val,wt,dp);
        return dp[i][W]=Math.max(value1,value2);
    }
}
//we dont do the value accumulation or weight decretion outside the call because 
//wkt every part of code is runned by recursive calls, so it will also be runned by the exclude call which obviously we dont want
//also when we pass indices to recursive calls we can NEVER pass it as it is....or it will be stuck in recursion till stack overflows