import java.util.ArrayList;
import java.util.List;

public class LeetcodeTask {
    public static void main(String[] args) {
    }



    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>()
        if (root!=null) result.add(new ArrayList<>(root.val));
        for (int i = 0; i < ; i++) {

        }
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
