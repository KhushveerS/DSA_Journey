public class sumofsquare {
    public static void main(String[] args) {
        System.out.println(maxSumOfSquares(8, 8));
    }
    public static String maxSumOfSquares(int num, int sum) {
        String ans="";
        int upperbound=0;
        int lowerbound=0;
        for(int i=1;i<=num;i++)
        {
            upperbound=upperbound*10+9;
        }
        for(int i=1;i<num;i++)
        {
            lowerbound=lowerbound*10+9;
        }
        lowerbound=lowerbound+1;
        for(int i=upperbound;i>=lowerbound;i--)
        {
            if(sum(i)==sum)
            {
                ans+=i;
                break;
            }

        }
        return ans;

    }
    public static int sum(int n)
    {   int sum=0;
        for(int i=n;i>0;i=i/10)
        {
            sum=sum+(i%10);
        }
        return sum;
    }
}
