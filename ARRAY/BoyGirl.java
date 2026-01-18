import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class BoyGirl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();

        // Use a Set to store unique characters
        Set<Character> uniqueChars = new HashSet<>();

        // Add each character to the set
        for (char c : username.toCharArray()) {
            uniqueChars.add(c);
        }

        // Check if size is even or odd
        if (uniqueChars.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}