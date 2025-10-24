import java.util.*;
public class houseroober {

    public static void main(String[] args) {
        System.out.println(houseRobber(new int[]{9,9,8,2}));
    }
    public static long houseRobber(int[] valueInHouse) {
        // Write your code here.
        int n=valueInHouse.length;
        long ans=solve(valueInHouse,n);
        return ans;
    }
    public static int solve(int [] nums,int n)
    {
        int dp[]=new int[n];
        dp[0]=nums[0];

        for(int i=1;i<n;i++)
        {
            int include=nums[i];
            if(i>1)
            {
                include=include+dp[i-2];
            }
            int exclude=dp[i-1]+0;
            dp[i]=Math.max(include,exclude);

        }
        return dp[n-1];
    }
}
