import java.util.*;
class two {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
           map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            int remain=target-nums[i];
            if(map.containsKey(i) && map.get(remain)!=i)
            {
                ans[0]=i;
                ans[i]=map.get(remain);
            }

        }
        return ans;
    }
}
