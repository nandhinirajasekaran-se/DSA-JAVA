package DSA.TwoPointers;


public class RemoveAllDuplicateNodes {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    private static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode current = head;

        while ( current !=null) {
            boolean isDuplicate = false;
            while ( current.next !=null && current.val == current.next.val) {
                current = current.next;
                isDuplicate = true;
            }
            if(isDuplicate){
                prev.next = current.next;
            }else {
                prev = prev.next;
            }
            current = current.next;
        }
        return dummy.next;
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
