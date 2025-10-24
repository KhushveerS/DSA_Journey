import java.util.Arrays;
//https://www.naukri.com/code360/problems/cut-into-segments_1214651?topList=love-babbar-dsa-sheet-problems&leftPanelTab=0&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbar
public class cuttherod {
    public static void main(String[] args) {
        System.out.println(cutSegments(7,5,2,2));
    }
    public static int cutSegments(int n, int x, int y, int z) {
        // Write your code here.

        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int ans = solve(n,x,y,z,dp);
        if(ans<0)
        {
            return 0;
        }
        return ans;
    }
    public static int solve(int n,int x,int y,int z,int dp[])
    {
        if(n==0)
        {
            return 0;
        }
        if(n<0)
        {
            return Integer.MIN_VALUE;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        int a=solve(n-x,x,y,z,dp)+1;
        int b=solve(n-y,x,y,z,dp)+1;
        int c=solve(n-z,x,y,z,dp)+1;
        dp[n]=Math.max(a,Math.max(b,c));
        return dp[n];

    }
}
