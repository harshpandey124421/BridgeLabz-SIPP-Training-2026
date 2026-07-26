public class FastUsernameLookup {
    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    public boolean search(Node root, int target) {
        Node current = root;
        while (current != null) {
            if (target == current.val) return true;
            current = (target < current.val) ? current.left : current.right;
        }
        return false;
    }
}