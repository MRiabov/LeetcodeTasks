public class LeetcodeTask {

    public static void main(String[] args) {

    }

    public int calculateMinimumHP(int[][] dungeon) {
        int[][] dp = new int[dungeon.length][dungeon[0].length];
        dp[dungeon.length - 1][dungeon[0].length - 1] = dungeon[dungeon.length - 1][dungeon[0].length - 1];
        for (int i = dungeon.length - 1; i > 0; i--) {
            dp[i][dungeon[0].length - 1] = (dungeon[i][dungeon[0].length - 1] + dp[i - 1][dungeon[0].length - 1]);
        }

        for (int i = dungeon[0].length - 1; i > 0; i--) {
            dp[dungeon.length - 1][i] = dungeon[dungeon.length - 1][i] + dp[dungeon.length - 1][i - 1];
        }

        for (int i = dungeon.length-2; i >= 0; i--) {
            for (int j = dungeon[0].length-2; j >= 0; j--) {
                dp[i][j] = dungeon[i][j]+Math.max(0,Math.max(dp[i+1][j],dp[i][j+1]));
            }
        }
        return 1-dp[0][0];
    }

//    public int calculateMinimumHP(int[][] dungeon) {
//        //[0][j]&[i][0] are a sum of [0][j-1] and [i-1][0] respectively
//        //we go from the end
//        int[][] dp = new int[dungeon.length][dungeon[0].length];
//        dp[dungeon[0].length][dungeon.length] = dungeon[dungeon[0].length][dungeon.length];
//        for (int i = dungeon.length-1; i > 0; i--) {
//            dp[i][0] = dp[i - 1][0] + dungeon[i][0];
//        }
//        for (int i = dungeon[0].length; i > 0; i--) {
//            dp[dungeon[0].length][i] = dp[dungeon[0].length][i + 1] + dungeon[dungeon[0].length][i];
//        }
//        //health may not go higher than 0, because the knight doesn't care about the bonus when he dies.
//        //then this room's most optimal is the min of bottom and right room.
//        for (int i = dungeon.length-1; i > 0; i--) {
//            for (int j = dungeon[0].length-1; j > 0; j--) {
//                dp[i][j] = Math.max(0, (Math.max(dp[i - 1][j], dp[i][j - 1])+dungeon[i][j]));
//            }
//        }
//        return -dp[dungeon.length - 1][dungeon[0].length - 1]+1;
//    }
}

