

public class LeetcodeTask {


    public static void main(String[] args) {
        ListNode output=mergeTwoLists(new ListNode(1,new ListNode(2,new ListNode(4,null))),
                new ListNode(1,new ListNode(3,new ListNode(4,null))));
        while (output!=null) {
            System.out.println(output.val);
            output=output.next;
        }

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode currentNode=new ListNode();
        ListNode output = currentNode;

        while (list1!=null||list2!=null){
            if (list1==null) {
                currentNode.next = list2;
                list2=list2.next;
            } else if (list2==null){
                currentNode.next=list1;
                list1=list1.next;
            } else if (list1.val>= list2.val){
                currentNode.next=list2;
                list1=list1.next;
            } else {
                currentNode.next=list1;
                list2=list2.next;
            }
            currentNode=currentNode.next;
        }
        return output.next;
}
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }}

