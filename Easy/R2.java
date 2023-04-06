package Easy;

import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int R = scan.nextInt();
        int S = scan.nextInt();
        scan.close();
        System.out.print(2*S - R);
    }
}