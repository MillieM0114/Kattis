package Easy;

import java.util.Scanner;

public class TwoStones {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println((s.nextInt()%2==0)?"Bob":"Alice");
        s.close();
    }
}