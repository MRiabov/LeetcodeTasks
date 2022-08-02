import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LeetcodeTaskTest {
    LeetcodeTask leetcodeTask = new LeetcodeTask();


    @Test
    void longestPalindrome() {
        assertTrue(leetcodeTask.isBalanced(new TreeNode(3,
                new TreeNode(9),new TreeNode(20,
                        new TreeNode(15),new TreeNode(7)))));
    }
}