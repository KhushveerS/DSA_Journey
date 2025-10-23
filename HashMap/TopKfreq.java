import java.util.*;

public class TopKfreq {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int ans[] = new int[k];

        // Step 1: Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Extract frequencies
        int arr[] = new int[map.size()];
        int c = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            arr[c++] = e.getValue();
        }

        // Step 3: Sort ascending
        Arrays.sort(arr);

        // Step 4: Pick top k frequencies (from the end)
        for (int i = 0; i < k; i++) {
            int freq = arr[arr.length - 1 - i];
            Integer key = getKeyByValue(map, freq);
            ans[i] = key;
            map.remove(key); // remove to avoid duplicates
        }

        return ans;
    }

    // Helper method
    public static <K, V> K getKeyByValue(HashMap<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (Objects.equals(entry.getValue(), value)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
