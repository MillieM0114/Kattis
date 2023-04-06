import java.util.Scanner;

public class SymmetricOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int setNumber = 1;
        while (true) {
            int n = scan.nextInt();
            if (n == 0) {
                break;
            }
            String[] names = new String[n];
            for (int i = 0; i < n; i++) {
                names[i % 2 == 0 ? i / 2 : n - 1 - i / 2] = scan.next();
            }
            scan.close();
            System.out.printf("SET %d\n%s\n", setNumber++, String.join("\n", names));
        }
    }
}
