import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LeetcodeTaskTest {
    LeetcodeTask leetcodeTask = new LeetcodeTask();

    @Test
    void removeNthFromEnd() {
        leetcodeTask.isPalindrome(new ListNode(1,new ListNode(2,new ListNode(2,new ListNode(1,null)))));
    }

}