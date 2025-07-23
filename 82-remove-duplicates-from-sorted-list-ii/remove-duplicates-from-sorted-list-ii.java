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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode temp1 = dummy;  
        ListNode temp = head;    

        while (temp != null) {
            boolean isDuplicate = false;

            while (temp.next != null && temp.val == temp.next.val) {
                isDuplicate = true;
                temp = temp.next;  
            }

            if (isDuplicate) {
                temp1.next = temp.next;
            } else {
                temp1 = temp1.next;
            }

            temp = temp.next; 
        }

        return dummy.next;
    }
}
