package Easy;
import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine().replaceAll("[^A-Z]", "");
        scan.close();

        System.out.println(input);
    }
}
