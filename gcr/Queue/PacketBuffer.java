public class PacketBuffer {
    private int[] data;
    private int front, count;

    public PacketBuffer(int capacity) {
        data = new int[capacity];
        front = 0;
        count = 0;
    }

    public boolean enqueue(int packetId) {
        if (count == data.length) return false;
        data[(front + count) % data.length] = packetId;
        count++;
        return true;
    }

    public int dequeue() {
        if (count == 0) throw new RuntimeException("Buffer empty");
        int val = data[front];
        front = (front + 1) % data.length;
        count--;
        return val;
    }
}