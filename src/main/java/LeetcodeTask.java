

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
        ListNode futureNode=new ListNode();

        while (list1!=null&&list2!=null){

           if (list1.val<=list2.val) {
               currentNode.val=list1.val;
               currentNode.next=new ListNode(list2.val,new ListNode());
           } else {
               currentNode.val=list2.val;
               currentNode.next=new ListNode(list1.val,new ListNode());
           }
            currentNode=currentNode.next.next;
           list1=list1.next;
           list2=list2.next;
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

