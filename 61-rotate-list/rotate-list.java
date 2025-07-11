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
    public ListNode rotateRight(ListNode head, int k) {
    if(k<=0||head==null||head.next==null) return head;
     ListNode temp=head;
     int length=1;
     while(temp.next!=null){
        temp=temp.next;
        length++;
     }   
     temp.next=head;
     int rotate=k%length;
     int skip=length-rotate;
     ListNode newtemp=head;
     for(int i=0;i<skip-1;i++){
         newtemp=newtemp.next;
     }
     head=newtemp.next;
     newtemp.next=null;
     return head;
    }
}