import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetcodeTask {
    public static void main(String[] args) {
    }



    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        int level = 0;
        Queue<Pair<TreeNode,Integer>> q = new LinkedList<>();
        q.offer(new Pair(root,level));
        List<Integer> temp = new ArrayList<>();
        while(!q.isEmpty()){
            while(q.peek() != null && q.peek().getValue() == level){
                TreeNode t = q.poll().getKey();
                temp.add(t.val);
                if(t.left != null) q.offer(new Pair(t.left, level+1));
                if(t.right != null) q.offer(new Pair(t.right, level+1));
            }
            res.add(temp);
            temp = new ArrayList<>();
            level++;
        }
        return res;
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
