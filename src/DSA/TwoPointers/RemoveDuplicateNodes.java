package DSA.TwoPointers;


public class RemoveDuplicateNodes {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    private static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while ( current !=null && current.next != null){
            if(current.val == current.next.val)
                current.next = current.next.next;
            else
                current = current.next;
        }
        return head;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        ListNode new1 = deleteDuplicates(head);
        while (new1 != null) {
            System.out.print(new1.val);
            if (new1.next != null) System.out.print(" -> ");
            new1 = new1.next;
        }

    }
}
