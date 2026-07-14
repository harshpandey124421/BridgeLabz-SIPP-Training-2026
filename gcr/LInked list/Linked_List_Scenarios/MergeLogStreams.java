// Subtopic: Merge - Combining Two Sorted Log Streams
class Node {
    int val;
    Node next;
    public Node(int val) {
        this.val = val;
    }
}

public class MergeLogStreams {
    public static Node mergeLogStreams(Node a, Node b) {
        Node dummy = new Node(0);
        Node tail = dummy;
        while (a != null && b != null) {
            if (a.val <= b.val) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        tail.next = (a != null) ? a : b;
        return dummy.next;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        a.next = new Node(30);
        Node b = new Node(20);
        b.next = new Node(40);
        
        Node merged = mergeLogStreams(a, b);
        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
    }
}