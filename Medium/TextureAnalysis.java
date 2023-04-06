package Medium;
import java.util.Scanner;

public class TextureAnalysis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lineNbr = 1;

        while (true) {
            String input = scan.nextLine();

            if (input.equals("END")) {
                break;
            }

            String[] segments = input.split("\\*", -1);
            boolean even = true;

            for (int j = 2; j < segments.length - 1; j++) {
                if (segments[j].length() != segments[1].length()) {
                    even = false;
                    break;
                }
            }

            System.out.println(lineNbr + (even ? " EVEN" : " NOT EVEN"));
            lineNbr++;
        }
        scan.close();
    }
}