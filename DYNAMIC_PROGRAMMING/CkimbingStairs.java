//https://www.naukri.com/code360/problems/count-ways-to-reach-nth-stairs_798650?leftPanelTab=0&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbar
import java.util.Arrays;
public class CkimbingStairs {
    static final long MOD = 1000000007;
    public static void main(String[] args) {

        System.out.println(countDistinctWayToClimbStair(99));
    }
    public static long countDistinctWayToClimbStair(int nStairs) {
        // Write your code here.
       // long ans=solve(nStairs,nStairs);
//        long dp[]=new long[nStairs+1];
//        Arrays.fill(dp,-1);
//        long ans=solve2(nStairs,nStairs,dp);
//
        long ans=solve3(nStairs);
        return ans;

    }
    public static long solve3(int stairs)
    {
        if(stairs==0 || stairs==1)
            return 1;
        long left=1;// for 0
        long right=1;//for 1
        long cur = 0;
        for(int i=2;i<=stairs;i++)
        {
            cur=(left+right)%MOD;
            left = right;  // move window forward
            right = cur;
        }
        return cur;
    }
    public static  long solve2(int nsatirs,int n,long dp[])
    {
        //Base Case
        if(n==0)
            return 1;
        if(n==1)
            return 1;
        if(dp[n]!=-1)
            return dp[n];
        long left=solve2(nsatirs,n-1,dp)%MOD;
        long right=solve2(nsatirs,n-2,dp)%MOD;
        dp[n]=(left+right)%MOD;
        return dp[n];
    }
    public static long solve(int nstarirs,int n){
        //base case
        if(n==0)
            return 1;
        if(n==1)
            return 1;

        return solve(nstarirs,n-1)+solve(nstarirs,n-2);

    }
}
