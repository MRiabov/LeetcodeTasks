import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class LeetcodeTask {
    private int min=Integer.MAX_VALUE;
    private int max=0;

    public boolean isBalanced(TreeNode root) {
        return recursiveIsBalanced(root,0);
    }

    private boolean recursiveIsBalanced(TreeNode root, int depth){
        if (root==null) {
            if (max<depth) max=depth;
            if (min>depth) min=depth;
            return max - min < 1;
        }

        return recursiveIsBalanced(root.left,depth+1)&&recursiveIsBalanced(root.right,depth+1);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
