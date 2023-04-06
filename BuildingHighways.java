import java.util.Arrays;
import java.util.Scanner;

public class BuildingHighways {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cities = scan.nextInt();
        long[] problematicLevels = new long[cities];

        for (int i = 0; i < cities; i++) {
            problematicLevels[i] = scan.nextLong();
        }
        scan.close();

        long min = Arrays.stream(problematicLevels).min().getAsLong();
        long sum = Arrays.stream(problematicLevels).sum();

        System.out.println(sum + min * (cities - 2));

    }
}