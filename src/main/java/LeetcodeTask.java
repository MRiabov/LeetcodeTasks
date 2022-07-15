import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetcodeTask {
    public static void main(String[] args) {
    }

    public int search(int[] nums, int target) {
        int lookup = nums.length / 2;
        while (nums[lookup] != target)
            if (nums[lookup] == target) return lookup;
            else if (nums[lookup] > target) {
                lookup /= 2;
                search(nums, target);
            } else {
                lookup/=2;
                search(nums, target);
            }
    }
}


