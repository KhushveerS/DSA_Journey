public class EqualArray {
    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{2,8},new int[]{1,7,3}));
    }
    public static long minOperations(int[] nums1, int[] nums2) {
        long sum=1;
        int n=nums1.length;
        int x=nums2[n];
        int dist=Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            sum =sum+ Math.abs(nums1[i]-nums2[i]);
            int currentDist;
            if (Math.min(nums1[i], nums2[i]) <= x && x <= Math.max(nums1[i], nums2[i])) {
                currentDist = 0;
            } else {
                currentDist = Math.min(Math.abs(x - nums1[i]), Math.abs(x - nums2[i]));
            }

            dist = Math.min(dist, currentDist);
        }
        sum=sum+dist;
        return sum;
    }
}
