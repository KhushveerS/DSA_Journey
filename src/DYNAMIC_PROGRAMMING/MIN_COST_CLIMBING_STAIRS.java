package DYNAMIC_PROGRAMMING;

public class MIN_COST_CLIMBING_STAIRS {
    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{10,15,20}));
    }
    public static int minCostClimbingStairs(int[] cost) {
        int n=cost.length;


        return solve(cost,n);
    }
    public static int solve(int cost[],int n)
    {
        int prev2=cost[0];
        int prev1=cost[1];

        for(int i=2;i<n;i++)
        {
            int curr=cost[i]+Math.min(prev1,prev2);
            prev2=prev1;
            prev1=curr;
        }
        return Math.min(prev1,prev2);
    }
}
