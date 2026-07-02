import java.util.PriorityQueue;

public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        long[] seq = new long[n];
        seq[0] = 1;
        PriorityQueue<long[]> heap = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
        for (int i = 0; i < primes.length; i++) {
            heap.add(new long[]{primes[i], primes[i], 0});
        }
        for (int i = 1; i < n; i++) {
            seq[i] = heap.peek()[0];
            while (heap.peek()[0] == seq[i]) {
                long[] entry = heap.poll();
                entry[2]++;
                entry[0] = entry[1] * seq[(int) entry[2]];
                heap.add(entry);
            }
        }
        return (int) seq[n - 1];
    }
}