import java.util.HashMap;

public class LeetcodeTask {

    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0, d = 0; i < nums.length; i++, d = target - nums[i])
            if (map.containsKey(d) && map.get(d) != i)
                return new int[]{i, map.get(d)};
        return new int[]{};
    }
}


