public class LeetcodeTask {


    public static void main(String[] args) {
        pivotIndex(new int[]{-1,-1,0,1,1,0});
    }
    public static int pivotIndex(int[] nums) {
        int length=nums.length;
        int[] sum = new int[length];
        int[] reverseSum = new int[length];

        for (int i = 1; i < length; i++) {
            sum[i]=sum[i-1]+nums[i-1];
        }
        for (int i = length-2; i >= 0; i--) {
            reverseSum[i]= reverseSum[i+1]+nums[i+1];
        }
        for (int i = 0; i < length; i++) {
            if (sum[i]==reverseSum[i]) {
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }

}

