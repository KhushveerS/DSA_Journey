//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
public class remove2 {
    public static void main(String[] args) {

        System.out.println(removeDuplicates(new int[]{1,1,1,2,2,3}));

    }

        public static  int removeDuplicates(int[] nums) {
            int i = 0;
            for (int n : nums)
                if (i < 2 || n > nums[i - 2])
                    nums[i++] = n;
            return i;
        }
}
