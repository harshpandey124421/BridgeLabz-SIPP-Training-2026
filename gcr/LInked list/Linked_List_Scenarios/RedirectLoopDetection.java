// Subtopic: Cycle Detection - Catching an Infinite Redirect Loop
class Node {
    String url;
    Node next;
    public Node(String url) {
        this.url = url;
    }
}

public class RedirectLoopDetection {
    public static boolean hasRedirectLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Node a = new Node("URL_A");
        Node b = new Node("URL_B");
        Node c = new Node("URL_C");
        a.next = b;
        b.next = c;
        c.next = a;
        
        System.out.println("Loop detected? " + hasRedirectLoop(a));
    }
}