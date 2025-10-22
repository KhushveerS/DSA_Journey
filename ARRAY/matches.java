//https://leetcode.com/problems/count-of-matches-in-tournament/description/
public class matches {
    public static void main(String[] args) {
        System.out.println(numberOfMatches(14));
    }

        public static int numberOfMatches(int n) {
            int count = 0;
            int adv = n;

            while (adv > 1) {  // keep going until one team remains
                if (adv % 2 == 0) {
                    count += adv / 2;
                    adv = adv / 2;
                } else {
                    count += (adv - 1) / 2;
                    adv = (adv - 1) / 2 + 1;
                }
            }
            return count; // no +1 needed
        }
    }


