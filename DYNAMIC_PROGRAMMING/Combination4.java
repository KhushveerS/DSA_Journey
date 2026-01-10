import java.util.Arrays;

public class Combination4 {
    public static void main(String[] args) {
        System.out.println(findWays(new int[]{1,2,5},5));
    }
    public static int findWays(int num[], int tar) {
        // Write your code here..

        int dp[]=new int[tar+1];
        Arrays.fill(dp,-1);
       return Memo(num,dp,tar);

    }
        public static int Memo(int nums[],int dp[],int tar)
        {
            if(tar<0)
                return 0;
            if(tar==0)
                return 1;
            if(dp[tar]!=-1)
                return dp[tar];
            int ans=0;
            for(int i=0;i<nums.length;i++)
            {
                ans+=Memo(nums,dp,tar-nums[i]);
            }
            dp[tar]=ans;
            return dp[tar];
        }




    //RECURIVE WAY
    public static int solve(int nums[],int tar)
    {
        //BASE CASE
        if(tar<0)
            return 0;
        if(tar==0)
            return 1;

        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            ans+=solve(nums,tar-nums[i]);
        }
        return ans;

    }
}
