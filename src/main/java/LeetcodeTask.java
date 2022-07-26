import java.util.ArrayList;
import java.util.Collections;

public class LeetcodeTask {

    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> values = new ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }
        for (int i = 0; i < values.size() / 2; i++)
            if (values.get(i) != values.get(values.size() - i - 1)) return false;
        return true;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
