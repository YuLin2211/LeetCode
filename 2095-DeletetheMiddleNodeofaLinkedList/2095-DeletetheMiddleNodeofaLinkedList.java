// Last updated: 9/20/2025, 12:10:47 AM
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
    public ListNode deleteMiddle(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        int middle = 0;
        if (head == null || head.next == null) return null;

        while(current != null){
            middle += 1;
            current = current.next;
        }
        middle = middle / 2;
        current = head;
        for(int i = 0; i < middle; i++){
            previous = current;
            current = current.next;
        }
        if(previous != null){
            previous.next = current.next;
        }
        return head;
    }
}