//https://leetcode.com/contest/weekly-contest-468/problems/bitwise-or-of-even-numbers-in-an-array/
public class EVEN_OR {
    public static void main(String[] args) {
        System.out.println(evenNumberBitwiseORs(new int[]{1,2,3,4,5,6}));
    }
    public static int evenNumberBitwiseORs(int[] nums) {
        int OREVEN=0;
        for(int it:nums)
        {
            if(it%2==0)
                OREVEN=OREVEN | it;
        }
        return OREVEN;
    }
}
