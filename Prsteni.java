import java.util.Scanner;

public class Prsteni {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rings = scan.nextInt();

        int[] radii = new int[rings];
        for (int i = 0; i < rings; i++) {
            radii[i] = scan.nextInt();
        }
        scan.close();
        int a = radii[0];
        for (int i = 1; i < rings; i++) {
            int b = radii[i];
            int gcd = Math.abs(gcd(a, b));
            System.out.println(a / gcd + "/" + b / gcd);
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
