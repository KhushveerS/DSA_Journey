import java.util.*;
class two {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(target - nums[i], nums[i]);
        }
        return ans;
    }
}
