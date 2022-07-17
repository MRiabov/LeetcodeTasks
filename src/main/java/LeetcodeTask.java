public class LeetcodeTask {

    public static void main(String[] args) {

    }


    public int numIslands(char[][] grid) {
        int result = 0;
        foundGrid = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < foundGrid.length; i++) {
            for (int j = 0; j < foundGrid[0].length; j++) {
                if (grid[i][j]=='\u0001' && !foundGrid[i][j]) {
                    result++;
                    lookup(grid, i, j);
                }
            }
        }
        return result;
    }

    boolean[][] foundGrid;

    private void lookup(char[][] grid, int posX, int posY) {
        if (grid[posX][posY] == '1' && !foundGrid[posX][posY]) {
            foundGrid[posX][posY] = true;
            if (posX + 1 != grid.length) lookup(grid, posX + 1, posY);
            if (posX != 0) lookup(grid, posX - 1, posY);
            if (posY + 1 != grid[0].length) lookup(grid, posX, posY + 1);
            if (posY != 0) lookup(grid, posX, posY - 1);
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

