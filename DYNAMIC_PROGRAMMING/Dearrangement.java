import java.util.*;
//https://www.naukri.com/code360/problems/count-derangements_873861?leftPanelTab=0&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbar
public class Dearrangement {
     static final long MOD= 1000000007;
    public static void main(String[] args) {
        System.out.println(countDerangements(4));
    }
    public static long countDerangements(int n) {
        // Write your code here.
        long dp[]=new long[n+1];
        Arrays.fill(dp,-1);
        long ans = solveMemo(n,dp);
        return ans;
    }
    public static long solveMemo(int n,long dp[])
    {
        if(n==1)
            return 0;
        if(n==2)
            return 1;

        if(dp[n]!=-1)
        {
            return dp[n];
        }
        dp[n]=((n-1)*((solveMemo(n-2,dp)%MOD)+(solveMemo(n-1,dp))%MOD))%MOD;
        return dp[n];
    }
}
