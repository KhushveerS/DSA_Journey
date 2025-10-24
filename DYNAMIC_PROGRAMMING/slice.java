import java.util.*;
public class slice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            String query = sc.next();
            int[] arr = new int[q];
            for (int j = 0; j < q; j++) arr[j] = sc.nextInt();

            for (int c : arr) {
                int time = 0;
                while (c > 0) {
                    for (int k = 0; k < query.length() && c > 0; k++) {
                        char ch = query.charAt(k);
                        if (ch == 'A') c -= 1;
                        else c /= 2;
                        time++;
                    }
                }
                System.out.println(time);
            }
        }
    }


}
