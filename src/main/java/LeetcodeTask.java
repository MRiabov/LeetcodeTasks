public class LeetcodeTask {

    public static void main(String[] args) {

    }
    public int minCostClimbingStairs(int[] cost) {
        return minCost(cost);
    }

    public int minCost(int[] cost){
        int n = cost.length;
        int one = cost[n-1];
        int two = cost[n-2];

        for(int i = n-3; i>=0 ; i-- ){
            int temp = two;
            two = cost[i] + Math.min(one,two);
            one = temp;
        }

        return Math.min(one,two);
    }
}
