public class FolderTreeDeletion {
    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    void deleteFolderTree(Node node) {
        if (node == null) return;
        deleteFolderTree(node.left);
        deleteFolderTree(node.right);
        deleteNode(node);
    }
    
    private void deleteNode(Node node) {
        node.left = null;
        node.right = null;
    }
}