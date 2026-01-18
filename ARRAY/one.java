import java.util.*;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Check if input exists to avoid errors on empty input
        if (sc.hasNextInt()) {
            int t = sc.nextInt(); // Number of test cases
            System.out.println();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                boolean possible = true;

                // Calculate the parity of the first element (value + index)
                int targetParity = (a[0] + 0) % 2;

                // Check if all other elements share the same parity relationship
                for (int i = 1; i < n; i++) {
                    if ((a[i] + i) % 2 != targetParity) {
                        possible = false;
                        break;
                    }
                }

                if (possible) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}