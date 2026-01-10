import java.util.*;
public class PerfectSquare {
    public static void main(String[] args) {

    }
    public int numSquares(int n) {
        // STEP 1
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        // Code here
        return Memo(n,dp);
    }
    public int Memo(int n,int dp[])
    {   // BASE CASE
        if(n==0)
            return 0;

        //STEP 3
        if(dp[n]!=-1)
            return dp[n];
        int ans=n;
        //STEP 2
        for(int i=1;i*i<=n;i++)
        {
            ans=Math.min(ans,1+Memo(n-(i*i),dp));
        }
        dp[n]=ans;
        return dp[n];
    }
}
