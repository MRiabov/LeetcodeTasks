public class LeetcodeTask {


    public static void main(String[] args) {
    }
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        sum[1]=nums[1];
        for (int i = 1; i < nums.length; i++) {
            sum[i]+=sum[i-1]+nums[i];
        }
        return sum;
    }

}

