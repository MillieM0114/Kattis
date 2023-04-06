import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DiskFragmentation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(br);
        Deque<String> diskBlockQueue = new ArrayDeque<>();
        String currentDiskBlock;
        String input = "";
        int rowLength = 0;
        int starsInRow = 0;
        int rowOffset = 0;

        while (scan.hasNextLine()) {
            input = scan.nextLine();
            if (input.isEmpty()) {
                diskBlockQueue.offer(input);
                input = scan.nextLine();
                if (input.isEmpty()) {
                    break;
                }
            }
            diskBlockQueue.offer(input);
        }

        while (!diskBlockQueue.isEmpty()) {

            currentDiskBlock = diskBlockQueue.poll();

            if (currentDiskBlock.isEmpty()) {
                rowLength = 0;
                starsInRow = 0;
                rowOffset = 0;

                System.out.println(diskBlockQueue.isEmpty() ? "" : "\n");
            } else {
                rowLength = currentDiskBlock.length();
                starsInRow = currentDiskBlock.replaceAll("[^*]", "").length();

                for (int i = 0; i < rowLength - starsInRow - rowOffset; i++) {
                    System.out.print(".");
                }

                for (int i = 0; i < starsInRow; i++) {
                    System.out.print("*");
                }

                for (int i = 0; i < rowOffset; i++) {
                    System.out.print(".");
                }
                rowOffset += starsInRow;

                System.out.println();
            }
        }
        scan.close();
    }
}
