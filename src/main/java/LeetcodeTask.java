import java.util.Arrays;

public class LeetcodeTask {

    public static void main(String[] args) {
        floodFill(new int[][]{{1,1,1},{1,1,0},{1,0,1}},1,1,2);
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        LeetcodeTask.image = image;
        recursionFill(sr, sc, color, image[sr][sc]);
        System.out.println(Arrays.deepToString(image));
        return LeetcodeTask.image;
    }

    static int[][] image;

    private static boolean recursionFill(int posX, int posY, int color, int startColor) {
        if (posX != 3 || posX != -1 || posY != 3 || posY != -1 || image[posX][posY] == startColor) {
            image[posX][posY] = color;
            return recursionFill(posX+1, posY, color, startColor)&&
                    recursionFill(posX-1, posY, color, startColor)&&
                    recursionFill(posX, posY+1, color, startColor)&&
                    recursionFill(posX, posY-1, color, startColor);
        } else return true;
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

