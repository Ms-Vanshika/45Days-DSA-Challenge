/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class middleofll {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null){ //terminates at last node(odd)
            if(fast.next.next != null){   //second last node(even)
                slow = slow.next;
                fast = fast.next.next;
            }
            else{
                return slow.next;
            }
        }
        return slow;

    }
}
