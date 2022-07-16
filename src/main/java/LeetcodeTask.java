import java.util.*;
import java.util.Random;
public class LeetcodeTask {

    public static void main(String[] args) {

    }
    public boolean isValidBST(TreeNode root) {
        return validBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private boolean validBST(TreeNode root,int min,int max){
        if (root == null) return true;
        if (root.val<=min||root.val>=max) return false;
        return validBST(root,min,root.val)&&validBST(root,root.val,max);
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

