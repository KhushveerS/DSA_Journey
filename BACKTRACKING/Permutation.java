public class Permutation {
    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        System.out.println("All permutations of " + str + ":");
        permute(str, 0, n - 1);
    }

    // Function to print all permutations
    public static void permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i); // Swap current index with i
                permute(str, l + 1, r); // Recurse for next index
                str = swap(str, l, i); // Backtrack (restore original string)
            }
        }
    }

    // Helper function to swap characters at position i and j
    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
