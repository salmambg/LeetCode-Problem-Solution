public class treeNode {
    public int val;
    public treeNode left;
    public treeNode right;

    public treeNode (int x) {
        val = x;
        left = null;
        right = null;
    }
    public static void inOrderTraversal(treeNode root) {
        //terminating condition
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);


        System.out.print(root.val + " -> ");

        //print the root node
        inOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        treeNode root = new treeNode(2);
        root.left = new treeNode(5);
        root.right = new treeNode(8);

        inOrderTraversal(root);
    }
}
