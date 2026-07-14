// Subtopic: Find the Middle - Picking a Midpoint Server in a Relay Chain
class Node {
    int val;
    Node next;
    public Node(int val) {
        this.val = val;
    }
}

public class ServerMidpoint {
    public static Node findMiddleServer(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        
        Node mid = findMiddleServer(head);
        if (mid != null) System.out.println("Middle Server: " + mid.val);
    }
}