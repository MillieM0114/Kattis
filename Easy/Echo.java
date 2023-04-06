package Easy;
import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.println(input);
        }
        scan.close();
    }
}
