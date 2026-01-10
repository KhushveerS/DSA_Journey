import java.util.*;
public class NonOverLapping {
    public static void main(String[] args) {
        System.out.println(eraseOverlapIntervals(new int[][]{{1,2},{2,3},{3,4},{1,3}}));
    }
    public static int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        int n=intervals.length;
        int count=0;
        int i=0,j=1;

        while(j<n)
        {
            int cur[]=intervals[i];
            int next[]=intervals[j];

            int cur_start=cur[0];
            int cur_end=cur[1];


            int next_start=next[0];
            int next_end=next[1];

            if(cur_end<=next_start) //safe case
            {
                i=j;
                j++;
            }
            else if(cur_end<=next_end)
            {
                j++;
                count++;
            }
            else if(cur_end>next_end)
            {
                i=j;
                j++;
                count++;
            }
        }
        return  count;
    }
}
