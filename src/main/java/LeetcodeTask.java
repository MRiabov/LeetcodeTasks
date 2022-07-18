public class LeetcodeTask {

    public static void main(String[] args) {

    }


    public int fib(int n) {
        int num1=0;
        int num2=1;
        int fibonacci=1;
        for (int i=1;i<n;i++){
            fibonacci=num1+num2;
            num1=num2;
            num2=fibonacci;
        }
        return fibonacci;
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

