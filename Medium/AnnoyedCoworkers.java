package Medium;
import java.util.PriorityQueue;
import java.util.Scanner;

public class AnnoyedCoworkers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long nbrHelps = scan.nextInt();
        long nbrCoworkers = scan.nextInt();
        long mostAnnoyed = 0;

        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));

        for (int i = 0; i < nbrCoworkers; i++) {
            int annoyanceLevel = scan.nextInt();
            int addedAnnoyance = scan.nextInt();

            pq.add(new long[] { annoyanceLevel, addedAnnoyance });
            mostAnnoyed = Math.max(mostAnnoyed, annoyanceLevel);
        }
        scan.close();

        while (nbrHelps > 0) {
            nbrHelps--;
            long[] currentEmployee = pq.poll();
            pq.add(new long[] { currentEmployee[0] + currentEmployee[1], currentEmployee[1]});
            mostAnnoyed = Math.max(mostAnnoyed, currentEmployee[0]);
        }

        System.out.println(mostAnnoyed);
    }
}
