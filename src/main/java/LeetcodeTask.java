import java.lang.reflect.Array;

public class LeetcodeTask {


    public int[] findBall(int[][] grid) {
        int[] result = new int[grid[0].length];

        for (int currentBall = 0; currentBall < grid[0].length; currentBall++) {
            int posX = currentBall;
            for (int[] currentLevel : grid) {
                if (currentLevel[posX] == 1) {
                    if (posX + 1 != grid[0].length && currentLevel[posX + 1] == 1) posX++;
                    else {
                        return -1;
                    }
                } else if (posX - 1 != -1 && currentLevel[posX - 1] == -1) posX--;
                else return -1;
            }
            return posX;
        }
        return result;
    }

    private int calculateBall(int[][] grid, int currentBall) {
        int posX = currentBall;
        for (int[] currentLevel : grid) {
            if (currentLevel[posX] == 1) {
                if (posX + 1 != grid[0].length && currentLevel[posX + 1] == 1) posX++;
                else {
                    return -1;
                }
            } else if (posX - 1 != -1 && currentLevel[posX - 1] == -1) posX--;
            else return -1;
        }
        return posX;
    }
}


// for (int y = 0; y < grid.length; y++) {
//            for (int x = 0; x < grid[0].length; x++) {
//                if (grid[y][x]==1){
//                    if (x+1!=grid[0].length&&grid[y][x+1]==1)
//                } else {
//
//                }
//            }
//        }