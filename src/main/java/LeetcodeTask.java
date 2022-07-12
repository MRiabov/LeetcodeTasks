

public class LeetcodeTask {


    public static void main(String[] args) {
        middleNode(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5))))));
    }

    public static ListNode middleNode(ListNode head) {
        boolean even=false;
        ListNode output=head;
        for (ListNode currentNode = head; currentNode!=null;currentNode=currentNode.next) {
            if (even) output=output.next;
            even=!even;
        }
        return output;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }}

