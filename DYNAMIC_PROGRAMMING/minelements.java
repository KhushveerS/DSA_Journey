import java.util.Arrays;

public class minelements {
    public static void main(String[] args) {
        System.out.println(minimumElements(new int[]{1, 2, 3}, 7));
    }

    public static int minimumElements(int num[], int x) {

        int ans = solve(num, x, x);
        return ans;

    }

    public static int solve(int nums[], int target, int x) {
        int dp[] = new int[x+ 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0]=0;

        for (int i = 1; i <= x; i++)// for each value upto x
        {
            for (int j = 0; j < nums.length; j++)//checking for each coin upto n
            {
                if (i - nums[j] >=0 && dp[i-nums[j]] != Integer.MAX_VALUE)
                    dp[i] = Math.min(dp[i], dp[i - nums[j]] + 1);
            }
        }
        if (dp[x] == Integer.MAX_VALUE)
            return -1;
        return dp[x];
    }
}
