public class LeetcodeTask {

    public static void main(String[] args) {

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //repeat until they come at a node where one will be bigger and one will be smaller.
        while (root!=null) {
            if (q.val<root.val && p.val<root.val) root=root.left;
            else if (q.val>root.val && p.val>root.val) root=root.right;
            else return root;
        }
        return null;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

