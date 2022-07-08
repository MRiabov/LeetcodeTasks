public class LeetcodeTask {


    public static void main(String[] args) {
        int[] i = getSumAbsoluteDifferences(new int[]{2, 3, 5});
    }

    public static int[] getSumAbsoluteDifferences(int[] nums) {
        int[] result = new int[nums.length];
        int length = nums.length;
        int[] prefixSum = new int[length];
        int[] postfixSum = new int[length];

        for (int i = 1; i < length - 1; i++) {
            prefixSum[i]=prefixSum[i-1]+nums[i-1];
        }

        for (int i = length-2; i >= 0 ; i--) {
            postfixSum[i]=postfixSum[i+1]+nums[i+1];
        }

        for (int i = 0; i < length; i++) {
            result[i] = (nums[i] * i) - prefixSum[i]+ postfixSum[i]+(length-1-i)*nums[i];
        }
        return result;
    }
}

