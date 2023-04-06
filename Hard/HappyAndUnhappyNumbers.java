package Hard;

import java.util.HashMap;
import java.util.Scanner;

public class HappyAndUnhappyNumbers {
    private static HashMap<Integer, Boolean> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lines = scan.nextInt();

        while (lines > 0) {
            lines--;
            int floor = scan.nextInt();
            int ceil = scan.nextInt();
            int count = 0;

            for (int i = floor; i <= ceil; i++) {
                if (isHappy(i)) {
                    count++;
                }
            }

            System.out.println(count);
        }

        scan.close();
    }

    private static boolean isHappy(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int original = n;
        while (n != 1 && n != 4) { // repeat until happy or unhappy
            int sum = 0;
            while (n > 0) { // calculate sum of squares of digits
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum; // update n for next iteration
        }
        boolean result = n == 1;
        memo.put(original, result);
        return result;
    }
}