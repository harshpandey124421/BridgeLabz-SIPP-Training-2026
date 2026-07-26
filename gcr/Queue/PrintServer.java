import java.util.ArrayDeque;
import java.util.Deque;

public class PrintServer {
    private Deque<Integer> printQueue = new ArrayDeque<>();

    public void submitJob(int jobId) {
        printQueue.addLast(jobId);
    }

    public void submitUrgentJob(int jobId) {
        printQueue.addFirst(jobId);
    }

    public int printNextJob() {
        if (printQueue.isEmpty()) throw new RuntimeException("No jobs in queue");
        return printQueue.removeFirst();
    }
}