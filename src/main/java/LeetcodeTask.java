import java.util.HashMap;

public class LeetcodeTask {


    public static void main(String[] args) {
        middleNode(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
    }

    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) {
            return null;
        }
        if(head.next.val == Integer.MAX_VALUE) {
            return head.next;
        }
        int temp = head.val;
        head.val = Integer.MAX_VALUE;
        var result = detectCycle(head.next);
        head.val = temp;
        return result;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }}

