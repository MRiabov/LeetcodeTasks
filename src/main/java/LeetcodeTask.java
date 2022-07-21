import java.util.HashMap;

public class LeetcodeTask {

    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) hashMap.put(nums[i],i);
        for (int num:nums) {
            if (hashMap.containsKey(target - num))
                return new int[]{num, hashMap.get(target - num)};
            }
        return new int[]{};
    }
    
}

