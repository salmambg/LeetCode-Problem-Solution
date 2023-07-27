public class SubTreeCheck {
    public static boolean isSubtree (tree root, tree subRoot) {
        if (root == null) {
            return subRoot == null;
        }
        if (isSameTree(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private static boolean isSameTree(tree p, tree q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    public static void main(String[] args) {
        tree root = new tree(3);
        root.left = new tree(4);
        root.right = new tree(5);
        root.left.left = new tree(1);
        root.left.right = new tree (2);

        tree subRoot = new tree(4);
        subRoot.left = new tree (1);
        subRoot.right = new tree(2);

        boolean isSubtree = isSubtree(root, subRoot);
        System.out.println("Is subRoot a subtree of root? " + isSubtree);
    }

}
