// Subtopic: Insertion - Adding a Track to a Playlist Queue
class Node {
    int trackId;
    Node next;
    public Node(int trackId) {
        this.trackId = trackId;
    }
}

public class PlaylistInsertion {
    public static void insertAfter(Node current, int trackId) {
        if (current == null) return;
        Node newNode = new Node(trackId);
        newNode.next = current.next;
        current.next = newNode;
    }

    public static void main(String[] args) {
        Node track1 = new Node(101);
        Node track2 = new Node(102);
        track1.next = track2;
        
        insertAfter(track1, 105);
        System.out.println(track1.trackId + " -> " + track1.next.trackId + " -> " + track1.next.next.trackId);
    }
}