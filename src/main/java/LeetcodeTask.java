public class LeetcodeTask {

    public static void main(String[] args) {
        floodFill(new int[][]{{1,1,1},{1,1,0},{1,0,1}},1,1,2);
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        LeetcodeTask.image = image;
        recursionFill(sr, sc, color, image[sr][sc]);
        return LeetcodeTask.image;
    }

    static int[][] image;

    private static void recursionFill(int posX, int posY, int color, int startColor) {
        if (image[posX][posY]!=color&&image[posX][posY] == startColor) {
            image[posX][posY] = color;
            if (posX+1!=image.length) recursionFill(posX+1, posY, color, startColor);
            if (posX-1!=-1) recursionFill(posX-1, posY, color, startColor);
            if (posY+1!=image[0].length) recursionFill(posX, posY+1, color, startColor);
            if (posY-1!=-1) recursionFill(posX, posY-1, color, startColor);
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

