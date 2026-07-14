// Subtopic: Reverse - Reversing a Browser Back-Button History Stack
class Node {
    int val;
    Node next;
    public Node(int val) {
        this.val = val;
    }
}

public class BrowserHistoryReverse {
    public static Node reverseHistory(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        
        Node reversed = reverseHistory(head);
        while (reversed != null) {
            System.out.print(reversed.val + " ");
            reversed = reversed.next;
        }
    }
}