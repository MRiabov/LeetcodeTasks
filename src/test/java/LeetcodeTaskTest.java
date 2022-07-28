import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LeetcodeTaskTest {
    LeetcodeTask leetcodeTask = new LeetcodeTask();


    @Test
    void longestPalindrome() {
        leetcodeTask.longestPalindrome(new String[]{"em","pe","mp","ee","pp","me","ep","em","em","me"});
    }
}