package Medium;

import java.util.Scanner;

public class AListGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), k = 0;
        scan.close();
        for (int i = 2; i <= Math.sqrt(x); i++)
            while (x % i == 0) { x /= i; k++; }
        System.out.println(x > 1 ? k + 1 : k);
    }
}