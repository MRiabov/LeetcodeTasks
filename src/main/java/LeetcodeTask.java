public class LeetcodeTask {

    public static void main(String[] args) {

    }


    public int climbStairs(int n) {
        int num1=1;
        int num2=1;
        int result=2;
        if (n==1) return 1;
        for (int i = 1; i < n; i++) {
            result=num1+num2;
            num1=num2;
            num2=result;
        }
        return result;
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

