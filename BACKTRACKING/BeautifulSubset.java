import java.util.HashMap;

public class BeautifulSubset {
    public int beautifulSubsets(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return solve(0, nums, map, k) - 1; // Subtract 1 to exclude empty subset
    }

    public int solve(int idx, int nums[], HashMap<Integer, Integer> map, int k) {
        if (idx >= nums.length) {
            return 1;
        }

        int result = 0;

        // NOT TAKE the current element
        result += solve(idx + 1, nums, map, k);

        // TAKE the current element (if valid)
        int current = nums[idx];

        // Check if we can take current element without violating the condition
        if (!map.containsKey(current - k) && !map.containsKey(current + k)) {
            // Add current element to map
            map.put(current, map.getOrDefault(current, 0) + 1);

            // Recursively process next elements
            result += solve(idx + 1, nums, map, k);

            // Backtrack: remove current element
            map.put(current, map.get(current) - 1);
            if (map.get(current) == 0) {
                map.remove(current);
            }
        }

        return result;
    }
}
