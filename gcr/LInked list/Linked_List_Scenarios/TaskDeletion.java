// Subtopic: Deletion - Removing a Completed Task from a Task Queue
class Node {
    int val;
    Node next;
    public Node(int val) {
        this.val = val;
    }
}

public class TaskDeletion {
    public static Node removeTask(Node head, int taskId) {
        if (head == null) return null;
        if (head.val == taskId) return head.next;
        
        Node prev = head;
        Node curr = head.next;
        while (curr != null && curr.val != taskId) {
            prev = curr;
            curr = curr.next;
        }
        if (curr != null) {
            prev.next = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        
        head = removeTask(head, 2);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}