class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data = data;
        this.next = null;
    }
}
public class cycleTortoiseHare{
    public static boolean iscycle(ListNode head){
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head; //tortoise
        ListNode fast = head; //hare
        while(fast != null && fast.next != null){
            slow= slow.next;
            fast = fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String []args){
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = head.next;

    System.out.println("Cycle : "+iscycle(head));
}
}