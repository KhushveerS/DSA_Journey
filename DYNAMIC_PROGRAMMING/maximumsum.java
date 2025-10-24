import java.util.*;
public class maximumsum {
    public static void main(String[] args) {
        System.out.println(maximumNonAdjacentSum(new ArrayList<>(List.of(9,9,8,2))));
    }
    public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
        // Write your code here.
        int n=nums.size();
        int dp[]=new int [n];
        Arrays.fill(dp,-1);
        int ans1=solve(nums,n-1);
        int ans2=solve2(nums,n-1,dp);
        int ans=solve3(nums,n);
        return ans;

    }
    // TABULATION(BOTTOM -UP)
    public static int solve3(ArrayList<Integer>nums,int n){
        int dp[]=new int[n];
        dp[0]=nums.get(0);
        for(int i=1;i<n;i++)
        {   int include=nums.get(i);
            if(i>1)
                include=include+dp[i-2];
            int exclude=dp[i-1]+0;
            dp[i]=Math.max(include,exclude);
        }
        return dp[n-1];
    }
    // RECURSION + MEMORIZATION
    public static int solve2(ArrayList<Integer> nums,int n,int dp[])
    {
        if(n<0)
            return 0;
        if(n==0)
        {
            return nums.get(0);
        }
        if(dp[n]!=-1)
            return dp[n];

        int include=solve2(nums,n-2,dp)+nums.get(n);
        int exclude=solve2(nums,n-1,dp)+0;
        dp[n]= Math.max(include,exclude);
        return dp[n];
    }
    // RECURSIVE SOLUTION
    public static int solve(ArrayList<Integer> nums,int n)
    {
        if(n<0)
            return 0;
        if(n==0)
            return nums.get(0);
        int include=solve(nums,n-2)+nums.get(n);
        int exclude=solve(nums,n-1)+0;
        return Math.max(include,exclude);

    }
}
